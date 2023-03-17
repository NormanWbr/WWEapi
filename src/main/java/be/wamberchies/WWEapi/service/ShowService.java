package be.wamberchies.WWEapi.service;

import be.wamberchies.WWEapi.model.dto.ShowDTO;
import be.wamberchies.WWEapi.model.form.ShowForm;

import java.util.List;

public interface ShowService {

    ShowDTO getOne(long id);

    List<ShowDTO> getAll();

    void addShow(ShowForm showForm);

}
