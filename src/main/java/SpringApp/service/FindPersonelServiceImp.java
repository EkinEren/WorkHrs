package SpringApp.service;

import SpringApp.model.PersonelEntity;
import SpringApp.model.PtsGiriscikisEntity;
import SpringApp.repository.GirisCikisRepository;
import SpringApp.repository.PersonelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FindPersonelServiceImp implements FindPersonelService{


        @Autowired
        private PersonelRepository personelRepository;


        @Override
        @Transactional
        public PersonelEntity findByKartno(String kartno) {
        return personelRepository.findByKartno(kartno);
    }
}

