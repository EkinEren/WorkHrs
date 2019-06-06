package SpringApp.service;

import SpringApp.model.PtsGiriscikisEntity;
import SpringApp.repository.GirisCikisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.List;

@Service
public class PersonalTimeServiceImp implements PersonelTimeService {


    @Autowired
    private GirisCikisRepository girisCikisRepository;

    @Override
    @Transactional
    public List<PtsGiriscikisEntity> findAllByPersonelid(Long id) {
        return girisCikisRepository.findAllByPersonelid(id);
    }

    @Override
    public List<PtsGiriscikisEntity> findAllByCikistarihiAndPersonelidOrderByGirissaati(Date date,Long id) {
        return girisCikisRepository.findAllByCikistarihiAndPersonelidOrderByGirissaati(date,id);
    }
}
