package be.wamberchies.WWEapi.controller;

import be.wamberchies.WWEapi.model.dto.ShowDTO;
import be.wamberchies.WWEapi.model.form.ShowForm;
import be.wamberchies.WWEapi.service.ShowService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/show")
public class ShowController {

    private final ShowService showService;

    public ShowController(ShowService showService) {
        this.showService = showService;
    }

    @GetMapping("/all")
    public List<ShowDTO> getAll() {
        return showService.getAll();
    }

    @GetMapping("/{id:[0-9]+}")
    public ShowDTO getOne(@PathVariable long id) {
        return showService.getOne(id);
    }

    @PostMapping("/add")
    public void addSuperstar(@RequestBody ShowForm showForm) {
        showService.addShow(showForm);
    }

}
