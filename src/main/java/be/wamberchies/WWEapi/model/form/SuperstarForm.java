package be.wamberchies.WWEapi.model.form;

import be.wamberchies.WWEapi.model.entity.Superstar;
import be.wamberchies.WWEapi.model.entity.enums.Gender;
import lombok.Data;

@Data
public class SuperstarForm {
    private String name;
    private Gender gender;
    private double height;
    private double weight;
    private String entranceMusic;
    private Boolean Heel;

    public Superstar toEntity() {
        Superstar superstar = new Superstar();
        superstar.setName(this.name);
        superstar.setGender(this.gender);
        superstar.setHeight(this.height);
        superstar.setWeight(this.weight);
        superstar.setEntranceMusic(this.entranceMusic);
        superstar.setHeel(this.Heel);
        return superstar;
    }

}
