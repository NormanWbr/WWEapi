package be.wamberchies.WWEapi.service.impl;

import be.wamberchies.WWEapi.model.dto.PriseDTO;
import be.wamberchies.WWEapi.model.entity.Prise;
import be.wamberchies.WWEapi.model.form.PriseForm;
import be.wamberchies.WWEapi.repository.PriseRepository;
import be.wamberchies.WWEapi.service.PriseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriseServiceImpl implements PriseService {
    private final PriseRepository priseRepository;

    public PriseServiceImpl(PriseRepository priseRepository) {
        this.priseRepository = priseRepository;
    }

    @Override
    public PriseDTO getOne(long id) {
        return priseRepository.findById(id)
                .map(PriseDTO::from)
                .orElseThrow();
    }

    @Override
    public List<PriseDTO> getAll() {
        return priseRepository.findAll().stream()
                .map(PriseDTO::from)
                .toList();
    }

    @Override
    public void addPrise(PriseForm priseForm) {
        Prise prise = new Prise();
        prise.setName(priseForm.getName());
        prise.setType(priseForm.getType());
        priseRepository.save(prise);
    }
}
