package be.wamberchies.WWEapi.service;

import be.wamberchies.WWEapi.model.dto.ChampionshipDTO;
import be.wamberchies.WWEapi.model.form.ChampionshipForm;

import java.util.List;

public interface ChampionshipService {

    ChampionshipDTO getOne(long id);

    List<ChampionshipDTO> getAll();

    void addChampionship(ChampionshipForm championshipForm);

}
