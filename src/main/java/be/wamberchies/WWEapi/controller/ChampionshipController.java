package be.wamberchies.WWEapi.controller;

import be.wamberchies.WWEapi.model.dto.ChampionshipDTO;
import be.wamberchies.WWEapi.model.form.ChampionshipForm;
import be.wamberchies.WWEapi.service.ChampionshipService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/championship")
public class ChampionshipController {

    private final ChampionshipService championshipService;

    public ChampionshipController(ChampionshipService championshipService) {
        this.championshipService = championshipService;
    }

    @GetMapping("/all")
    public List<ChampionshipDTO> getAll() {
        return championshipService.getAll();
    }

    @GetMapping("/{id:[0-9]+}")
    public ChampionshipDTO getOne(@PathVariable long id) {
        return championshipService.getOne(id);
    }

    @PostMapping("/add")
    public void addSuperstar(@RequestBody ChampionshipForm championshipForm) {
        championshipService.addChampionship(championshipForm);
    }

}
