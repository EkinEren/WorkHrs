package SpringApp.service;

import SpringApp.model.PtsGiriscikisEntity;

import java.util.List;

public interface PersonelTimeService {

    List<PtsGiriscikisEntity> findAllByPersonelid(Long id);
}
