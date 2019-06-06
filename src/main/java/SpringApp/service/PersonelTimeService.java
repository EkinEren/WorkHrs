package SpringApp.service;

import SpringApp.model.PtsGiriscikisEntity;

import java.sql.Date;
import java.util.List;

public interface PersonelTimeService {

    List<PtsGiriscikisEntity> findAllByPersonelid(Long id);

    List<PtsGiriscikisEntity> findAllByCikistarihiAndPersonelidOrderByGirissaati(Date date,Long id);
}
