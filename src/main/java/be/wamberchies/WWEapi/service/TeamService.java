package be.wamberchies.WWEapi.service;

import be.wamberchies.WWEapi.model.dto.TeamDTO;
import be.wamberchies.WWEapi.model.form.TeamForm;

import java.util.List;

public interface TeamService {

    TeamDTO getOne(long id);

    List<TeamDTO> getAll();

    void addTeam(TeamForm teamForm);

}
