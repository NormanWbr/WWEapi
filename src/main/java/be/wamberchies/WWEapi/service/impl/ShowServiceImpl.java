package be.wamberchies.WWEapi.service.impl;

import be.wamberchies.WWEapi.exception.RessourceNotFoundException;
import be.wamberchies.WWEapi.model.dto.ShowDTO;
import be.wamberchies.WWEapi.model.entity.Show;
import be.wamberchies.WWEapi.model.form.ShowForm;
import be.wamberchies.WWEapi.repository.ShowRepository;
import be.wamberchies.WWEapi.service.ShowService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowServiceImpl implements ShowService {

    private final ShowRepository showRepository;

    public ShowServiceImpl(ShowRepository showRepository) {
        this.showRepository = showRepository;
    }

    @Override
    public ShowDTO getOne(long id) {
        return showRepository.findById(id)
                .map(ShowDTO::from)
                .orElseThrow(RessourceNotFoundException::new);
    }

    @Override
    public List<ShowDTO> getAll() {
        return showRepository.findAll().stream()
                .map(ShowDTO::from)
                .toList();
    }

    @Override
    public void addShow(ShowForm showForm) {
        Show show = new Show();
        show.setFrequency(showForm.getFrequency());
        show.setName(showForm.getName());
        showRepository.save(show);
    }
}
