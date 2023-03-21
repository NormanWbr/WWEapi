package be.wamberchies.WWEapi.model.form;

import be.wamberchies.WWEapi.model.entity.Championship;
import be.wamberchies.WWEapi.model.entity.enums.Gender;
import lombok.Data;

@Data
public class ChampionshipForm {


    private String name;
    private String description;
    private Gender gender;
    public Championship toEntity() {

        Championship championship = new Championship();

        championship.setName(this.name);
        championship.setDescription(this.description);

        return championship;

    }

}
