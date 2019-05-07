package SpringApp.controller;

import SpringApp.model.PersonelEntity;
import SpringApp.repository.PersonelRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PersonelController {

    private PersonelRepository personelRepository;

    @RequestMapping({"/test"})
    public String test() {
        return "test";
    }

    //@GetMapping(“/students/{id}”)
    @GetMapping("/test/{kartno}")
    public String getEmp(@PathVariable("kartno") String kartno,Model model) {

        model.addAttribute("personel", personelRepository.findByKartno(kartno));

        return "/test/{kartno}";
    }
}