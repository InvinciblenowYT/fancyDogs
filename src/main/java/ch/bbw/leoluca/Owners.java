package ch.bbw.leoluca;
import javax.persistence.*;

@Entity (name = "owners")
public class Owners {
    @Id
    private Long halter_id;
    private String alter;
    private String geschlecht;
    private int stadtkreis;
    private int stadtquartier;

    public Owners() {

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

    public Owners(Long halter_id, String alter, String geschlecht, int stadtkreis, int stadtquartier) {
        this.halter_id = halter_id;
        this.alter = alter;
        this.geschlecht = geschlecht;
        this.stadtkreis = stadtkreis;
        this.stadtquartier = stadtquartier;
    }
}
