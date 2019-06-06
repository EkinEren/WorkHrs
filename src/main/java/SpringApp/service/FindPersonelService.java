package SpringApp.service;

import SpringApp.model.PersonelEntity;
import SpringApp.model.PtsGiriscikisEntity;

import java.util.List;

public interface FindPersonelService {

   PersonelEntity findByKartno(String kartno);
}
