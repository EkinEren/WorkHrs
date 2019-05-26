package SpringApp.repository;

import SpringApp.model.PersonelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface PersonelRepository extends JpaRepository<PersonelEntity, Long>{

    // PersonelEntity findByKartnoAndIsegiristarihi(Long id, Date date);
    PersonelEntity findByKartno(String kartno);
}
