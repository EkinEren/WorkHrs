package SpringApp.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.util.Arrays;

@Entity
@Table(name = "personel", schema = "workhrsdb")
public class PersonelEntity {
    private Long id;
    private String kartfc;
    private String kartno;
    private String kartid;
    private String ad;
    private String soyad;
    private String sicilno;
    private String durum;
    private Integer firmaid;
    private Integer grupid;
    private Integer bolumid;
    private Integer gorevid;
    private Integer servisid;
    private Integer bolgeid;
    private Integer birimid;
    private Integer takimid;
    private Integer subeid;
    private Date isegiristarihi;
    private Date istencikistarihi;
    private String istenayrilmanedeni;
    private BigDecimal ucret;
    private BigDecimal saatucreti;
    private String ucrettipi;
    private BigDecimal ucretOnceki;
    private String primucrettipi;
    private BigDecimal primucreti;
    private String yolucrettipi;
    private BigDecimal yolucreti;
    private String yemekucrettipi;
    private BigDecimal yemekucreti;
    private byte[] resim;
    private String webadres;
    private String vergino;
    private String evtel;
    private String ceptel;
    private String istel;
    private String email;
    private String egitim;
    private String yabancidil;
    private String askerlikdurumu;
    private String gozluk;
    private String sabika;
    private BigDecimal kilo;
    private BigDecimal boy;
    private BigDecimal ayak;
    private BigDecimal pan;
    private String medenihali;
    private Short cocuksayisi;
    private String esdurumu;
    private String adres;
    private String il;
    private String ilce;
    private String ilksoyad;
    private String kimlikno;
    private String babaad;
    private String annead;
    private String dogumyeri;
    private Date dogumtarihi;
    private String kangrubu;
    private String uyruk;
    private String cinsiyet;
    private String nufusIl;
    private String nufusIlce;
    private String nufusMahkoy;
    private String nufusCiltno;
    private String nufusAilesirano;
    private String nufusSirano;
    private String bankaSubeadi;
    private String bankaHesapno;
    private String ehliyetSinif;
    private String ehliyetVerililce;
    private String ehliyetBelgeno;
    private Date ehliyetVertarih;
    private String ehliyetKulcihazprotez;
    private String personelturu;
    private String aciklama;
    private Integer gunlukkontor;
    private String uyedurumu;
    private Date uyebaslamatarihi;
    private Date uyebitistarihi;
    private BigDecimal odedigitutar;
    private BigDecimal kalantutar;
    private Time uyebaslamasaati;
    private Time uyebitissaati;
    private Date ogrenciKayittarihi;
    private Date ogrenciCikistarihi;
    private Integer ogrenciBasariorani;
    private Integer ogrenciGrupid;
    private Integer ogrenciBolumid;
    private Integer ogrenciSinifid;
    private String ogretmenBransid;
    private String ogretmenDersid;
    private String ogrenciAlanturu;
    private String ogrenciGeldigiokul;
    private String ogrenciSinif;
    private String ogrenciBolum;
    private String ogrenciOkulno;
    private String ogrenciVeliad;
    private String ogrenciVelievtel;
    private String ogrenciVeliistel;
    private String ogrenciVeliceptel;
    private BigDecimal mesaisaatucreti;
    private String ozelucrettipi;
    private BigDecimal ozelucret;
    private Integer yetkiid;
    private Integer uyetipiid;
    private Date ilkgiristarihi;
    private Date songiristarihi;
    private Integer toplamgirissayisi;
    private Integer gecisgrupid;
    private String gecisyetki;
    private Integer toplamkontor;
    private Integer kalankontor;
    private Date isegiristarihi1;
    private BigDecimal ucret1;
    private Byte fazlamesaialir;
    private BigDecimal devamsizlikcezasi;
    private Byte agialir;
    private String nufusCuzdanverildigiyer;
    private String nufusCuzdanverilisnedeni;
    private String nufusCuzdankayitno;
    private Date nufusCuzdanverilistarihi;
    private String elbisebedenno;
    private Integer kapiyetki;
    private Integer yillikizinonceki;
    private Date saglikraporu1;
    private Date saglikraporu2;
    private Date saglikraporu3;
    private Integer ay;
    private Byte parmaktanimlandi;
    private String sgkNo;
    private Date sgkIsegiristarihi;
    private String sgkIstencikiskodu;
    private String sgkMeslekkodu;
    private String sgkCalismadonemi;
    private String sgkKapsam;
    private String sgkUcrettipi;
    private String sgkHesaptipi;
    private Byte sgkIssizliksigortakes;
    private String sgkGrubu;
    private String sgkBelgeturu;
    private String sgkTabioldugukanun;
    private Date sgkKanunbitistarihi;
    private Short sgkOzurlulukderecesi;
    private Date ilkisegiristarihi;
    private Byte wckesintisiuygula;
    private BigDecimal ncsaatucreti;

    protected PersonelEntity(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "kartfc",nullable = false)
    public String getKartfc() {
        return kartfc;
    }

    public void setKartfc(String kartfc) {
        this.kartfc = kartfc;
    }

    @Basic
    @Column(name = "kartno",nullable = false)
    public String getKartno() {
        return kartno;
    }

    public void setKartno(String kartno) {
        this.kartno = kartno;
    }

    @Basic
    @Column(name = "kartid",nullable = false)
    public String getKartid() {
        return kartid;
    }

    public void setKartid(String kartid) {
        this.kartid = kartid;
    }

    @Basic
    @Column(name = "ad")
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    @Basic
    @Column(name = "soyad")
    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    @Basic
    @Column(name = "sicilno")
    public String getSicilno() {
        return sicilno;
    }

    public void setSicilno(String sicilno) {
        this.sicilno = sicilno;
    }

    @Basic
    @Column(name = "durum")
    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

    @Basic
    @Column(name = "firmaid")
    public Integer getFirmaid() {
        return firmaid;
    }

    public void setFirmaid(Integer firmaid) {
        this.firmaid = firmaid;
    }

    @Basic
    @Column(name = "grupid")
    public Integer getGrupid() {
        return grupid;
    }

    public void setGrupid(Integer grupid) {
        this.grupid = grupid;
    }

    @Basic
    @Column(name = "bolumid")
    public Integer getBolumid() {
        return bolumid;
    }

    public void setBolumid(Integer bolumid) {
        this.bolumid = bolumid;
    }

    @Basic
    @Column(name = "gorevid")
    public Integer getGorevid() {
        return gorevid;
    }

    public void setGorevid(Integer gorevid) {
        this.gorevid = gorevid;
    }

    @Basic
    @Column(name = "servisid")
    public Integer getServisid() {
        return servisid;
    }

    public void setServisid(Integer servisid) {
        this.servisid = servisid;
    }

    @Basic
    @Column(name = "bolgeid")
    public Integer getBolgeid() {
        return bolgeid;
    }

    public void setBolgeid(Integer bolgeid) {
        this.bolgeid = bolgeid;
    }

    @Basic
    @Column(name = "birimid")
    public Integer getBirimid() {
        return birimid;
    }

    public void setBirimid(Integer birimid) {
        this.birimid = birimid;
    }

    @Basic
    @Column(name = "takimid")
    public Integer getTakimid() {
        return takimid;
    }

    public void setTakimid(Integer takimid) {
        this.takimid = takimid;
    }

    @Basic
    @Column(name = "subeid")
    public Integer getSubeid() {
        return subeid;
    }

    public void setSubeid(Integer subeid) {
        this.subeid = subeid;
    }

    @Basic
    @Column(name = "isegiristarihi")
    public Date getIsegiristarihi() {
        return isegiristarihi;
    }

    public void setIsegiristarihi(Date isegiristarihi) {
        this.isegiristarihi = isegiristarihi;
    }

    @Basic
    @Column(name = "istencikistarihi")
    public Date getIstencikistarihi() {
        return istencikistarihi;
    }

    public void setIstencikistarihi(Date istencikistarihi) {
        this.istencikistarihi = istencikistarihi;
    }

    @Basic
    @Column(name = "istenayrilmanedeni")
    public String getIstenayrilmanedeni() {
        return istenayrilmanedeni;
    }

    public void setIstenayrilmanedeni(String istenayrilmanedeni) {
        this.istenayrilmanedeni = istenayrilmanedeni;
    }

    @Basic
    @Column(name = "ucret")
    public BigDecimal getUcret() {
        return ucret;
    }

    public void setUcret(BigDecimal ucret) {
        this.ucret = ucret;
    }

    @Basic
    @Column(name = "saatucreti")
    public BigDecimal getSaatucreti() {
        return saatucreti;
    }

    public void setSaatucreti(BigDecimal saatucreti) {
        this.saatucreti = saatucreti;
    }

    @Basic
    @Column(name = "ucrettipi")
    public String getUcrettipi() {
        return ucrettipi;
    }

    public void setUcrettipi(String ucrettipi) {
        this.ucrettipi = ucrettipi;
    }

    @Basic
    @Column(name = "ucret_onceki")
    public BigDecimal getUcretOnceki() {
        return ucretOnceki;
    }

    public void setUcretOnceki(BigDecimal ucretOnceki) {
        this.ucretOnceki = ucretOnceki;
    }

    @Basic
    @Column(name = "primucrettipi")
    public String getPrimucrettipi() {
        return primucrettipi;
    }

    public void setPrimucrettipi(String primucrettipi) {
        this.primucrettipi = primucrettipi;
    }

    @Basic
    @Column(name = "primucreti")
    public BigDecimal getPrimucreti() {
        return primucreti;
    }

    public void setPrimucreti(BigDecimal primucreti) {
        this.primucreti = primucreti;
    }

    @Basic
    @Column(name = "yolucrettipi")
    public String getYolucrettipi() {
        return yolucrettipi;
    }

    public void setYolucrettipi(String yolucrettipi) {
        this.yolucrettipi = yolucrettipi;
    }

    @Basic
    @Column(name = "yolucreti")
    public BigDecimal getYolucreti() {
        return yolucreti;
    }

    public void setYolucreti(BigDecimal yolucreti) {
        this.yolucreti = yolucreti;
    }

    @Basic
    @Column(name = "yemekucrettipi")
    public String getYemekucrettipi() {
        return yemekucrettipi;
    }

    public void setYemekucrettipi(String yemekucrettipi) {
        this.yemekucrettipi = yemekucrettipi;
    }

    @Basic
    @Column(name = "yemekucreti")
    public BigDecimal getYemekucreti() {
        return yemekucreti;
    }

    public void setYemekucreti(BigDecimal yemekucreti) {
        this.yemekucreti = yemekucreti;
    }

    @Basic
    @Column(name = "resim")
    public byte[] getResim() {
        return resim;
    }

    public void setResim(byte[] resim) {
        this.resim = resim;
    }

    @Basic
    @Column(name = "webadres")
    public String getWebadres() {
        return webadres;
    }

    public void setWebadres(String webadres) {
        this.webadres = webadres;
    }

    @Basic
    @Column(name = "vergino")
    public String getVergino() {
        return vergino;
    }

    public void setVergino(String vergino) {
        this.vergino = vergino;
    }

    @Basic
    @Column(name = "evtel")
    public String getEvtel() {
        return evtel;
    }

    public void setEvtel(String evtel) {
        this.evtel = evtel;
    }

    @Basic
    @Column(name = "ceptel")
    public String getCeptel() {
        return ceptel;
    }

    public void setCeptel(String ceptel) {
        this.ceptel = ceptel;
    }

    @Basic
    @Column(name = "istel")
    public String getIstel() {
        return istel;
    }

    public void setIstel(String istel) {
        this.istel = istel;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "egitim")
    public String getEgitim() {
        return egitim;
    }

    public void setEgitim(String egitim) {
        this.egitim = egitim;
    }

    @Basic
    @Column(name = "yabancidil")
    public String getYabancidil() {
        return yabancidil;
    }

    public void setYabancidil(String yabancidil) {
        this.yabancidil = yabancidil;
    }

    @Basic
    @Column(name = "askerlikdurumu")
    public String getAskerlikdurumu() {
        return askerlikdurumu;
    }

    public void setAskerlikdurumu(String askerlikdurumu) {
        this.askerlikdurumu = askerlikdurumu;
    }

    @Basic
    @Column(name = "gozluk")
    public String getGozluk() {
        return gozluk;
    }

    public void setGozluk(String gozluk) {
        this.gozluk = gozluk;
    }

    @Basic
    @Column(name = "sabika")
    public String getSabika() {
        return sabika;
    }

    public void setSabika(String sabika) {
        this.sabika = sabika;
    }

    @Basic
    @Column(name = "kilo")
    public BigDecimal getKilo() {
        return kilo;
    }

    public void setKilo(BigDecimal kilo) {
        this.kilo = kilo;
    }

    @Basic
    @Column(name = "boy")
    public BigDecimal getBoy() {
        return boy;
    }

    public void setBoy(BigDecimal boy) {
        this.boy = boy;
    }

    @Basic
    @Column(name = "ayak")
    public BigDecimal getAyak() {
        return ayak;
    }

    public void setAyak(BigDecimal ayak) {
        this.ayak = ayak;
    }

    @Basic
    @Column(name = "pan")
    public BigDecimal getPan() {
        return pan;
    }

    public void setPan(BigDecimal pan) {
        this.pan = pan;
    }

    @Basic
    @Column(name = "medenihali")
    public String getMedenihali() {
        return medenihali;
    }

    public void setMedenihali(String medenihali) {
        this.medenihali = medenihali;
    }

    @Basic
    @Column(name = "cocuksayisi")
    public Short getCocuksayisi() {
        return cocuksayisi;
    }

    public void setCocuksayisi(Short cocuksayisi) {
        this.cocuksayisi = cocuksayisi;
    }

    @Basic
    @Column(name = "esdurumu")
    public String getEsdurumu() {
        return esdurumu;
    }

    public void setEsdurumu(String esdurumu) {
        this.esdurumu = esdurumu;
    }

    @Basic
    @Column(name = "adres")
    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    @Basic
    @Column(name = "il")
    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    @Basic
    @Column(name = "ilce")
    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    @Basic
    @Column(name = "ilksoyad")
    public String getIlksoyad() {
        return ilksoyad;
    }

    public void setIlksoyad(String ilksoyad) {
        this.ilksoyad = ilksoyad;
    }

    @Basic
    @Column(name = "kimlikno")
    public String getKimlikno() {
        return kimlikno;
    }

    public void setKimlikno(String kimlikno) {
        this.kimlikno = kimlikno;
    }

    @Basic
    @Column(name = "babaad")
    public String getBabaad() {
        return babaad;
    }

    public void setBabaad(String babaad) {
        this.babaad = babaad;
    }

    @Basic
    @Column(name = "annead")
    public String getAnnead() {
        return annead;
    }

    public void setAnnead(String annead) {
        this.annead = annead;
    }

    @Basic
    @Column(name = "dogumyeri")
    public String getDogumyeri() {
        return dogumyeri;
    }

    public void setDogumyeri(String dogumyeri) {
        this.dogumyeri = dogumyeri;
    }

    @Basic
    @Column(name = "dogumtarihi")
    public Date getDogumtarihi() {
        return dogumtarihi;
    }

    public void setDogumtarihi(Date dogumtarihi) {
        this.dogumtarihi = dogumtarihi;
    }

    @Basic
    @Column(name = "kangrubu")
    public String getKangrubu() {
        return kangrubu;
    }

    public void setKangrubu(String kangrubu) {
        this.kangrubu = kangrubu;
    }

    @Basic
    @Column(name = "uyruk")
    public String getUyruk() {
        return uyruk;
    }

    public void setUyruk(String uyruk) {
        this.uyruk = uyruk;
    }

    @Basic
    @Column(name = "cinsiyet")
    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    @Basic
    @Column(name = "nufus_il")
    public String getNufusIl() {
        return nufusIl;
    }

    public void setNufusIl(String nufusIl) {
        this.nufusIl = nufusIl;
    }

    @Basic
    @Column(name = "nufus_ilce")
    public String getNufusIlce() {
        return nufusIlce;
    }

    public void setNufusIlce(String nufusIlce) {
        this.nufusIlce = nufusIlce;
    }

    @Basic
    @Column(name = "nufus_mahkoy")
    public String getNufusMahkoy() {
        return nufusMahkoy;
    }

    public void setNufusMahkoy(String nufusMahkoy) {
        this.nufusMahkoy = nufusMahkoy;
    }

    @Basic
    @Column(name = "nufus_ciltno")
    public String getNufusCiltno() {
        return nufusCiltno;
    }

    public void setNufusCiltno(String nufusCiltno) {
        this.nufusCiltno = nufusCiltno;
    }

    @Basic
    @Column(name = "nufus_ailesirano")
    public String getNufusAilesirano() {
        return nufusAilesirano;
    }

    public void setNufusAilesirano(String nufusAilesirano) {
        this.nufusAilesirano = nufusAilesirano;
    }

    @Basic
    @Column(name = "nufus_sirano")
    public String getNufusSirano() {
        return nufusSirano;
    }

    public void setNufusSirano(String nufusSirano) {
        this.nufusSirano = nufusSirano;
    }

    @Basic
    @Column(name = "banka_subeadi")
    public String getBankaSubeadi() {
        return bankaSubeadi;
    }

    public void setBankaSubeadi(String bankaSubeadi) {
        this.bankaSubeadi = bankaSubeadi;
    }

    @Basic
    @Column(name = "banka_hesapno")
    public String getBankaHesapno() {
        return bankaHesapno;
    }

    public void setBankaHesapno(String bankaHesapno) {
        this.bankaHesapno = bankaHesapno;
    }

    @Basic
    @Column(name = "ehliyet_sinif")
    public String getEhliyetSinif() {
        return ehliyetSinif;
    }

    public void setEhliyetSinif(String ehliyetSinif) {
        this.ehliyetSinif = ehliyetSinif;
    }

    @Basic
    @Column(name = "ehliyet_verililce")
    public String getEhliyetVerililce() {
        return ehliyetVerililce;
    }

    public void setEhliyetVerililce(String ehliyetVerililce) {
        this.ehliyetVerililce = ehliyetVerililce;
    }

    @Basic
    @Column(name = "ehliyet_belgeno")
    public String getEhliyetBelgeno() {
        return ehliyetBelgeno;
    }

    public void setEhliyetBelgeno(String ehliyetBelgeno) {
        this.ehliyetBelgeno = ehliyetBelgeno;
    }

    @Basic
    @Column(name = "ehliyet_vertarih")
    public Date getEhliyetVertarih() {
        return ehliyetVertarih;
    }

    public void setEhliyetVertarih(Date ehliyetVertarih) {
        this.ehliyetVertarih = ehliyetVertarih;
    }

    @Basic
    @Column(name = "ehliyet_kulcihazprotez")
    public String getEhliyetKulcihazprotez() {
        return ehliyetKulcihazprotez;
    }

    public void setEhliyetKulcihazprotez(String ehliyetKulcihazprotez) {
        this.ehliyetKulcihazprotez = ehliyetKulcihazprotez;
    }

    @Basic
    @Column(name = "personelturu")
    public String getPersonelturu() {
        return personelturu;
    }

    public void setPersonelturu(String personelturu) {
        this.personelturu = personelturu;
    }

    @Basic
    @Column(name = "aciklama")
    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    @Basic
    @Column(name = "gunlukkontor")
    public Integer getGunlukkontor() {
        return gunlukkontor;
    }

    public void setGunlukkontor(Integer gunlukkontor) {
        this.gunlukkontor = gunlukkontor;
    }

    @Basic
    @Column(name = "uyedurumu")
    public String getUyedurumu() {
        return uyedurumu;
    }

    public void setUyedurumu(String uyedurumu) {
        this.uyedurumu = uyedurumu;
    }

    @Basic
    @Column(name = "uyebaslamatarihi")
    public Date getUyebaslamatarihi() {
        return uyebaslamatarihi;
    }

    public void setUyebaslamatarihi(Date uyebaslamatarihi) {
        this.uyebaslamatarihi = uyebaslamatarihi;
    }

    @Basic
    @Column(name = "uyebitistarihi")
    public Date getUyebitistarihi() {
        return uyebitistarihi;
    }

    public void setUyebitistarihi(Date uyebitistarihi) {
        this.uyebitistarihi = uyebitistarihi;
    }

    @Basic
    @Column(name = "odedigitutar")
    public BigDecimal getOdedigitutar() {
        return odedigitutar;
    }

    public void setOdedigitutar(BigDecimal odedigitutar) {
        this.odedigitutar = odedigitutar;
    }

    @Basic
    @Column(name = "kalantutar")
    public BigDecimal getKalantutar() {
        return kalantutar;
    }

    public void setKalantutar(BigDecimal kalantutar) {
        this.kalantutar = kalantutar;
    }

    @Basic
    @Column(name = "uyebaslamasaati")
    public Time getUyebaslamasaati() {
        return uyebaslamasaati;
    }

    public void setUyebaslamasaati(Time uyebaslamasaati) {
        this.uyebaslamasaati = uyebaslamasaati;
    }

    @Basic
    @Column(name = "uyebitissaati")
    public Time getUyebitissaati() {
        return uyebitissaati;
    }

    public void setUyebitissaati(Time uyebitissaati) {
        this.uyebitissaati = uyebitissaati;
    }

    @Basic
    @Column(name = "ogrenci_kayittarihi")
    public Date getOgrenciKayittarihi() {
        return ogrenciKayittarihi;
    }

    public void setOgrenciKayittarihi(Date ogrenciKayittarihi) {
        this.ogrenciKayittarihi = ogrenciKayittarihi;
    }

    @Basic
    @Column(name = "ogrenci_cikistarihi")
    public Date getOgrenciCikistarihi() {
        return ogrenciCikistarihi;
    }

    public void setOgrenciCikistarihi(Date ogrenciCikistarihi) {
        this.ogrenciCikistarihi = ogrenciCikistarihi;
    }

    @Basic
    @Column(name = "ogrenci_basariorani")
    public Integer getOgrenciBasariorani() {
        return ogrenciBasariorani;
    }

    public void setOgrenciBasariorani(Integer ogrenciBasariorani) {
        this.ogrenciBasariorani = ogrenciBasariorani;
    }

    @Basic
    @Column(name = "ogrenci_grupid")
    public Integer getOgrenciGrupid() {
        return ogrenciGrupid;
    }

    public void setOgrenciGrupid(Integer ogrenciGrupid) {
        this.ogrenciGrupid = ogrenciGrupid;
    }

    @Basic
    @Column(name = "ogrenci_bolumid")
    public Integer getOgrenciBolumid() {
        return ogrenciBolumid;
    }

    public void setOgrenciBolumid(Integer ogrenciBolumid) {
        this.ogrenciBolumid = ogrenciBolumid;
    }

    @Basic
    @Column(name = "ogrenci_sinifid")
    public Integer getOgrenciSinifid() {
        return ogrenciSinifid;
    }

    public void setOgrenciSinifid(Integer ogrenciSinifid) {
        this.ogrenciSinifid = ogrenciSinifid;
    }

    @Basic
    @Column(name = "ogretmen_bransid")
    public String getOgretmenBransid() {
        return ogretmenBransid;
    }

    public void setOgretmenBransid(String ogretmenBransid) {
        this.ogretmenBransid = ogretmenBransid;
    }

    @Basic
    @Column(name = "ogretmen_dersid")
    public String getOgretmenDersid() {
        return ogretmenDersid;
    }

    public void setOgretmenDersid(String ogretmenDersid) {
        this.ogretmenDersid = ogretmenDersid;
    }

    @Basic
    @Column(name = "ogrenci_alanturu")
    public String getOgrenciAlanturu() {
        return ogrenciAlanturu;
    }

    public void setOgrenciAlanturu(String ogrenciAlanturu) {
        this.ogrenciAlanturu = ogrenciAlanturu;
    }

    @Basic
    @Column(name = "ogrenci_geldigiokul")
    public String getOgrenciGeldigiokul() {
        return ogrenciGeldigiokul;
    }

    public void setOgrenciGeldigiokul(String ogrenciGeldigiokul) {
        this.ogrenciGeldigiokul = ogrenciGeldigiokul;
    }

    @Basic
    @Column(name = "ogrenci_sinif")
    public String getOgrenciSinif() {
        return ogrenciSinif;
    }

    public void setOgrenciSinif(String ogrenciSinif) {
        this.ogrenciSinif = ogrenciSinif;
    }

    @Basic
    @Column(name = "ogrenci_bolum")
    public String getOgrenciBolum() {
        return ogrenciBolum;
    }

    public void setOgrenciBolum(String ogrenciBolum) {
        this.ogrenciBolum = ogrenciBolum;
    }

    @Basic
    @Column(name = "ogrenci_okulno")
    public String getOgrenciOkulno() {
        return ogrenciOkulno;
    }

    public void setOgrenciOkulno(String ogrenciOkulno) {
        this.ogrenciOkulno = ogrenciOkulno;
    }

    @Basic
    @Column(name = "ogrenci_veliad")
    public String getOgrenciVeliad() {
        return ogrenciVeliad;
    }

    public void setOgrenciVeliad(String ogrenciVeliad) {
        this.ogrenciVeliad = ogrenciVeliad;
    }

    @Basic
    @Column(name = "ogrenci_velievtel")
    public String getOgrenciVelievtel() {
        return ogrenciVelievtel;
    }

    public void setOgrenciVelievtel(String ogrenciVelievtel) {
        this.ogrenciVelievtel = ogrenciVelievtel;
    }

    @Basic
    @Column(name = "ogrenci_veliistel")
    public String getOgrenciVeliistel() {
        return ogrenciVeliistel;
    }

    public void setOgrenciVeliistel(String ogrenciVeliistel) {
        this.ogrenciVeliistel = ogrenciVeliistel;
    }

    @Basic
    @Column(name = "ogrenci_veliceptel")
    public String getOgrenciVeliceptel() {
        return ogrenciVeliceptel;
    }

    public void setOgrenciVeliceptel(String ogrenciVeliceptel) {
        this.ogrenciVeliceptel = ogrenciVeliceptel;
    }

    @Basic
    @Column(name = "mesaisaatucreti")
    public BigDecimal getMesaisaatucreti() {
        return mesaisaatucreti;
    }

    public void setMesaisaatucreti(BigDecimal mesaisaatucreti) {
        this.mesaisaatucreti = mesaisaatucreti;
    }

    @Basic
    @Column(name = "ozelucrettipi")
    public String getOzelucrettipi() {
        return ozelucrettipi;
    }

    public void setOzelucrettipi(String ozelucrettipi) {
        this.ozelucrettipi = ozelucrettipi;
    }

    @Basic
    @Column(name = "ozelucret")
    public BigDecimal getOzelucret() {
        return ozelucret;
    }

    public void setOzelucret(BigDecimal ozelucret) {
        this.ozelucret = ozelucret;
    }

    @Basic
    @Column(name = "yetkiid")
    public Integer getYetkiid() {
        return yetkiid;
    }

    public void setYetkiid(Integer yetkiid) {
        this.yetkiid = yetkiid;
    }

    @Basic
    @Column(name = "uyetipiid")
    public Integer getUyetipiid() {
        return uyetipiid;
    }

    public void setUyetipiid(Integer uyetipiid) {
        this.uyetipiid = uyetipiid;
    }

    @Basic
    @Column(name = "ilkgiristarihi")
    public Date getIlkgiristarihi() {
        return ilkgiristarihi;
    }

    public void setIlkgiristarihi(Date ilkgiristarihi) {
        this.ilkgiristarihi = ilkgiristarihi;
    }

    @Basic
    @Column(name = "songiristarihi")
    public Date getSongiristarihi() {
        return songiristarihi;
    }

    public void setSongiristarihi(Date songiristarihi) {
        this.songiristarihi = songiristarihi;
    }

    @Basic
    @Column(name = "toplamgirissayisi")
    public Integer getToplamgirissayisi() {
        return toplamgirissayisi;
    }

    public void setToplamgirissayisi(Integer toplamgirissayisi) {
        this.toplamgirissayisi = toplamgirissayisi;
    }

    @Basic
    @Column(name = "gecisgrupid")
    public Integer getGecisgrupid() {
        return gecisgrupid;
    }

    public void setGecisgrupid(Integer gecisgrupid) {
        this.gecisgrupid = gecisgrupid;
    }

    @Basic
    @Column(name = "gecisyetki")
    public String getGecisyetki() {
        return gecisyetki;
    }

    public void setGecisyetki(String gecisyetki) {
        this.gecisyetki = gecisyetki;
    }

    @Basic
    @Column(name = "toplamkontor")
    public Integer getToplamkontor() {
        return toplamkontor;
    }

    public void setToplamkontor(Integer toplamkontor) {
        this.toplamkontor = toplamkontor;
    }

    @Basic
    @Column(name = "kalankontor")
    public Integer getKalankontor() {
        return kalankontor;
    }

    public void setKalankontor(Integer kalankontor) {
        this.kalankontor = kalankontor;
    }

    @Basic
    @Column(name = "isegiristarihi1")
    public Date getIsegiristarihi1() {
        return isegiristarihi1;
    }

    public void setIsegiristarihi1(Date isegiristarihi1) {
        this.isegiristarihi1 = isegiristarihi1;
    }

    @Basic
    @Column(name = "ucret1")
    public BigDecimal getUcret1() {
        return ucret1;
    }

    public void setUcret1(BigDecimal ucret1) {
        this.ucret1 = ucret1;
    }

    @Basic
    @Column(name = "fazlamesaialir")
    public Byte getFazlamesaialir() {
        return fazlamesaialir;
    }

    public void setFazlamesaialir(Byte fazlamesaialir) {
        this.fazlamesaialir = fazlamesaialir;
    }

    @Basic
    @Column(name = "devamsizlikcezasi")
    public BigDecimal getDevamsizlikcezasi() {
        return devamsizlikcezasi;
    }

    public void setDevamsizlikcezasi(BigDecimal devamsizlikcezasi) {
        this.devamsizlikcezasi = devamsizlikcezasi;
    }

    @Basic
    @Column(name = "agialir")
    public Byte getAgialir() {
        return agialir;
    }

    public void setAgialir(Byte agialir) {
        this.agialir = agialir;
    }

    @Basic
    @Column(name = "nufus_cuzdanverildigiyer")
    public String getNufusCuzdanverildigiyer() {
        return nufusCuzdanverildigiyer;
    }

    public void setNufusCuzdanverildigiyer(String nufusCuzdanverildigiyer) {
        this.nufusCuzdanverildigiyer = nufusCuzdanverildigiyer;
    }

    @Basic
    @Column(name = "nufus_cuzdanverilisnedeni")
    public String getNufusCuzdanverilisnedeni() {
        return nufusCuzdanverilisnedeni;
    }

    public void setNufusCuzdanverilisnedeni(String nufusCuzdanverilisnedeni) {
        this.nufusCuzdanverilisnedeni = nufusCuzdanverilisnedeni;
    }

    @Basic
    @Column(name = "nufus_cuzdankayitno")
    public String getNufusCuzdankayitno() {
        return nufusCuzdankayitno;
    }

    public void setNufusCuzdankayitno(String nufusCuzdankayitno) {
        this.nufusCuzdankayitno = nufusCuzdankayitno;
    }

    @Basic
    @Column(name = "nufus_cuzdanverilistarihi")
    public Date getNufusCuzdanverilistarihi() {
        return nufusCuzdanverilistarihi;
    }

    public void setNufusCuzdanverilistarihi(Date nufusCuzdanverilistarihi) {
        this.nufusCuzdanverilistarihi = nufusCuzdanverilistarihi;
    }

    @Basic
    @Column(name = "elbisebedenno")
    public String getElbisebedenno() {
        return elbisebedenno;
    }

    public void setElbisebedenno(String elbisebedenno) {
        this.elbisebedenno = elbisebedenno;
    }

    @Basic
    @Column(name = "kapiyetki")
    public Integer getKapiyetki() {
        return kapiyetki;
    }

    public void setKapiyetki(Integer kapiyetki) {
        this.kapiyetki = kapiyetki;
    }

    @Basic
    @Column(name = "yillikizinonceki")
    public Integer getYillikizinonceki() {
        return yillikizinonceki;
    }

    public void setYillikizinonceki(Integer yillikizinonceki) {
        this.yillikizinonceki = yillikizinonceki;
    }

    @Basic
    @Column(name = "saglikraporu1")
    public Date getSaglikraporu1() {
        return saglikraporu1;
    }

    public void setSaglikraporu1(Date saglikraporu1) {
        this.saglikraporu1 = saglikraporu1;
    }

    @Basic
    @Column(name = "saglikraporu2")
    public Date getSaglikraporu2() {
        return saglikraporu2;
    }

    public void setSaglikraporu2(Date saglikraporu2) {
        this.saglikraporu2 = saglikraporu2;
    }

    @Basic
    @Column(name = "saglikraporu3")
    public Date getSaglikraporu3() {
        return saglikraporu3;
    }

    public void setSaglikraporu3(Date saglikraporu3) {
        this.saglikraporu3 = saglikraporu3;
    }

    @Basic
    @Column(name = "ay")
    public Integer getAy() {
        return ay;
    }

    public void setAy(Integer ay) {
        this.ay = ay;
    }

    @Basic
    @Column(name = "parmaktanimlandi")
    public Byte getParmaktanimlandi() {
        return parmaktanimlandi;
    }

    public void setParmaktanimlandi(Byte parmaktanimlandi) {
        this.parmaktanimlandi = parmaktanimlandi;
    }

    @Basic
    @Column(name = "sgk_no")
    public String getSgkNo() {
        return sgkNo;
    }

    public void setSgkNo(String sgkNo) {
        this.sgkNo = sgkNo;
    }

    @Basic
    @Column(name = "sgk_isegiristarihi")
    public Date getSgkIsegiristarihi() {
        return sgkIsegiristarihi;
    }

    public void setSgkIsegiristarihi(Date sgkIsegiristarihi) {
        this.sgkIsegiristarihi = sgkIsegiristarihi;
    }

    @Basic
    @Column(name = "sgk_istencikiskodu")
    public String getSgkIstencikiskodu() {
        return sgkIstencikiskodu;
    }

    public void setSgkIstencikiskodu(String sgkIstencikiskodu) {
        this.sgkIstencikiskodu = sgkIstencikiskodu;
    }

    @Basic
    @Column(name = "sgk_meslekkodu")
    public String getSgkMeslekkodu() {
        return sgkMeslekkodu;
    }

    public void setSgkMeslekkodu(String sgkMeslekkodu) {
        this.sgkMeslekkodu = sgkMeslekkodu;
    }

    @Basic
    @Column(name = "sgk_calismadonemi")
    public String getSgkCalismadonemi() {
        return sgkCalismadonemi;
    }

    public void setSgkCalismadonemi(String sgkCalismadonemi) {
        this.sgkCalismadonemi = sgkCalismadonemi;
    }

    @Basic
    @Column(name = "sgk_kapsam")
    public String getSgkKapsam() {
        return sgkKapsam;
    }

    public void setSgkKapsam(String sgkKapsam) {
        this.sgkKapsam = sgkKapsam;
    }

    @Basic
    @Column(name = "sgk_ucrettipi")
    public String getSgkUcrettipi() {
        return sgkUcrettipi;
    }

    public void setSgkUcrettipi(String sgkUcrettipi) {
        this.sgkUcrettipi = sgkUcrettipi;
    }

    @Basic
    @Column(name = "sgk_hesaptipi")
    public String getSgkHesaptipi() {
        return sgkHesaptipi;
    }

    public void setSgkHesaptipi(String sgkHesaptipi) {
        this.sgkHesaptipi = sgkHesaptipi;
    }

    @Basic
    @Column(name = "sgk_issizliksigortakes")
    public Byte getSgkIssizliksigortakes() {
        return sgkIssizliksigortakes;
    }

    public void setSgkIssizliksigortakes(Byte sgkIssizliksigortakes) {
        this.sgkIssizliksigortakes = sgkIssizliksigortakes;
    }

    @Basic
    @Column(name = "sgk_grubu")
    public String getSgkGrubu() {
        return sgkGrubu;
    }

    public void setSgkGrubu(String sgkGrubu) {
        this.sgkGrubu = sgkGrubu;
    }

    @Basic
    @Column(name = "sgk_belgeturu")
    public String getSgkBelgeturu() {
        return sgkBelgeturu;
    }

    public void setSgkBelgeturu(String sgkBelgeturu) {
        this.sgkBelgeturu = sgkBelgeturu;
    }

    @Basic
    @Column(name = "sgk_tabioldugukanun")
    public String getSgkTabioldugukanun() {
        return sgkTabioldugukanun;
    }

    public void setSgkTabioldugukanun(String sgkTabioldugukanun) {
        this.sgkTabioldugukanun = sgkTabioldugukanun;
    }

    @Basic
    @Column(name = "sgk_kanunbitistarihi")
    public Date getSgkKanunbitistarihi() {
        return sgkKanunbitistarihi;
    }

    public void setSgkKanunbitistarihi(Date sgkKanunbitistarihi) {
        this.sgkKanunbitistarihi = sgkKanunbitistarihi;
    }

    @Basic
    @Column(name = "sgk_ozurlulukderecesi")
    public Short getSgkOzurlulukderecesi() {
        return sgkOzurlulukderecesi;
    }

    public void setSgkOzurlulukderecesi(Short sgkOzurlulukderecesi) {
        this.sgkOzurlulukderecesi = sgkOzurlulukderecesi;
    }

    @Basic
    @Column(name = "ilkisegiristarihi")
    public Date getIlkisegiristarihi() {
        return ilkisegiristarihi;
    }

    public void setIlkisegiristarihi(Date ilkisegiristarihi) {
        this.ilkisegiristarihi = ilkisegiristarihi;
    }

    @Basic
    @Column(name = "wckesintisiuygula")
    public Byte getWckesintisiuygula() {
        return wckesintisiuygula;
    }

    public void setWckesintisiuygula(Byte wckesintisiuygula) {
        this.wckesintisiuygula = wckesintisiuygula;
    }

    @Basic
    @Column(name = "ncsaatucreti")
    public BigDecimal getNcsaatucreti() {
        return ncsaatucreti;
    }

    public void setNcsaatucreti(BigDecimal ncsaatucreti) {
        this.ncsaatucreti = ncsaatucreti;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonelEntity that = (PersonelEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (kartfc != null ? !kartfc.equals(that.kartfc) : that.kartfc != null) return false;
        if (kartno != null ? !kartno.equals(that.kartno) : that.kartno != null) return false;
        if (kartid != null ? !kartid.equals(that.kartid) : that.kartid != null) return false;
        if (ad != null ? !ad.equals(that.ad) : that.ad != null) return false;
        if (soyad != null ? !soyad.equals(that.soyad) : that.soyad != null) return false;
        if (sicilno != null ? !sicilno.equals(that.sicilno) : that.sicilno != null) return false;
        if (durum != null ? !durum.equals(that.durum) : that.durum != null) return false;
        if (firmaid != null ? !firmaid.equals(that.firmaid) : that.firmaid != null) return false;
        if (grupid != null ? !grupid.equals(that.grupid) : that.grupid != null) return false;
        if (bolumid != null ? !bolumid.equals(that.bolumid) : that.bolumid != null) return false;
        if (gorevid != null ? !gorevid.equals(that.gorevid) : that.gorevid != null) return false;
        if (servisid != null ? !servisid.equals(that.servisid) : that.servisid != null) return false;
        if (bolgeid != null ? !bolgeid.equals(that.bolgeid) : that.bolgeid != null) return false;
        if (birimid != null ? !birimid.equals(that.birimid) : that.birimid != null) return false;
        if (takimid != null ? !takimid.equals(that.takimid) : that.takimid != null) return false;
        if (subeid != null ? !subeid.equals(that.subeid) : that.subeid != null) return false;
        if (isegiristarihi != null ? !isegiristarihi.equals(that.isegiristarihi) : that.isegiristarihi != null)
            return false;
        if (istencikistarihi != null ? !istencikistarihi.equals(that.istencikistarihi) : that.istencikistarihi != null)
            return false;
        if (istenayrilmanedeni != null ? !istenayrilmanedeni.equals(that.istenayrilmanedeni) : that.istenayrilmanedeni != null)
            return false;
        if (ucret != null ? !ucret.equals(that.ucret) : that.ucret != null) return false;
        if (saatucreti != null ? !saatucreti.equals(that.saatucreti) : that.saatucreti != null) return false;
        if (ucrettipi != null ? !ucrettipi.equals(that.ucrettipi) : that.ucrettipi != null) return false;
        if (ucretOnceki != null ? !ucretOnceki.equals(that.ucretOnceki) : that.ucretOnceki != null) return false;
        if (primucrettipi != null ? !primucrettipi.equals(that.primucrettipi) : that.primucrettipi != null)
            return false;
        if (primucreti != null ? !primucreti.equals(that.primucreti) : that.primucreti != null) return false;
        if (yolucrettipi != null ? !yolucrettipi.equals(that.yolucrettipi) : that.yolucrettipi != null) return false;
        if (yolucreti != null ? !yolucreti.equals(that.yolucreti) : that.yolucreti != null) return false;
        if (yemekucrettipi != null ? !yemekucrettipi.equals(that.yemekucrettipi) : that.yemekucrettipi != null)
            return false;
        if (yemekucreti != null ? !yemekucreti.equals(that.yemekucreti) : that.yemekucreti != null) return false;
        if (!Arrays.equals(resim, that.resim)) return false;
        if (webadres != null ? !webadres.equals(that.webadres) : that.webadres != null) return false;
        if (vergino != null ? !vergino.equals(that.vergino) : that.vergino != null) return false;
        if (evtel != null ? !evtel.equals(that.evtel) : that.evtel != null) return false;
        if (ceptel != null ? !ceptel.equals(that.ceptel) : that.ceptel != null) return false;
        if (istel != null ? !istel.equals(that.istel) : that.istel != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (egitim != null ? !egitim.equals(that.egitim) : that.egitim != null) return false;
        if (yabancidil != null ? !yabancidil.equals(that.yabancidil) : that.yabancidil != null) return false;
        if (askerlikdurumu != null ? !askerlikdurumu.equals(that.askerlikdurumu) : that.askerlikdurumu != null)
            return false;
        if (gozluk != null ? !gozluk.equals(that.gozluk) : that.gozluk != null) return false;
        if (sabika != null ? !sabika.equals(that.sabika) : that.sabika != null) return false;
        if (kilo != null ? !kilo.equals(that.kilo) : that.kilo != null) return false;
        if (boy != null ? !boy.equals(that.boy) : that.boy != null) return false;
        if (ayak != null ? !ayak.equals(that.ayak) : that.ayak != null) return false;
        if (pan != null ? !pan.equals(that.pan) : that.pan != null) return false;
        if (medenihali != null ? !medenihali.equals(that.medenihali) : that.medenihali != null) return false;
        if (cocuksayisi != null ? !cocuksayisi.equals(that.cocuksayisi) : that.cocuksayisi != null) return false;
        if (esdurumu != null ? !esdurumu.equals(that.esdurumu) : that.esdurumu != null) return false;
        if (adres != null ? !adres.equals(that.adres) : that.adres != null) return false;
        if (il != null ? !il.equals(that.il) : that.il != null) return false;
        if (ilce != null ? !ilce.equals(that.ilce) : that.ilce != null) return false;
        if (ilksoyad != null ? !ilksoyad.equals(that.ilksoyad) : that.ilksoyad != null) return false;
        if (kimlikno != null ? !kimlikno.equals(that.kimlikno) : that.kimlikno != null) return false;
        if (babaad != null ? !babaad.equals(that.babaad) : that.babaad != null) return false;
        if (annead != null ? !annead.equals(that.annead) : that.annead != null) return false;
        if (dogumyeri != null ? !dogumyeri.equals(that.dogumyeri) : that.dogumyeri != null) return false;
        if (dogumtarihi != null ? !dogumtarihi.equals(that.dogumtarihi) : that.dogumtarihi != null) return false;
        if (kangrubu != null ? !kangrubu.equals(that.kangrubu) : that.kangrubu != null) return false;
        if (uyruk != null ? !uyruk.equals(that.uyruk) : that.uyruk != null) return false;
        if (cinsiyet != null ? !cinsiyet.equals(that.cinsiyet) : that.cinsiyet != null) return false;
        if (nufusIl != null ? !nufusIl.equals(that.nufusIl) : that.nufusIl != null) return false;
        if (nufusIlce != null ? !nufusIlce.equals(that.nufusIlce) : that.nufusIlce != null) return false;
        if (nufusMahkoy != null ? !nufusMahkoy.equals(that.nufusMahkoy) : that.nufusMahkoy != null) return false;
        if (nufusCiltno != null ? !nufusCiltno.equals(that.nufusCiltno) : that.nufusCiltno != null) return false;
        if (nufusAilesirano != null ? !nufusAilesirano.equals(that.nufusAilesirano) : that.nufusAilesirano != null)
            return false;
        if (nufusSirano != null ? !nufusSirano.equals(that.nufusSirano) : that.nufusSirano != null) return false;
        if (bankaSubeadi != null ? !bankaSubeadi.equals(that.bankaSubeadi) : that.bankaSubeadi != null) return false;
        if (bankaHesapno != null ? !bankaHesapno.equals(that.bankaHesapno) : that.bankaHesapno != null) return false;
        if (ehliyetSinif != null ? !ehliyetSinif.equals(that.ehliyetSinif) : that.ehliyetSinif != null) return false;
        if (ehliyetVerililce != null ? !ehliyetVerililce.equals(that.ehliyetVerililce) : that.ehliyetVerililce != null)
            return false;
        if (ehliyetBelgeno != null ? !ehliyetBelgeno.equals(that.ehliyetBelgeno) : that.ehliyetBelgeno != null)
            return false;
        if (ehliyetVertarih != null ? !ehliyetVertarih.equals(that.ehliyetVertarih) : that.ehliyetVertarih != null)
            return false;
        if (ehliyetKulcihazprotez != null ? !ehliyetKulcihazprotez.equals(that.ehliyetKulcihazprotez) : that.ehliyetKulcihazprotez != null)
            return false;
        if (personelturu != null ? !personelturu.equals(that.personelturu) : that.personelturu != null) return false;
        if (aciklama != null ? !aciklama.equals(that.aciklama) : that.aciklama != null) return false;
        if (gunlukkontor != null ? !gunlukkontor.equals(that.gunlukkontor) : that.gunlukkontor != null) return false;
        if (uyedurumu != null ? !uyedurumu.equals(that.uyedurumu) : that.uyedurumu != null) return false;
        if (uyebaslamatarihi != null ? !uyebaslamatarihi.equals(that.uyebaslamatarihi) : that.uyebaslamatarihi != null)
            return false;
        if (uyebitistarihi != null ? !uyebitistarihi.equals(that.uyebitistarihi) : that.uyebitistarihi != null)
            return false;
        if (odedigitutar != null ? !odedigitutar.equals(that.odedigitutar) : that.odedigitutar != null) return false;
        if (kalantutar != null ? !kalantutar.equals(that.kalantutar) : that.kalantutar != null) return false;
        if (uyebaslamasaati != null ? !uyebaslamasaati.equals(that.uyebaslamasaati) : that.uyebaslamasaati != null)
            return false;
        if (uyebitissaati != null ? !uyebitissaati.equals(that.uyebitissaati) : that.uyebitissaati != null)
            return false;
        if (ogrenciKayittarihi != null ? !ogrenciKayittarihi.equals(that.ogrenciKayittarihi) : that.ogrenciKayittarihi != null)
            return false;
        if (ogrenciCikistarihi != null ? !ogrenciCikistarihi.equals(that.ogrenciCikistarihi) : that.ogrenciCikistarihi != null)
            return false;
        if (ogrenciBasariorani != null ? !ogrenciBasariorani.equals(that.ogrenciBasariorani) : that.ogrenciBasariorani != null)
            return false;
        if (ogrenciGrupid != null ? !ogrenciGrupid.equals(that.ogrenciGrupid) : that.ogrenciGrupid != null)
            return false;
        if (ogrenciBolumid != null ? !ogrenciBolumid.equals(that.ogrenciBolumid) : that.ogrenciBolumid != null)
            return false;
        if (ogrenciSinifid != null ? !ogrenciSinifid.equals(that.ogrenciSinifid) : that.ogrenciSinifid != null)
            return false;
        if (ogretmenBransid != null ? !ogretmenBransid.equals(that.ogretmenBransid) : that.ogretmenBransid != null)
            return false;
        if (ogretmenDersid != null ? !ogretmenDersid.equals(that.ogretmenDersid) : that.ogretmenDersid != null)
            return false;
        if (ogrenciAlanturu != null ? !ogrenciAlanturu.equals(that.ogrenciAlanturu) : that.ogrenciAlanturu != null)
            return false;
        if (ogrenciGeldigiokul != null ? !ogrenciGeldigiokul.equals(that.ogrenciGeldigiokul) : that.ogrenciGeldigiokul != null)
            return false;
        if (ogrenciSinif != null ? !ogrenciSinif.equals(that.ogrenciSinif) : that.ogrenciSinif != null) return false;
        if (ogrenciBolum != null ? !ogrenciBolum.equals(that.ogrenciBolum) : that.ogrenciBolum != null) return false;
        if (ogrenciOkulno != null ? !ogrenciOkulno.equals(that.ogrenciOkulno) : that.ogrenciOkulno != null)
            return false;
        if (ogrenciVeliad != null ? !ogrenciVeliad.equals(that.ogrenciVeliad) : that.ogrenciVeliad != null)
            return false;
        if (ogrenciVelievtel != null ? !ogrenciVelievtel.equals(that.ogrenciVelievtel) : that.ogrenciVelievtel != null)
            return false;
        if (ogrenciVeliistel != null ? !ogrenciVeliistel.equals(that.ogrenciVeliistel) : that.ogrenciVeliistel != null)
            return false;
        if (ogrenciVeliceptel != null ? !ogrenciVeliceptel.equals(that.ogrenciVeliceptel) : that.ogrenciVeliceptel != null)
            return false;
        if (mesaisaatucreti != null ? !mesaisaatucreti.equals(that.mesaisaatucreti) : that.mesaisaatucreti != null)
            return false;
        if (ozelucrettipi != null ? !ozelucrettipi.equals(that.ozelucrettipi) : that.ozelucrettipi != null)
            return false;
        if (ozelucret != null ? !ozelucret.equals(that.ozelucret) : that.ozelucret != null) return false;
        if (yetkiid != null ? !yetkiid.equals(that.yetkiid) : that.yetkiid != null) return false;
        if (uyetipiid != null ? !uyetipiid.equals(that.uyetipiid) : that.uyetipiid != null) return false;
        if (ilkgiristarihi != null ? !ilkgiristarihi.equals(that.ilkgiristarihi) : that.ilkgiristarihi != null)
            return false;
        if (songiristarihi != null ? !songiristarihi.equals(that.songiristarihi) : that.songiristarihi != null)
            return false;
        if (toplamgirissayisi != null ? !toplamgirissayisi.equals(that.toplamgirissayisi) : that.toplamgirissayisi != null)
            return false;
        if (gecisgrupid != null ? !gecisgrupid.equals(that.gecisgrupid) : that.gecisgrupid != null) return false;
        if (gecisyetki != null ? !gecisyetki.equals(that.gecisyetki) : that.gecisyetki != null) return false;
        if (toplamkontor != null ? !toplamkontor.equals(that.toplamkontor) : that.toplamkontor != null) return false;
        if (kalankontor != null ? !kalankontor.equals(that.kalankontor) : that.kalankontor != null) return false;
        if (isegiristarihi1 != null ? !isegiristarihi1.equals(that.isegiristarihi1) : that.isegiristarihi1 != null)
            return false;
        if (ucret1 != null ? !ucret1.equals(that.ucret1) : that.ucret1 != null) return false;
        if (fazlamesaialir != null ? !fazlamesaialir.equals(that.fazlamesaialir) : that.fazlamesaialir != null)
            return false;
        if (devamsizlikcezasi != null ? !devamsizlikcezasi.equals(that.devamsizlikcezasi) : that.devamsizlikcezasi != null)
            return false;
        if (agialir != null ? !agialir.equals(that.agialir) : that.agialir != null) return false;
        if (nufusCuzdanverildigiyer != null ? !nufusCuzdanverildigiyer.equals(that.nufusCuzdanverildigiyer) : that.nufusCuzdanverildigiyer != null)
            return false;
        if (nufusCuzdanverilisnedeni != null ? !nufusCuzdanverilisnedeni.equals(that.nufusCuzdanverilisnedeni) : that.nufusCuzdanverilisnedeni != null)
            return false;
        if (nufusCuzdankayitno != null ? !nufusCuzdankayitno.equals(that.nufusCuzdankayitno) : that.nufusCuzdankayitno != null)
            return false;
        if (nufusCuzdanverilistarihi != null ? !nufusCuzdanverilistarihi.equals(that.nufusCuzdanverilistarihi) : that.nufusCuzdanverilistarihi != null)
            return false;
        if (elbisebedenno != null ? !elbisebedenno.equals(that.elbisebedenno) : that.elbisebedenno != null)
            return false;
        if (kapiyetki != null ? !kapiyetki.equals(that.kapiyetki) : that.kapiyetki != null) return false;
        if (yillikizinonceki != null ? !yillikizinonceki.equals(that.yillikizinonceki) : that.yillikizinonceki != null)
            return false;
        if (saglikraporu1 != null ? !saglikraporu1.equals(that.saglikraporu1) : that.saglikraporu1 != null)
            return false;
        if (saglikraporu2 != null ? !saglikraporu2.equals(that.saglikraporu2) : that.saglikraporu2 != null)
            return false;
        if (saglikraporu3 != null ? !saglikraporu3.equals(that.saglikraporu3) : that.saglikraporu3 != null)
            return false;
        if (ay != null ? !ay.equals(that.ay) : that.ay != null) return false;
        if (parmaktanimlandi != null ? !parmaktanimlandi.equals(that.parmaktanimlandi) : that.parmaktanimlandi != null)
            return false;
        if (sgkNo != null ? !sgkNo.equals(that.sgkNo) : that.sgkNo != null) return false;
        if (sgkIsegiristarihi != null ? !sgkIsegiristarihi.equals(that.sgkIsegiristarihi) : that.sgkIsegiristarihi != null)
            return false;
        if (sgkIstencikiskodu != null ? !sgkIstencikiskodu.equals(that.sgkIstencikiskodu) : that.sgkIstencikiskodu != null)
            return false;
        if (sgkMeslekkodu != null ? !sgkMeslekkodu.equals(that.sgkMeslekkodu) : that.sgkMeslekkodu != null)
            return false;
        if (sgkCalismadonemi != null ? !sgkCalismadonemi.equals(that.sgkCalismadonemi) : that.sgkCalismadonemi != null)
            return false;
        if (sgkKapsam != null ? !sgkKapsam.equals(that.sgkKapsam) : that.sgkKapsam != null) return false;
        if (sgkUcrettipi != null ? !sgkUcrettipi.equals(that.sgkUcrettipi) : that.sgkUcrettipi != null) return false;
        if (sgkHesaptipi != null ? !sgkHesaptipi.equals(that.sgkHesaptipi) : that.sgkHesaptipi != null) return false;
        if (sgkIssizliksigortakes != null ? !sgkIssizliksigortakes.equals(that.sgkIssizliksigortakes) : that.sgkIssizliksigortakes != null)
            return false;
        if (sgkGrubu != null ? !sgkGrubu.equals(that.sgkGrubu) : that.sgkGrubu != null) return false;
        if (sgkBelgeturu != null ? !sgkBelgeturu.equals(that.sgkBelgeturu) : that.sgkBelgeturu != null) return false;
        if (sgkTabioldugukanun != null ? !sgkTabioldugukanun.equals(that.sgkTabioldugukanun) : that.sgkTabioldugukanun != null)
            return false;
        if (sgkKanunbitistarihi != null ? !sgkKanunbitistarihi.equals(that.sgkKanunbitistarihi) : that.sgkKanunbitistarihi != null)
            return false;
        if (sgkOzurlulukderecesi != null ? !sgkOzurlulukderecesi.equals(that.sgkOzurlulukderecesi) : that.sgkOzurlulukderecesi != null)
            return false;
        if (ilkisegiristarihi != null ? !ilkisegiristarihi.equals(that.ilkisegiristarihi) : that.ilkisegiristarihi != null)
            return false;
        if (wckesintisiuygula != null ? !wckesintisiuygula.equals(that.wckesintisiuygula) : that.wckesintisiuygula != null)
            return false;
        if (ncsaatucreti != null ? !ncsaatucreti.equals(that.ncsaatucreti) : that.ncsaatucreti != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (kartfc != null ? kartfc.hashCode() : 0);
        result = 31 * result + (kartno != null ? kartno.hashCode() : 0);
        result = 31 * result + (kartid != null ? kartid.hashCode() : 0);
        result = 31 * result + (ad != null ? ad.hashCode() : 0);
        result = 31 * result + (soyad != null ? soyad.hashCode() : 0);
        result = 31 * result + (sicilno != null ? sicilno.hashCode() : 0);
        result = 31 * result + (durum != null ? durum.hashCode() : 0);
        result = 31 * result + (firmaid != null ? firmaid.hashCode() : 0);
        result = 31 * result + (grupid != null ? grupid.hashCode() : 0);
        result = 31 * result + (bolumid != null ? bolumid.hashCode() : 0);
        result = 31 * result + (gorevid != null ? gorevid.hashCode() : 0);
        result = 31 * result + (servisid != null ? servisid.hashCode() : 0);
        result = 31 * result + (bolgeid != null ? bolgeid.hashCode() : 0);
        result = 31 * result + (birimid != null ? birimid.hashCode() : 0);
        result = 31 * result + (takimid != null ? takimid.hashCode() : 0);
        result = 31 * result + (subeid != null ? subeid.hashCode() : 0);
        result = 31 * result + (isegiristarihi != null ? isegiristarihi.hashCode() : 0);
        result = 31 * result + (istencikistarihi != null ? istencikistarihi.hashCode() : 0);
        result = 31 * result + (istenayrilmanedeni != null ? istenayrilmanedeni.hashCode() : 0);
        result = 31 * result + (ucret != null ? ucret.hashCode() : 0);
        result = 31 * result + (saatucreti != null ? saatucreti.hashCode() : 0);
        result = 31 * result + (ucrettipi != null ? ucrettipi.hashCode() : 0);
        result = 31 * result + (ucretOnceki != null ? ucretOnceki.hashCode() : 0);
        result = 31 * result + (primucrettipi != null ? primucrettipi.hashCode() : 0);
        result = 31 * result + (primucreti != null ? primucreti.hashCode() : 0);
        result = 31 * result + (yolucrettipi != null ? yolucrettipi.hashCode() : 0);
        result = 31 * result + (yolucreti != null ? yolucreti.hashCode() : 0);
        result = 31 * result + (yemekucrettipi != null ? yemekucrettipi.hashCode() : 0);
        result = 31 * result + (yemekucreti != null ? yemekucreti.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(resim);
        result = 31 * result + (webadres != null ? webadres.hashCode() : 0);
        result = 31 * result + (vergino != null ? vergino.hashCode() : 0);
        result = 31 * result + (evtel != null ? evtel.hashCode() : 0);
        result = 31 * result + (ceptel != null ? ceptel.hashCode() : 0);
        result = 31 * result + (istel != null ? istel.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (egitim != null ? egitim.hashCode() : 0);
        result = 31 * result + (yabancidil != null ? yabancidil.hashCode() : 0);
        result = 31 * result + (askerlikdurumu != null ? askerlikdurumu.hashCode() : 0);
        result = 31 * result + (gozluk != null ? gozluk.hashCode() : 0);
        result = 31 * result + (sabika != null ? sabika.hashCode() : 0);
        result = 31 * result + (kilo != null ? kilo.hashCode() : 0);
        result = 31 * result + (boy != null ? boy.hashCode() : 0);
        result = 31 * result + (ayak != null ? ayak.hashCode() : 0);
        result = 31 * result + (pan != null ? pan.hashCode() : 0);
        result = 31 * result + (medenihali != null ? medenihali.hashCode() : 0);
        result = 31 * result + (cocuksayisi != null ? cocuksayisi.hashCode() : 0);
        result = 31 * result + (esdurumu != null ? esdurumu.hashCode() : 0);
        result = 31 * result + (adres != null ? adres.hashCode() : 0);
        result = 31 * result + (il != null ? il.hashCode() : 0);
        result = 31 * result + (ilce != null ? ilce.hashCode() : 0);
        result = 31 * result + (ilksoyad != null ? ilksoyad.hashCode() : 0);
        result = 31 * result + (kimlikno != null ? kimlikno.hashCode() : 0);
        result = 31 * result + (babaad != null ? babaad.hashCode() : 0);
        result = 31 * result + (annead != null ? annead.hashCode() : 0);
        result = 31 * result + (dogumyeri != null ? dogumyeri.hashCode() : 0);
        result = 31 * result + (dogumtarihi != null ? dogumtarihi.hashCode() : 0);
        result = 31 * result + (kangrubu != null ? kangrubu.hashCode() : 0);
        result = 31 * result + (uyruk != null ? uyruk.hashCode() : 0);
        result = 31 * result + (cinsiyet != null ? cinsiyet.hashCode() : 0);
        result = 31 * result + (nufusIl != null ? nufusIl.hashCode() : 0);
        result = 31 * result + (nufusIlce != null ? nufusIlce.hashCode() : 0);
        result = 31 * result + (nufusMahkoy != null ? nufusMahkoy.hashCode() : 0);
        result = 31 * result + (nufusCiltno != null ? nufusCiltno.hashCode() : 0);
        result = 31 * result + (nufusAilesirano != null ? nufusAilesirano.hashCode() : 0);
        result = 31 * result + (nufusSirano != null ? nufusSirano.hashCode() : 0);
        result = 31 * result + (bankaSubeadi != null ? bankaSubeadi.hashCode() : 0);
        result = 31 * result + (bankaHesapno != null ? bankaHesapno.hashCode() : 0);
        result = 31 * result + (ehliyetSinif != null ? ehliyetSinif.hashCode() : 0);
        result = 31 * result + (ehliyetVerililce != null ? ehliyetVerililce.hashCode() : 0);
        result = 31 * result + (ehliyetBelgeno != null ? ehliyetBelgeno.hashCode() : 0);
        result = 31 * result + (ehliyetVertarih != null ? ehliyetVertarih.hashCode() : 0);
        result = 31 * result + (ehliyetKulcihazprotez != null ? ehliyetKulcihazprotez.hashCode() : 0);
        result = 31 * result + (personelturu != null ? personelturu.hashCode() : 0);
        result = 31 * result + (aciklama != null ? aciklama.hashCode() : 0);
        result = 31 * result + (gunlukkontor != null ? gunlukkontor.hashCode() : 0);
        result = 31 * result + (uyedurumu != null ? uyedurumu.hashCode() : 0);
        result = 31 * result + (uyebaslamatarihi != null ? uyebaslamatarihi.hashCode() : 0);
        result = 31 * result + (uyebitistarihi != null ? uyebitistarihi.hashCode() : 0);
        result = 31 * result + (odedigitutar != null ? odedigitutar.hashCode() : 0);
        result = 31 * result + (kalantutar != null ? kalantutar.hashCode() : 0);
        result = 31 * result + (uyebaslamasaati != null ? uyebaslamasaati.hashCode() : 0);
        result = 31 * result + (uyebitissaati != null ? uyebitissaati.hashCode() : 0);
        result = 31 * result + (ogrenciKayittarihi != null ? ogrenciKayittarihi.hashCode() : 0);
        result = 31 * result + (ogrenciCikistarihi != null ? ogrenciCikistarihi.hashCode() : 0);
        result = 31 * result + (ogrenciBasariorani != null ? ogrenciBasariorani.hashCode() : 0);
        result = 31 * result + (ogrenciGrupid != null ? ogrenciGrupid.hashCode() : 0);
        result = 31 * result + (ogrenciBolumid != null ? ogrenciBolumid.hashCode() : 0);
        result = 31 * result + (ogrenciSinifid != null ? ogrenciSinifid.hashCode() : 0);
        result = 31 * result + (ogretmenBransid != null ? ogretmenBransid.hashCode() : 0);
        result = 31 * result + (ogretmenDersid != null ? ogretmenDersid.hashCode() : 0);
        result = 31 * result + (ogrenciAlanturu != null ? ogrenciAlanturu.hashCode() : 0);
        result = 31 * result + (ogrenciGeldigiokul != null ? ogrenciGeldigiokul.hashCode() : 0);
        result = 31 * result + (ogrenciSinif != null ? ogrenciSinif.hashCode() : 0);
        result = 31 * result + (ogrenciBolum != null ? ogrenciBolum.hashCode() : 0);
        result = 31 * result + (ogrenciOkulno != null ? ogrenciOkulno.hashCode() : 0);
        result = 31 * result + (ogrenciVeliad != null ? ogrenciVeliad.hashCode() : 0);
        result = 31 * result + (ogrenciVelievtel != null ? ogrenciVelievtel.hashCode() : 0);
        result = 31 * result + (ogrenciVeliistel != null ? ogrenciVeliistel.hashCode() : 0);
        result = 31 * result + (ogrenciVeliceptel != null ? ogrenciVeliceptel.hashCode() : 0);
        result = 31 * result + (mesaisaatucreti != null ? mesaisaatucreti.hashCode() : 0);
        result = 31 * result + (ozelucrettipi != null ? ozelucrettipi.hashCode() : 0);
        result = 31 * result + (ozelucret != null ? ozelucret.hashCode() : 0);
        result = 31 * result + (yetkiid != null ? yetkiid.hashCode() : 0);
        result = 31 * result + (uyetipiid != null ? uyetipiid.hashCode() : 0);
        result = 31 * result + (ilkgiristarihi != null ? ilkgiristarihi.hashCode() : 0);
        result = 31 * result + (songiristarihi != null ? songiristarihi.hashCode() : 0);
        result = 31 * result + (toplamgirissayisi != null ? toplamgirissayisi.hashCode() : 0);
        result = 31 * result + (gecisgrupid != null ? gecisgrupid.hashCode() : 0);
        result = 31 * result + (gecisyetki != null ? gecisyetki.hashCode() : 0);
        result = 31 * result + (toplamkontor != null ? toplamkontor.hashCode() : 0);
        result = 31 * result + (kalankontor != null ? kalankontor.hashCode() : 0);
        result = 31 * result + (isegiristarihi1 != null ? isegiristarihi1.hashCode() : 0);
        result = 31 * result + (ucret1 != null ? ucret1.hashCode() : 0);
        result = 31 * result + (fazlamesaialir != null ? fazlamesaialir.hashCode() : 0);
        result = 31 * result + (devamsizlikcezasi != null ? devamsizlikcezasi.hashCode() : 0);
        result = 31 * result + (agialir != null ? agialir.hashCode() : 0);
        result = 31 * result + (nufusCuzdanverildigiyer != null ? nufusCuzdanverildigiyer.hashCode() : 0);
        result = 31 * result + (nufusCuzdanverilisnedeni != null ? nufusCuzdanverilisnedeni.hashCode() : 0);
        result = 31 * result + (nufusCuzdankayitno != null ? nufusCuzdankayitno.hashCode() : 0);
        result = 31 * result + (nufusCuzdanverilistarihi != null ? nufusCuzdanverilistarihi.hashCode() : 0);
        result = 31 * result + (elbisebedenno != null ? elbisebedenno.hashCode() : 0);
        result = 31 * result + (kapiyetki != null ? kapiyetki.hashCode() : 0);
        result = 31 * result + (yillikizinonceki != null ? yillikizinonceki.hashCode() : 0);
        result = 31 * result + (saglikraporu1 != null ? saglikraporu1.hashCode() : 0);
        result = 31 * result + (saglikraporu2 != null ? saglikraporu2.hashCode() : 0);
        result = 31 * result + (saglikraporu3 != null ? saglikraporu3.hashCode() : 0);
        result = 31 * result + (ay != null ? ay.hashCode() : 0);
        result = 31 * result + (parmaktanimlandi != null ? parmaktanimlandi.hashCode() : 0);
        result = 31 * result + (sgkNo != null ? sgkNo.hashCode() : 0);
        result = 31 * result + (sgkIsegiristarihi != null ? sgkIsegiristarihi.hashCode() : 0);
        result = 31 * result + (sgkIstencikiskodu != null ? sgkIstencikiskodu.hashCode() : 0);
        result = 31 * result + (sgkMeslekkodu != null ? sgkMeslekkodu.hashCode() : 0);
        result = 31 * result + (sgkCalismadonemi != null ? sgkCalismadonemi.hashCode() : 0);
        result = 31 * result + (sgkKapsam != null ? sgkKapsam.hashCode() : 0);
        result = 31 * result + (sgkUcrettipi != null ? sgkUcrettipi.hashCode() : 0);
        result = 31 * result + (sgkHesaptipi != null ? sgkHesaptipi.hashCode() : 0);
        result = 31 * result + (sgkIssizliksigortakes != null ? sgkIssizliksigortakes.hashCode() : 0);
        result = 31 * result + (sgkGrubu != null ? sgkGrubu.hashCode() : 0);
        result = 31 * result + (sgkBelgeturu != null ? sgkBelgeturu.hashCode() : 0);
        result = 31 * result + (sgkTabioldugukanun != null ? sgkTabioldugukanun.hashCode() : 0);
        result = 31 * result + (sgkKanunbitistarihi != null ? sgkKanunbitistarihi.hashCode() : 0);
        result = 31 * result + (sgkOzurlulukderecesi != null ? sgkOzurlulukderecesi.hashCode() : 0);
        result = 31 * result + (ilkisegiristarihi != null ? ilkisegiristarihi.hashCode() : 0);
        result = 31 * result + (wckesintisiuygula != null ? wckesintisiuygula.hashCode() : 0);
        result = 31 * result + (ncsaatucreti != null ? ncsaatucreti.hashCode() : 0);
        return result;
    }
}
