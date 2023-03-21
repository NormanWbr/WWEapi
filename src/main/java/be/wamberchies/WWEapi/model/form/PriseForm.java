package be.wamberchies.WWEapi.model.form;

import be.wamberchies.WWEapi.model.entity.Prise;
import be.wamberchies.WWEapi.model.entity.enums.Type;
import lombok.Data;

@Data
public class PriseForm {

    private String name;
    private String description;
    private Type type;

    public Prise toEntity(){
        Prise prise = new Prise();

        prise.setName(this.name);
        prise.setType(this.type);

        return prise;
    }

}
