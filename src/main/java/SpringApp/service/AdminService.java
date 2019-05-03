package SpringApp.service;

import SpringApp.model.Admin;

public interface AdminService {

    Admin findByUsername(String username);
}
