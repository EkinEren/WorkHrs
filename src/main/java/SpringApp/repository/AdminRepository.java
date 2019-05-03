package SpringApp.repository;

import SpringApp.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {

    //List<Admin> findByName(String name);
    Admin findByUsername(String username);

}