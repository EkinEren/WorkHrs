package SpringApp.service;

import SpringApp.model.PersonelEntity;

public interface FindPersonelService {

    PersonelEntity findByKartno(String kartno);
}
