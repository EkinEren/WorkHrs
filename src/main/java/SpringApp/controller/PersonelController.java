package SpringApp.controller;

import SpringApp.model.PersonelEntity;
import SpringApp.model.PersonelReport;
import SpringApp.model.PtsGiriscikisEntity;
import SpringApp.repository.GirisCikisRepository;
import SpringApp.repository.PersonelRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Date;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.YearMonth;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;


@Controller
public class PersonelController {

    private PersonelRepository personelRepository;

    private GirisCikisRepository girisCikisRepository;

    public PersonelController(PersonelRepository personelRepository,GirisCikisRepository girisCikisRepository) {
        this.personelRepository = personelRepository;
        this.girisCikisRepository = girisCikisRepository;
    }

    @ModelAttribute("personel")
    public PersonelEntity setup() {
        return new PersonelEntity();
    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public ModelAndView showForm(){
        return new ModelAndView("test", "command", new PersonelEntity());
    }


    @PostMapping(value = "test/personel")
    public String findPersonel(@ModelAttribute("PersonelEntity")PersonelEntity personelEntity, @RequestParam(name = "tarih") String tarih, ModelMap model) throws ParseException {

        PersonelEntity personel = this.personelRepository.findByKartno(personelEntity.getKartno());

        List<PersonelReport> reports = new ArrayList<>();

        String[] tarihArray = tarih.split("/");
        String month = tarihArray[0];
        String year = tarihArray[1];

        YearMonth date = YearMonth.of(Integer.parseInt(year),Integer.parseInt(month));

        LocalDate startOfMonth = date.atDay(1);
        LocalDate endOfMonth = date.atEndOfMonth().plusDays(1);

        /* Maybe these should be methods in the service layer? */
        /*Çalışanın o ay için giriş çıkış bilgileri*/
        for (LocalDate d = startOfMonth; d.isBefore(endOfMonth); d = d.plusDays(1)) {

            List<PtsGiriscikisEntity> day = girisCikisRepository
                    .findAllByCikistarihiAndPersonelidOrderByGirissaati(Date.valueOf(d),personel.getId());

            if(day.isEmpty()) {continue;}

            LocalTime netSure = LocalTime.of(0,0,0);

            for(PtsGiriscikisEntity item: day){
                if(item.getCikissaati() != null && item.getGirissaati() != null){
                    LocalTime min = item.getCikissaati().toLocalTime().minusNanos(item.getGirissaati().toLocalTime().toNanoOfDay());
                    netSure = netSure.plusNanos(min.toNanoOfDay());
                }
            }

            LocalTime girisSaati = day.get(0).getGirissaati() != null ? day.get(0).getGirissaati().toLocalTime() : LocalTime.of(0,0,0);
            LocalTime cikisSaati = day.get(day.size() - 1).getCikissaati() !=null ? day.get(day.size() - 1).getCikissaati().toLocalTime() : LocalTime.of(0,0,0);
            PersonelReport p = new PersonelReport(d,girisSaati,cikisSaati,netSure);

            /*Dışarıda geçirilen süre 1 saaten az ise 1 saat olarak farz edilip net süre hesaplanırken toplam süreden çıkarılacaktır. */
            if (p.getDisariSure().isBefore(LocalTime.of(1,0))) {

                LocalTime disari = LocalTime.of(1,0).minusNanos(p.getDisariSure().toNanoOfDay());
                p.setNetSure(netSure.minusNanos(disari.toNanoOfDay()));
                p.setEksikFazlaCalisma(p.getEksikFazlaCalisma().minusNanos(disari.toNanoOfDay()));
            }

            reports.add(p);
        }

        Locale locale = Locale.getDefault();


        /* Haftalar halinde çalışanın giriş çıkış bilgileri */
        List<PersonelReport> week1 = reports.stream().filter(p -> p.getTarih().get(WeekFields.of(locale).weekOfMonth()) == 1).collect(Collectors.toList());
        List<PersonelReport> week2 = reports.stream().filter(p -> p.getTarih().get(WeekFields.of(locale).weekOfMonth()) == 2).collect(Collectors.toList());
        List<PersonelReport> week3 = reports.stream().filter(p -> p.getTarih().get(WeekFields.of(locale).weekOfMonth()) == 3).collect(Collectors.toList());
        List<PersonelReport> week4 = reports.stream().filter(p -> p.getTarih().get(WeekFields.of(locale).weekOfMonth()) == 4).collect(Collectors.toList());
        List<PersonelReport> week5 = reports.stream().filter(p -> p.getTarih().get(WeekFields.of(locale).weekOfMonth()) == 5).collect(Collectors.toList());


        model.addAttribute("kartno",personel.getKartno());
        model.addAttribute("id",personel.getId());
        model.addAttribute("ad",personel.getAd());
        model.addAttribute("soyad",personel.getSoyad());
        model.addAttribute("tarih",tarih);
        model.addAttribute("hafta1",week1);
        model.addAttribute("hafta2",week2);
        model.addAttribute("hafta3",week3);
        model.addAttribute("hafta4",week4);
        model.addAttribute("hafta5",week5);

        return "personel";
    }
}