package be.wamberchies.WWEapi.controller;

import be.wamberchies.WWEapi.model.dto.PriseDTO;
import be.wamberchies.WWEapi.model.form.PriseForm;
import be.wamberchies.WWEapi.service.PriseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/prise")
public class PriseController {

    private final PriseService priseService;

    public PriseController(PriseService priseService) {
        this.priseService = priseService;
    }

    @GetMapping("/all")
    public List<PriseDTO> getAll() {
        return priseService.getAll();
    }

    @GetMapping("/{id:[0-9]+}")
    public PriseDTO getOne(@PathVariable long id) {
        return priseService.getOne(id);
    }

    @PostMapping("/add")
    public void addSuperstar(@RequestBody PriseForm priseForm) {
        priseService.addPrise(priseForm);
    }

}
