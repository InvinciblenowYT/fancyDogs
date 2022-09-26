package ch.bbw.leoluca.model;

import javax.persistence.*;

@Entity(name = "dogs")
public class Dogs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "halter_id")
    private Owners owners;
    private String rasse1;
    private String rasse1_mischling;
    private String rasse2;
    private String rasse2_mischling;
    private String rassentyp;
    private int geburtsjahr;
    private String geschlecht;
    private String hundefarbe;

    public Dogs() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Owners getOwners() {
        return owners;
    }

    public void setOwners(Owners owners) {
        this.owners = owners;
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

    public int getGeburtsjahr() {
        return geburtsjahr;
    }

    public void setGeburtsjahr(int geburtsjahr_hund) {
        this.geburtsjahr = geburtsjahr_hund;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(String geschlecht_hund) {
        this.geschlecht = geschlecht_hund;
    }

    public String getHundefarbe() {
        return hundefarbe;
    }

    public void setHundefarbe(String hundefarbe) {
        this.hundefarbe = hundefarbe;
    }

    public Dogs(Long id, Owners owners, String rasse1, String rasse1_mischling, String rasse2, String rasse2_mischling, String rassentyp, int geburtsjahr, String geschlecht, String hundefarbe) {
        this.id = id;
        this.owners = owners;
        this.rasse1 = rasse1;
        this.rasse1_mischling = rasse1_mischling;
        this.rasse2 = rasse2;
        this.rasse2_mischling = rasse2_mischling;
        this.rassentyp = rassentyp;
        this.geburtsjahr = geburtsjahr;
        this.geschlecht = geschlecht;
        this.hundefarbe = hundefarbe;
    }
}
