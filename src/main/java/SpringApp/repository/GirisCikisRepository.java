package SpringApp.repository;

import SpringApp.model.PtsGiriscikisEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface GirisCikisRepository extends JpaRepository<PtsGiriscikisEntity, Long> {

    List<PtsGiriscikisEntity> findAllByPersonelid(Long id);
    List<PtsGiriscikisEntity> findAllByCikistarihiAndPersonelidOrderByGirissaati(Date date,Long id);

    //List<PtsGiriscikisEntity> findAllByCikistarihi(Date date);
}
