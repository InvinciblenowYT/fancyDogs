package ch.bbw.leoluca;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name = "owners")
public class DogOwners {
    @Id
    private Long halter_id;
    private String alter;
    private String geschlecht;
    private int stadtkreis;
    private int stadtquartier;
    private String rasse1;
    private String rasse1_mischling;
    private String rasse2;
    private String rasse2_mischling;
    private String rassentyp;
    private int geburtsjahr_hund;
    private String geschlecht_hund;
    private String hundefarbe;

    public DogOwners(Long halter_id, String alter, String geschlecht, int stadtkreis, int stadtquartier, String rasse1, String rasse1_mischling, String rasse2, String rasse2_mischling, String rassentyp, int geburtsjahr_hund, String geschlecht_hund, String hundefarbe) {
        this.halter_id = halter_id;
        this.alter = alter;
        this.geschlecht = geschlecht;
        this.stadtkreis = stadtkreis;
        this.stadtquartier = stadtquartier;
        this.rasse1 = rasse1;
        this.rasse1_mischling = rasse1_mischling;
        this.rasse2 = rasse2;
        this.rasse2_mischling = rasse2_mischling;
        this.rassentyp = rassentyp;
        this.geburtsjahr_hund = geburtsjahr_hund;
        this.geschlecht_hund = geschlecht_hund;
        this.hundefarbe = hundefarbe;
    }

    public DogOwners() {

    }

    public Long getHalter_id() {
        return halter_id;
    }

    public void setHalter_id(Long halter_id) {
        this.halter_id = halter_id;
    }

    public String getAlter() {
        return alter;
    }

    public void setAlter(String alter) {
        this.alter = alter;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }

    public int getStadtkreis() {
        return stadtkreis;
    }

    public void setStadtkreis(int stadtkreis) {
        this.stadtkreis = stadtkreis;
    }

    public int getStadtquartier() {
        return stadtquartier;
    }

    public void setStadtquartier(int stadtquartier) {
        this.stadtquartier = stadtquartier;
    }

    public String getRasse1() {
        return rasse1;
    }

    public void setRasse1(String rasse1) {
        this.rasse1 = rasse1;
    }

    public String getRasse1_mischling() {
        return rasse1_mischling;
    }

    public void setRasse1_mischling(String rasse1_mischling) {
        this.rasse1_mischling = rasse1_mischling;
    }

    public String getRasse2() {
        return rasse2;
    }

    public void setRasse2(String rasse2) {
        this.rasse2 = rasse2;
    }

    public String getRasse2_mischling() {
        return rasse2_mischling;
    }

    public void setRasse2_mischling(String rasse2_mischling) {
        this.rasse2_mischling = rasse2_mischling;
    }

    public String getRassentyp() {
        return rassentyp;
    }

    public void setRassentyp(String rassentyp) {
        this.rassentyp = rassentyp;
    }

    public int getGeburtsjahr_hund() {
        return geburtsjahr_hund;
    }

    public void setGeburtsjahr_hund(int geburtsjahr_hund) {
        this.geburtsjahr_hund = geburtsjahr_hund;
    }

    public String getGeschlecht_hund() {
        return geschlecht_hund;
    }

    public void setGeschlecht_hund(String geschlecht_hund) {
        this.geschlecht_hund = geschlecht_hund;
    }

    public String getHundefarbe() {
        return hundefarbe;
    }

    public void setHundefarbe(String hundefarbe) {
        this.hundefarbe = hundefarbe;
    }
}
