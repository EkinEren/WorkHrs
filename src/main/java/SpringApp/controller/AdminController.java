package SpringApp.controller;

import SpringApp.model.Admin;
import SpringApp.repository.AdminRepository;
import SpringApp.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private SecurityService securityService;

    // Get All Admin Users, for production
    /*@GetMapping("/admins")
    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }*/

    /* We don't define /login POST controller, it is provided by Spring Security */

    @GetMapping("/login")
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");

        return "login";
    }

    @GetMapping({"/", "/welcome"})
    public String welcome(Model model) {
        return "welcome";
    }

}
