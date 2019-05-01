package SpringApp.controller;

import SpringApp.model.Admin;
import SpringApp.model.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class AdminController {

    @Autowired
    AdminRepository adminRepository;

    // Get All Admin Users
    @GetMapping("/admins")
    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    // Create a new Admin
    @PostMapping("/admins")
    public Admin createNote(@Valid @RequestBody Admin admin) {
        return adminRepository.save(admin);
    }
}
