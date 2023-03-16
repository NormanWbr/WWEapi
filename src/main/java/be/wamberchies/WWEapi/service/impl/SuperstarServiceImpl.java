package be.wamberchies.WWEapi.service.impl;

import be.wamberchies.WWEapi.exception.RessourceNotFoundException;
import be.wamberchies.WWEapi.model.dto.SuperstarDTO;
import be.wamberchies.WWEapi.model.entity.Superstar;
import be.wamberchies.WWEapi.model.form.SuperstarForm;
import be.wamberchies.WWEapi.repository.SuperstarRepository;
import be.wamberchies.WWEapi.service.SuperstarService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuperstarServiceImpl implements SuperstarService {

    private final SuperstarRepository superstarRepository;

    public SuperstarServiceImpl(SuperstarRepository superstarRepository) {
        this.superstarRepository = superstarRepository;
    }

    @Override
    public SuperstarDTO getOne(long id) {
        return superstarRepository.findById(id)
                .map(SuperstarDTO::from)
                .orElseThrow(RessourceNotFoundException::new);
    }

    @Override
    public List<SuperstarDTO> getAll() {
        return superstarRepository.findAll().stream()
                .map(SuperstarDTO::from)
                .toList();
    }

    @Override
    public void addSuperstar(SuperstarForm superstarForm) {
        Superstar superstar = new Superstar();

        superstar.setName(superstarForm.getName());
        superstar.setGender(superstarForm.getGender());
        superstar.setWeight(superstarForm.getWeight());
        superstar.setHeight(superstarForm.getHeight());
        superstar.setEntranceMusic(superstarForm.getEntranceMusic());
        superstar.setHeel(superstarForm.getHeel());

        superstarRepository.save(superstar);
    }


}
