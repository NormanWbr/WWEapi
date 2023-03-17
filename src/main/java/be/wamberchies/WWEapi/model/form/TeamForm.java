package be.wamberchies.WWEapi.model.form;

import be.wamberchies.WWEapi.model.entity.Team;
import lombok.Data;

@Data
public class TeamForm {

    private Long id;
    private String name;

    public Team toEntity() {
        Team team = new Team();

        team.setId(this.id);
        team.setName(this.name);

        return team;
    }

}
