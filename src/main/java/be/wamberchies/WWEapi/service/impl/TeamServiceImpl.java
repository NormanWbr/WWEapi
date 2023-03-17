package be.wamberchies.WWEapi.service.impl;

import be.wamberchies.WWEapi.exception.RessourceNotFoundException;
import be.wamberchies.WWEapi.model.dto.TeamDTO;
import be.wamberchies.WWEapi.model.entity.Team;
import be.wamberchies.WWEapi.model.form.TeamForm;
import be.wamberchies.WWEapi.repository.TeamRepository;
import be.wamberchies.WWEapi.service.TeamService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {

    private final TeamRepository teamRepository;

    public TeamServiceImpl(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @Override
    public TeamDTO getOne(long id) {
        return teamRepository.findById(id)
                .map(TeamDTO::from)
                .orElseThrow(RessourceNotFoundException::new);
    }

    @Override
    public List<TeamDTO> getAll() {
        return teamRepository.findAll().stream()
                .map(TeamDTO::from)
                .toList();
    }

    @Override
    public void addTeam(TeamForm teamForm) {
        Team team = new Team();

        team.setName(teamForm.getName());

        teamRepository.save(team);
    }

}
