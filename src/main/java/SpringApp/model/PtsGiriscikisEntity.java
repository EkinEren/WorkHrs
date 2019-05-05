package SpringApp.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "pts_giriscikis", schema = "workhrsdb")
public class PtsGiriscikisEntity {
    private Long id;
    private Long personelid;
    private Date giristarihi;
    private Time girissaati;
    private Date cikistarihi;
    private Time cikissaati;
    private String toplamsure;
    private String ellegiris;
    private String ellecikis;
    private String islemturu;
    private String izintipi;
    private Integer izinturid;
    private String izinsure;
    private String aciklama;
    private Byte geciptal;
    private Byte erkiptal;
    private Byte eksiptal;
    private Byte mesaiiptal;
    private Integer kapiterminalid;
    private String giristerminalno;
    private String cikisterminalno;
    private String kapiterminalkod;
    private String surefarki;
    private Integer isurefarki;
    private Integer iizinsure;
    private String kartno;
    private Integer usziKesbordroid;
    private Time girissaati1;
    private Time cikissaati1;

    protected PtsGiriscikisEntity(){}

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
    @Column(name = "personelid",nullable = false)
    public Long getPersonelid() {
        return personelid;
    }

    public void setPersonelid(Long personelid) {
        this.personelid = personelid;
    }

    @Basic
    @Column(name = "giristarihi")
    public Date getGiristarihi() {
        return giristarihi;
    }

    public void setGiristarihi(Date giristarihi) {
        this.giristarihi = giristarihi;
    }

    @Basic
    @Column(name = "girissaati")
    public Time getGirissaati() {
        return girissaati;
    }

    public void setGirissaati(Time girissaati) {
        this.girissaati = girissaati;
    }

    @Basic
    @Column(name = "cikistarihi")
    public Date getCikistarihi() {
        return cikistarihi;
    }

    public void setCikistarihi(Date cikistarihi) {
        this.cikistarihi = cikistarihi;
    }

    @Basic
    @Column(name = "cikissaati")
    public Time getCikissaati() {
        return cikissaati;
    }

    public void setCikissaati(Time cikissaati) {
        this.cikissaati = cikissaati;
    }

    @Basic
    @Column(name = "toplamsure")
    public String getToplamsure() {
        return toplamsure;
    }

    public void setToplamsure(String toplamsure) {
        this.toplamsure = toplamsure;
    }

    @Basic
    @Column(name = "ellegiris")
    public String getEllegiris() {
        return ellegiris;
    }

    public void setEllegiris(String ellegiris) {
        this.ellegiris = ellegiris;
    }

    @Basic
    @Column(name = "ellecikis")
    public String getEllecikis() {
        return ellecikis;
    }

    public void setEllecikis(String ellecikis) {
        this.ellecikis = ellecikis;
    }

    @Basic
    @Column(name = "islemturu")
    public String getIslemturu() {
        return islemturu;
    }

    public void setIslemturu(String islemturu) {
        this.islemturu = islemturu;
    }

    @Basic
    @Column(name = "izintipi")
    public String getIzintipi() {
        return izintipi;
    }

    public void setIzintipi(String izintipi) {
        this.izintipi = izintipi;
    }

    @Basic
    @Column(name = "izinturid")
    public Integer getIzinturid() {
        return izinturid;
    }

    public void setIzinturid(Integer izinturid) {
        this.izinturid = izinturid;
    }

    @Basic
    @Column(name = "izinsure")
    public String getIzinsure() {
        return izinsure;
    }

    public void setIzinsure(String izinsure) {
        this.izinsure = izinsure;
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
    @Column(name = "geciptal")
    public Byte getGeciptal() {
        return geciptal;
    }

    public void setGeciptal(Byte geciptal) {
        this.geciptal = geciptal;
    }

    @Basic
    @Column(name = "erkiptal")
    public Byte getErkiptal() {
        return erkiptal;
    }

    public void setErkiptal(Byte erkiptal) {
        this.erkiptal = erkiptal;
    }

    @Basic
    @Column(name = "eksiptal")
    public Byte getEksiptal() {
        return eksiptal;
    }

    public void setEksiptal(Byte eksiptal) {
        this.eksiptal = eksiptal;
    }

    @Basic
    @Column(name = "mesaiiptal")
    public Byte getMesaiiptal() {
        return mesaiiptal;
    }

    public void setMesaiiptal(Byte mesaiiptal) {
        this.mesaiiptal = mesaiiptal;
    }

    @Basic
    @Column(name = "kapiterminalid")
    public Integer getKapiterminalid() {
        return kapiterminalid;
    }

    public void setKapiterminalid(Integer kapiterminalid) {
        this.kapiterminalid = kapiterminalid;
    }

    @Basic
    @Column(name = "giristerminalno")
    public String getGiristerminalno() {
        return giristerminalno;
    }

    public void setGiristerminalno(String giristerminalno) {
        this.giristerminalno = giristerminalno;
    }

    @Basic
    @Column(name = "cikisterminalno")
    public String getCikisterminalno() {
        return cikisterminalno;
    }

    public void setCikisterminalno(String cikisterminalno) {
        this.cikisterminalno = cikisterminalno;
    }

    @Basic
    @Column(name = "kapiterminalkod")
    public String getKapiterminalkod() {
        return kapiterminalkod;
    }

    public void setKapiterminalkod(String kapiterminalkod) {
        this.kapiterminalkod = kapiterminalkod;
    }

    @Basic
    @Column(name = "surefarki")
    public String getSurefarki() {
        return surefarki;
    }

    public void setSurefarki(String surefarki) {
        this.surefarki = surefarki;
    }

    @Basic
    @Column(name = "isurefarki")
    public Integer getIsurefarki() {
        return isurefarki;
    }

    public void setIsurefarki(Integer isurefarki) {
        this.isurefarki = isurefarki;
    }

    @Basic
    @Column(name = "iizinsure")
    public Integer getIizinsure() {
        return iizinsure;
    }

    public void setIizinsure(Integer iizinsure) {
        this.iizinsure = iizinsure;
    }

    @Basic
    @Column(name = "kartno")
    public String getKartno() {
        return kartno;
    }

    public void setKartno(String kartno) {
        this.kartno = kartno;
    }

    @Basic
    @Column(name = "usziKesbordroid")
    public Integer getUsziKesbordroid() {
        return usziKesbordroid;
    }

    public void setUsziKesbordroid(Integer usziKesbordroid) {
        this.usziKesbordroid = usziKesbordroid;
    }

    @Basic
    @Column(name = "girissaati1")
    public Time getGirissaati1() {
        return girissaati1;
    }

    public void setGirissaati1(Time girissaati1) {
        this.girissaati1 = girissaati1;
    }

    @Basic
    @Column(name = "cikissaati1")
    public Time getCikissaati1() {
        return cikissaati1;
    }

    public void setCikissaati1(Time cikissaati1) {
        this.cikissaati1 = cikissaati1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PtsGiriscikisEntity that = (PtsGiriscikisEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (personelid != null ? !personelid.equals(that.personelid) : that.personelid != null) return false;
        if (giristarihi != null ? !giristarihi.equals(that.giristarihi) : that.giristarihi != null) return false;
        if (girissaati != null ? !girissaati.equals(that.girissaati) : that.girissaati != null) return false;
        if (cikistarihi != null ? !cikistarihi.equals(that.cikistarihi) : that.cikistarihi != null) return false;
        if (cikissaati != null ? !cikissaati.equals(that.cikissaati) : that.cikissaati != null) return false;
        if (toplamsure != null ? !toplamsure.equals(that.toplamsure) : that.toplamsure != null) return false;
        if (ellegiris != null ? !ellegiris.equals(that.ellegiris) : that.ellegiris != null) return false;
        if (ellecikis != null ? !ellecikis.equals(that.ellecikis) : that.ellecikis != null) return false;
        if (islemturu != null ? !islemturu.equals(that.islemturu) : that.islemturu != null) return false;
        if (izintipi != null ? !izintipi.equals(that.izintipi) : that.izintipi != null) return false;
        if (izinturid != null ? !izinturid.equals(that.izinturid) : that.izinturid != null) return false;
        if (izinsure != null ? !izinsure.equals(that.izinsure) : that.izinsure != null) return false;
        if (aciklama != null ? !aciklama.equals(that.aciklama) : that.aciklama != null) return false;
        if (geciptal != null ? !geciptal.equals(that.geciptal) : that.geciptal != null) return false;
        if (erkiptal != null ? !erkiptal.equals(that.erkiptal) : that.erkiptal != null) return false;
        if (eksiptal != null ? !eksiptal.equals(that.eksiptal) : that.eksiptal != null) return false;
        if (mesaiiptal != null ? !mesaiiptal.equals(that.mesaiiptal) : that.mesaiiptal != null) return false;
        if (kapiterminalid != null ? !kapiterminalid.equals(that.kapiterminalid) : that.kapiterminalid != null)
            return false;
        if (giristerminalno != null ? !giristerminalno.equals(that.giristerminalno) : that.giristerminalno != null)
            return false;
        if (cikisterminalno != null ? !cikisterminalno.equals(that.cikisterminalno) : that.cikisterminalno != null)
            return false;
        if (kapiterminalkod != null ? !kapiterminalkod.equals(that.kapiterminalkod) : that.kapiterminalkod != null)
            return false;
        if (surefarki != null ? !surefarki.equals(that.surefarki) : that.surefarki != null) return false;
        if (isurefarki != null ? !isurefarki.equals(that.isurefarki) : that.isurefarki != null) return false;
        if (iizinsure != null ? !iizinsure.equals(that.iizinsure) : that.iizinsure != null) return false;
        if (kartno != null ? !kartno.equals(that.kartno) : that.kartno != null) return false;
        if (usziKesbordroid != null ? !usziKesbordroid.equals(that.usziKesbordroid) : that.usziKesbordroid != null)
            return false;
        if (girissaati1 != null ? !girissaati1.equals(that.girissaati1) : that.girissaati1 != null) return false;
        if (cikissaati1 != null ? !cikissaati1.equals(that.cikissaati1) : that.cikissaati1 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (personelid != null ? personelid.hashCode() : 0);
        result = 31 * result + (giristarihi != null ? giristarihi.hashCode() : 0);
        result = 31 * result + (girissaati != null ? girissaati.hashCode() : 0);
        result = 31 * result + (cikistarihi != null ? cikistarihi.hashCode() : 0);
        result = 31 * result + (cikissaati != null ? cikissaati.hashCode() : 0);
        result = 31 * result + (toplamsure != null ? toplamsure.hashCode() : 0);
        result = 31 * result + (ellegiris != null ? ellegiris.hashCode() : 0);
        result = 31 * result + (ellecikis != null ? ellecikis.hashCode() : 0);
        result = 31 * result + (islemturu != null ? islemturu.hashCode() : 0);
        result = 31 * result + (izintipi != null ? izintipi.hashCode() : 0);
        result = 31 * result + (izinturid != null ? izinturid.hashCode() : 0);
        result = 31 * result + (izinsure != null ? izinsure.hashCode() : 0);
        result = 31 * result + (aciklama != null ? aciklama.hashCode() : 0);
        result = 31 * result + (geciptal != null ? geciptal.hashCode() : 0);
        result = 31 * result + (erkiptal != null ? erkiptal.hashCode() : 0);
        result = 31 * result + (eksiptal != null ? eksiptal.hashCode() : 0);
        result = 31 * result + (mesaiiptal != null ? mesaiiptal.hashCode() : 0);
        result = 31 * result + (kapiterminalid != null ? kapiterminalid.hashCode() : 0);
        result = 31 * result + (giristerminalno != null ? giristerminalno.hashCode() : 0);
        result = 31 * result + (cikisterminalno != null ? cikisterminalno.hashCode() : 0);
        result = 31 * result + (kapiterminalkod != null ? kapiterminalkod.hashCode() : 0);
        result = 31 * result + (surefarki != null ? surefarki.hashCode() : 0);
        result = 31 * result + (isurefarki != null ? isurefarki.hashCode() : 0);
        result = 31 * result + (iizinsure != null ? iizinsure.hashCode() : 0);
        result = 31 * result + (kartno != null ? kartno.hashCode() : 0);
        result = 31 * result + (usziKesbordroid != null ? usziKesbordroid.hashCode() : 0);
        result = 31 * result + (girissaati1 != null ? girissaati1.hashCode() : 0);
        result = 31 * result + (cikissaati1 != null ? cikissaati1.hashCode() : 0);
        return result;
    }
}
