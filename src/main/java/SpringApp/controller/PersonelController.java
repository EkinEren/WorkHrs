package SpringApp.controller;

import SpringApp.model.PersonelEntity;
import SpringApp.model.PtsGiriscikisEntity;
import SpringApp.repository.GirisCikisRepository;
import SpringApp.repository.PersonelRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.util.List;
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
    public String findPersonel(@ModelAttribute("PersonelEntity")PersonelEntity personelEntity, ModelMap model){

        PersonelEntity personel = this.personelRepository.findByKartno(personelEntity.getKartno());

        List<PtsGiriscikisEntity> times = this.girisCikisRepository.findAllByPersonelid(personel.getId());

        //List<PtsGiriscikisEntity> personelTimes = this.girisCikisRepository.findAllByKartno(personelEntity.getId());
        /*LocalDate date = personelEntity.getIsegiristarihi().toLocalDate();
        int month = date.getMonth().getValue();
        int year = date.getYear();
        personelTimes = personelTimes.stream()
                .filter(p -> p.getGiristarihi().toLocalDate().getYear() != year &&
                        p.getGiristarihi().toLocalDate().getMonth().getValue() != month)
                .collect(Collectors.toList());*/

        model.addAttribute("kartno",personel.getKartno());
        //model.addAttribute("isegiristarihi",personel.getIsegiristarihi());
        model.addAttribute("ad",personel.getAd());
        model.addAttribute("soyad",personel.getSoyad());
        model.addAttribute("durum",times.get(0).getPersonelid());

        return "personel";
    }

}