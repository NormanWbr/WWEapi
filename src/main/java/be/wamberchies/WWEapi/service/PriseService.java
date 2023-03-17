package be.wamberchies.WWEapi.service;

import be.wamberchies.WWEapi.model.dto.PriseDTO;
import be.wamberchies.WWEapi.model.form.PriseForm;

import java.util.List;

public interface PriseService {

    PriseDTO getOne(long id);

    List<PriseDTO> getAll();

    void addPrise(PriseForm priseForm);

}
