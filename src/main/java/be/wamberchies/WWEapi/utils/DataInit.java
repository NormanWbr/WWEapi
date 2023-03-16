package be.wamberchies.WWEapi.utils;

import be.wamberchies.WWEapi.model.entity.Show;
import be.wamberchies.WWEapi.model.entity.Superstar;
import be.wamberchies.WWEapi.model.entity.Team;
import be.wamberchies.WWEapi.model.entity.enums.Frequency;
import be.wamberchies.WWEapi.model.entity.enums.Gender;
import be.wamberchies.WWEapi.repository.SuperstarRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class DataInit implements InitializingBean {

    private final SuperstarRepository superstarRepository;

    public DataInit(SuperstarRepository superstarRepository) {
        this.superstarRepository = superstarRepository;
    }


    @Override
    public void afterPropertiesSet() throws Exception {

        Superstar superstar = new Superstar();

        superstar.setName("John Cena");
        superstar.setWeight(120);
        superstar.setHeight(180);
        superstar.setEntranceMusic("You can't see me");
        superstar.setHeel(false);
        superstar.setGender(Gender.MALE);
        superstarRepository.save(superstar);

        superstar = new Superstar();

        superstar.setName("Roman Reigns");
        superstar.setWeight(120);
        superstar.setHeight(180);
        superstar.setEntranceMusic("Head of the Table");
        superstar.setHeel(true);
        superstar.setGender(Gender.MALE);
        superstarRepository.save(superstar);

        System.out.println("Superstar added");


    }
}
