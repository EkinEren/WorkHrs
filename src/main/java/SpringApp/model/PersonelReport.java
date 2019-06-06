package SpringApp.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class PersonelReport {

    private LocalDate tarih;
    private LocalTime ilkGiris;
    private LocalTime sonCikis;
    private LocalTime toplamSure;
    private LocalTime disariSure;
    private LocalTime netSure;
    private LocalTime eksikFazlaCalisma;
    private LocalTime gunlukMesaiSuresi;

    public PersonelReport(LocalDate tarih, LocalTime ilkGiris, LocalTime sonCikis,LocalTime netSure) {
        this.tarih = tarih;
        this.ilkGiris = ilkGiris;
        this.sonCikis = sonCikis;
        this.netSure = netSure;
        toplamSure = sonCikis.minusNanos(ilkGiris.toNanoOfDay());
        disariSure = toplamSure.minusNanos(netSure.toNanoOfDay());
        eksikFazlaCalisma = LocalTime.of(8,0).minusNanos(toplamSure.toNanoOfDay());
        gunlukMesaiSuresi = toplamSure.equals(LocalTime.of(0,0)) ? LocalTime.of(0,0) : LocalTime.of(8,0);
    }

    public LocalDate getTarih() {
        return tarih;
    }

    public void setTarih(LocalDate tarih) {
        this.tarih = tarih;
    }

    public LocalTime getIlkGiris() {
        return ilkGiris;
    }

    public void setIlkGiris(LocalTime ilkGiris) {
        this.ilkGiris = ilkGiris;
    }

    public LocalTime getSonCikis() {
        return sonCikis;
    }

    public void setSonCikis(LocalTime sonCikis) {
        this.sonCikis = sonCikis;
    }

    public LocalTime getToplamSure() {
        return toplamSure;
    }

    public void setToplamSure(LocalTime toplamSure) {
        this.toplamSure = toplamSure;
    }

    public LocalTime getDisariSure() {
        return disariSure;
    }

    public void setDisariSure(LocalTime disariSure) {
        this.disariSure = disariSure;
    }

    public LocalTime getNetSure() {
        return netSure;
    }

    public void setNetSure(LocalTime netSure) {
        this.netSure = netSure;
    }

    public LocalTime getEksikFazlaCalisma() {
        return eksikFazlaCalisma;
    }

    public void setEksikFazlaCalisma(LocalTime eksikFazlaCalisma) {
        this.eksikFazlaCalisma = eksikFazlaCalisma;
    }

    public LocalTime getGunlukMesaiSuresi() {
        return gunlukMesaiSuresi;
    }

    public void setGunlukMesaiSuresi(LocalTime gunlukMesaiSuresi) {
        this.gunlukMesaiSuresi = gunlukMesaiSuresi;
    }
}
