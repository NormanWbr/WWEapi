package be.wamberchies.WWEapi.controller;

import be.wamberchies.WWEapi.service.PriseService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/prise")
public class PriseController {

    private final PriseService priseService;

    public PriseController(PriseService priseService) {
        this.priseService = priseService;
    }
}
