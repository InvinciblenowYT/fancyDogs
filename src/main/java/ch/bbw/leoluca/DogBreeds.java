package ch.bbw.leoluca;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "breeds")
public class DogBreeds {
    @Id
    private String rassen_typ;
    private String hunde_rasse;

    public DogBreeds(String rassen_typ, String hunde_rasse) {
        this.rassen_typ = rassen_typ;
        this.hunde_rasse = hunde_rasse;
    }

    public DogBreeds() {

    }


    public String getRassen_typ() {
        return rassen_typ;
    }

    public void setRassen_typ(String rassen_typ) {
        this.rassen_typ = rassen_typ;
    }

    public String getHunde_rasse() {
        return hunde_rasse;
    }

    public void setHunde_rasse(String hunde_rasse) {
        this.hunde_rasse = hunde_rasse;
    }
}
