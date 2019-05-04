package SpringApp.service;

import SpringApp.model.Admin;
import SpringApp.repository.AdminRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

@Service
public class AdminDetailsServiceImp implements UserDetailsService {

    @Autowired
    private AdminRepository adminRepository;

    BCryptPasswordEncoder encoder = passwordEncoder();

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Admin admin = adminRepository.findByUsername(username);
        if (admin == null) throw new UsernameNotFoundException(username+" Not Found");

        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();

        return new org.springframework.security.core.userdetails.User(admin.getUsername(), encoder.encode(admin.getPassword()),grantedAuthorities);
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
