package be.wamberchies.WWEapi.controller;

import be.wamberchies.WWEapi.model.dto.TeamDTO;
import be.wamberchies.WWEapi.model.form.TeamForm;
import be.wamberchies.WWEapi.service.TeamService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/team")
public class TeamController {

    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping("/all")
    public List<TeamDTO> getAll() {
        return teamService.getAll();
    }

    @GetMapping("/{id:[0-9]+}")
    public TeamDTO getOne(@PathVariable long id) {
        return teamService.getOne(id);
    }

    @PostMapping("/add")
    public void addSuperstar(@RequestBody TeamForm teamForm) {
        teamService.addTeam(teamForm);
    }

}
