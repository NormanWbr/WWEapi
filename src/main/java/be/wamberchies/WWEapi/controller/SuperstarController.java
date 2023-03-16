package be.wamberchies.WWEapi.controller;

import be.wamberchies.WWEapi.model.dto.SuperstarDTO;
import be.wamberchies.WWEapi.service.SuperstarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
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
}
