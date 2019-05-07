package SpringApp.service;

import SpringApp.model.PersonelEntity;
import SpringApp.repository.PersonelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindPersonelServiceImp implements FindPersonelService{


        @Autowired
        private PersonelRepository personelRepository;


    @Override
    public PersonelEntity findByKartno(String kartno) {
        return personelRepository.findByKartno(kartno);
    }
}

