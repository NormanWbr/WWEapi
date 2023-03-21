package be.wamberchies.WWEapi.service.impl;

import be.wamberchies.WWEapi.exception.RessourceNotFoundException;
import be.wamberchies.WWEapi.model.dto.ChampionshipDTO;
import be.wamberchies.WWEapi.model.entity.Championship;
import be.wamberchies.WWEapi.model.form.ChampionshipForm;
import be.wamberchies.WWEapi.repository.ChampionshipRepository;
import be.wamberchies.WWEapi.service.ChampionshipService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChampionshipServiceImpl implements ChampionshipService {

    private final ChampionshipRepository championshipRepository;

    public ChampionshipServiceImpl(ChampionshipRepository championshipRepository) {
        this.championshipRepository = championshipRepository;
    }

    @Override
    public ChampionshipDTO getOne(long id) {
        return championshipRepository.findById(id)
                .map(ChampionshipDTO::from)
                .orElseThrow(RessourceNotFoundException::new);
    }

    @Override
    public List<ChampionshipDTO> getAll() {
        return championshipRepository.findAll().stream()
                .map(ChampionshipDTO::from)
                .toList();
    }

    @Override
    public void addChampionship(ChampionshipForm championshipForm) {
        Championship championship = new Championship();
        championship.setName(championshipForm.getName());
        championship.setDescription(championshipForm.getDescription());
        championshipRepository.save(championship);
    }
}
