package be.wamberchies.WWEapi.service;

import be.wamberchies.WWEapi.model.dto.SuperstarDTO;
import be.wamberchies.WWEapi.model.form.SuperstarForm;

import java.util.List;

public interface SuperstarService {
    SuperstarDTO getOne(long id);

    List<SuperstarDTO> getAll();

    void addSuperstar(SuperstarForm superstarForm);
}
