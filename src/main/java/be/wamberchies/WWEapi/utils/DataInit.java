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

        superstar = new Superstar();

        superstar.setName("Charlotte Flair");
        superstar.setWeight(143);
        superstar.setHeight(178);
        superstar.setEntranceMusic("Recognition");
        superstar.setHeel(false);
        superstar.setGender(Gender.FEMALE);
        superstarRepository.save(superstar);

        superstar = new Superstar();

        superstar.setName("Sasha Banks");
        superstar.setWeight(114);
        superstar.setHeight(165);
        superstar.setEntranceMusic("Sky's the Limit");
        superstar.setHeel(false);
        superstar.setGender(Gender.FEMALE);
        superstarRepository.save(superstar);

        superstar = new Superstar();

        superstar.setName("Becky Lynch");
        superstar.setWeight(135);
        superstar.setHeight(168);
        superstar.setEntranceMusic("Celtic Invasion");
        superstar.setHeel(false);
        superstar.setGender(Gender.FEMALE);
        superstarRepository.save(superstar);

        superstar = new Superstar();

        superstar.setName("Roman Reigns");
        superstar.setWeight(120);
        superstar.setHeight(180);
        superstar.setEntranceMusic("Head of the Table");
        superstar.setHeel(true);
        superstar.setGender(Gender.MALE);
        superstarRepository.save(superstar);

        superstar = new Superstar();

        superstar.setName("Dwayne 'The Rock' Johnson");
        superstar.setWeight(118);
        superstar.setHeight(193);
        superstar.setEntranceMusic("Electrifying");
        superstar.setHeel(false);
        superstar.setGender(Gender.MALE);
        superstarRepository.save(superstar);

        superstar = new Superstar();

        superstar.setName("John Cena");
        superstar.setWeight(114);
        superstar.setHeight(185);
        superstar.setEntranceMusic("The Time Is Now");
        superstar.setHeel(false);
        superstar.setGender(Gender.MALE);
        superstarRepository.save(superstar);

        superstar = new Superstar();

        superstar.setName("AJ Styles");
        superstar.setWeight(99);
        superstar.setHeight(178);
        superstar.setEntranceMusic("Phenomenal");
        superstar.setHeel(false);
        superstar.setGender(Gender.MALE);
        superstarRepository.save(superstar);

        superstar = new Superstar();

        superstar.setName("Chris Jericho");
        superstar.setWeight(102);
        superstar.setHeight(183);
        superstar.setEntranceMusic("Judas");
        superstar.setHeel(true);
        superstar.setGender(Gender.MALE);
        superstarRepository.save(superstar);

        superstar = new Superstar();

        superstar.setName("Trish Stratus");
        superstar.setWeight(57);
        superstar.setHeight(163);
        superstar.setEntranceMusic("Time to Rock & Roll");
        superstar.setHeel(false);
        superstar.setGender(Gender.FEMALE);
        superstarRepository.save(superstar);

        superstar = new Superstar();

        superstar.setName("Lita");
        superstar.setWeight(61);
        superstar.setHeight(168);
        superstar.setEntranceMusic("Lovefurypassionenergy");
        superstar.setHeel(false);
        superstar.setGender(Gender.FEMALE);
        superstarRepository.save(superstar);

    }
}
