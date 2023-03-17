package be.wamberchies.WWEapi.utils;

import be.wamberchies.WWEapi.model.entity.*;
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

        superstar.setName("Roman Reigns");
        superstar.setWeight(120);
        superstar.setHeight(180);
        superstar.setEntranceMusic("Head of the Table");
        superstar.setHeel(true);
        superstar.setGender(Gender.MALE);
        superstarRepository.save(superstar);

        superstar.setName("John Cena");
        superstar.setWeight(110);
        superstar.setHeight(185);
        superstar.setEntranceMusic("The Time is Now");
        superstar.setHeel(false);
        superstar.setGender(Gender.MALE);
        superstarRepository.save(superstar);

        superstar.setName("Stone Cold Steeve Austin");
        superstar.setWeight(118);
        superstar.setHeight(188);
        superstar.setEntranceMusic("Glass Shatters");
        superstar.setHeel(false);
        superstar.setGender(Gender.MALE);
        superstarRepository.save(superstar);

        superstar.setName("Undertaker");
        superstar.setWeight(135);
        superstar.setHeight(203);
        superstar.setEntranceMusic("Rest In Peace");
        superstar.setHeel(false);
        superstar.setGender(Gender.MALE);
        superstarRepository.save(superstar);

        superstar.setName("Trish Stratus");
        superstar.setWeight(57);
        superstar.setHeight(163);
        superstar.setEntranceMusic("Time to Rock and Roll");
        superstar.setHeel(false);
        superstar.setGender(Gender.FEMALE);
        superstarRepository.save(superstar);

        superstar.setName("Triple H");
        superstar.setWeight(117);
        superstar.setHeight(193);
        superstar.setEntranceMusic("The Game");
        superstar.setHeel(true);
        superstar.setGender(Gender.MALE);
        superstarRepository.save(superstar);

        superstar.setName("The Rock");
        superstar.setWeight(120);
        superstar.setHeight(193);
        superstar.setEntranceMusic("Electrifying");
        superstar.setHeel(false);
        superstar.setGender(Gender.MALE);
        superstarRepository.save(superstar);

        superstar.setName("Beckyy Lynch");
        superstar.setWeight(61);
        superstar.setHeight(168);
        superstar.setEntranceMusic("Celtic Invasion");
        superstar.setHeel(false);
        superstar.setGender(Gender.FEMALE);
        superstarRepository.save(superstar);

        superstar.setName("Randy Orton");
        superstar.setWeight(110);
        superstar.setHeight(196);
        superstar.setEntranceMusic("Voices");
        superstar.setHeel(true);
        superstar.setGender(Gender.MALE);
        superstarRepository.save(superstar);

        superstar.setName("Charlotte Flair");
        superstar.setWeight(65);
        superstar.setHeight(178);
        superstar.setEntranceMusic("Recognition");
        superstar.setHeel(true);
        superstar.setGender(Gender.FEMALE);
        superstarRepository.save(superstar);

        superstar.setName("Brock Lesnarr");
        superstar.setWeight(130);
        superstar.setHeight(190);
        superstar.setEntranceMusic("Next Big Thing");
        superstar.setHeel(true);
        superstar.setGender(Gender.MALE);
        superstarRepository.save(superstar);

        superstar.setName("Sasha Banks");
        superstar.setWeight(52);
        superstar.setHeight(165);
        superstar.setEntranceMusic("Sky's the Limit");
        superstar.setHeel(false);
        superstar.setGender(Gender.FEMALE);
        superstarRepository.save(superstar);

        superstar.setName("Eddie Guerrerro");
        superstar.setWeight(100);
        superstar.setHeight(173);
        superstar.setEntranceMusic("Latino Heat");
        superstar.setHeel(false);
        superstar.setGender(Gender.MALE);
        superstarRepository.save(superstar);

        superstar.setName("Bayley");
        superstar.setWeight(60);
        superstar.setHeight(168);
        superstar.setEntranceMusic("Hey Hey Bayley");
        superstar.setHeel(false);
        superstar.setGender(Gender.FEMALE);
        superstarRepository.save(superstar);

        superstar.setName("Shawn Michaells");
        superstar.setWeight(102);
        superstar.setHeight(183);
        superstar.setEntranceMusic("Sexy Boy");
        superstar.setHeel(false);
        superstar.setGender(Gender.MALE);
        superstarRepository.save(superstar);

        superstar.setName("Naomi");
        superstar.setWeight(57);
        superstar.setHeight(165);
        superstar.setEntranceMusic("Amazing");
        superstar.setHeel(false);
        superstar.setGender(Gender.FEMALE);
        superstarRepository.save(superstar);

        Championship championship = new Championship();
        championship.setName("WWE Championship");
        championship.setDescription("The WWE Championship is a professional wrestling world championship created and promoted by the American professional wrestling promotion WWE. The championship is currently held by Drew McIntyre, who is in his first reign. The title was first introduced in 1963 as the WWWF World Heavyweight Championship, and has been referred to by a variety of other names since then, including the WWF Championship, the WWE Championship, and the World Heavyweight Championship. The championship is currently contested for in WWE's main roster brand, Raw, and is one of the company's original championships. The championship is also defended on WWE's secondary brand, SmackDown, and on the NXT brand, which is the company's developmental territory. The championship is also defended on WWE's secondary brand, SmackDown, and on the NXT brand, which is the company's developmental territory.");
        championship.setGender(Gender.MALE);

    }
}
