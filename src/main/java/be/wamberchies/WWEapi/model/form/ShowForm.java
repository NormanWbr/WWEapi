package be.wamberchies.WWEapi.model.form;

import be.wamberchies.WWEapi.model.entity.Show;
import be.wamberchies.WWEapi.model.entity.enums.Frequency;
import lombok.Data;

@Data
public class ShowForm {


    private String name;

    private Frequency frequency;

    public Show toEntity() {
        Show show = new Show();
        show.setName(this.name);
        show.setFrequency(this.frequency);
        return show;
    }

}
