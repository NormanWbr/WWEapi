package be.wamberchies.WWEapi.controller;

import be.wamberchies.WWEapi.model.dto.SuperstarDTO;
import be.wamberchies.WWEapi.model.form.SuperstarForm;
import be.wamberchies.WWEapi.service.SuperstarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/superstar")
public class SuperstarController {

    private SuperstarService superstarService;

    public SuperstarController(SuperstarService superstarService) {
        this.superstarService = superstarService;
    }

    @GetMapping("/all")
    public List<SuperstarDTO> getAll() {
        return superstarService.getAll();
    }

    @GetMapping("/{id:[0-9]+}")
    public SuperstarDTO getOne(@PathVariable long id) {
        return superstarService.getOne(id);
    }

    @PostMapping("/add")
    public void addSuperstar(@RequestBody SuperstarForm superstarForm) {
        superstarService.addSuperstar(superstarForm);
    }
}
