package be.wamberchies.WWEapi.utils;

import be.wamberchies.WWEapi.model.entity.Championship;
import be.wamberchies.WWEapi.model.entity.Show;
import be.wamberchies.WWEapi.model.entity.Superstar;
import be.wamberchies.WWEapi.model.entity.enums.Frequency;
import be.wamberchies.WWEapi.model.entity.enums.Gender;
import be.wamberchies.WWEapi.repository.*;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class DataInit implements InitializingBean {

    private final SuperstarRepository superstarRepository;
    private final ChampionshipRepository championshipRepository;
    private final PriseRepository priseRepository;
    private final ShowRepository showRepository;
    private final TeamRepository teamRepository;


    public DataInit(SuperstarRepository superstarRepository, ChampionshipRepository championshipRepository, PriseRepository priseRepository, ShowRepository showRepository, TeamRepository teamRepository) {
        this.superstarRepository = superstarRepository;
        this.championshipRepository = championshipRepository;
        this.priseRepository = priseRepository;
        this.showRepository = showRepository;
        this.teamRepository = teamRepository;
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
        superstar.setImage("https://www.wwe.com/f/styles/wwe_1_1_460/public/all/2022/04/Roman_Profile--f2e24f84ca2679ca0be9da35cb9be6fd.png");
        superstarRepository.save(superstar);

        superstar = new Superstar();

        superstar.setName("John Cena");
        superstar.setWeight(110);
        superstar.setHeight(185);
        superstar.setEntranceMusic("The Time is Now");
        superstar.setHeel(false);
        superstar.setGender(Gender.MALE);
        superstar.setImage("https://www.wwe.com/f/styles/talent_champion_lg/public/all/2022/06/CENA_06272022sb_0015_profile--5427418d87bc164613aaf74b1e5ef112.png");
        superstarRepository.save(superstar);

        superstar = new Superstar();

        superstar.setName("Stone Cold Steeve Austin");
        superstar.setWeight(118);
        superstar.setHeight(188);
        superstar.setEntranceMusic("Glass Shatters");
        superstar.setHeel(false);
        superstar.setGender(Gender.MALE);
        superstarRepository.save(superstar);

        superstar = new Superstar();

        superstar.setName("Undertaker");
        superstar.setWeight(135);
        superstar.setHeight(203);
        superstar.setEntranceMusic("Rest In Peace");
        superstar.setHeel(false);
        superstar.setGender(Gender.MALE);
        superstarRepository.save(superstar);

        superstar = new Superstar();

        superstar.setName("Trish Stratus");
        superstar.setWeight(57);
        superstar.setHeight(163);
        superstar.setEntranceMusic("Time to Rock and Roll");
        superstar.setHeel(false);
        superstar.setGender(Gender.FEMALE);
        superstarRepository.save(superstar);

        superstar = new Superstar();

        superstar.setName("Triple H");
        superstar.setWeight(117);
        superstar.setHeight(193);
        superstar.setEntranceMusic("The Game");
        superstar.setHeel(true);
        superstar.setGender(Gender.MALE);
        superstarRepository.save(superstar);

        superstar = new Superstar();

        superstar.setName("The Rock");
        superstar.setWeight(120);
        superstar.setHeight(193);
        superstar.setEntranceMusic("Electrifying");
        superstar.setHeel(false);
        superstar.setGender(Gender.MALE);
        superstarRepository.save(superstar);

        superstar = new Superstar();

        superstar.setName("Beckyy Lynch");
        superstar.setWeight(61);
        superstar.setHeight(168);
        superstar.setEntranceMusic("Celtic Invasion");
        superstar.setHeel(false);
        superstar.setGender(Gender.FEMALE);
        superstarRepository.save(superstar);

        superstar = new Superstar();

        superstar.setName("Randy Orton");
        superstar.setWeight(110);
        superstar.setHeight(196);
        superstar.setEntranceMusic("Voices");
        superstar.setHeel(true);
        superstar.setGender(Gender.MALE);
        superstarRepository.save(superstar);

        superstar = new Superstar();

        superstar.setName("Charlotte Flair");
        superstar.setWeight(65);
        superstar.setHeight(178);
        superstar.setEntranceMusic("Recognition");
        superstar.setHeel(true);
        superstar.setGender(Gender.FEMALE);
        superstarRepository.save(superstar);

        superstar = new Superstar();

        superstar.setName("Brock Lesnarr");
        superstar.setWeight(130);
        superstar.setHeight(190);
        superstar.setEntranceMusic("Next Big Thing");
        superstar.setHeel(true);
        superstar.setGender(Gender.MALE);
        superstarRepository.save(superstar);

        superstar = new Superstar();

        superstar.setName("Sasha Banks");
        superstar.setWeight(52);
        superstar.setHeight(165);
        superstar.setEntranceMusic("Sky's the Limit");
        superstar.setHeel(false);
        superstar.setGender(Gender.FEMALE);
        superstarRepository.save(superstar);

        superstar = new Superstar();

        superstar.setName("Eddie Guerrerro");
        superstar.setWeight(100);
        superstar.setHeight(173);
        superstar.setEntranceMusic("Latino Heat");
        superstar.setHeel(false);
        superstar.setGender(Gender.MALE);
        superstarRepository.save(superstar);

        superstar = new Superstar();

        superstar.setName("Bayley");
        superstar.setWeight(60);
        superstar.setHeight(168);
        superstar.setEntranceMusic("Hey Hey Bayley");
        superstar.setHeel(false);
        superstar.setGender(Gender.FEMALE);
        superstarRepository.save(superstar);

        superstar = new Superstar();

        superstar.setName("Shawn Michaells");
        superstar.setWeight(102);
        superstar.setHeight(183);
        superstar.setEntranceMusic("Sexy Boy");
        superstar.setHeel(false);
        superstar.setGender(Gender.MALE);
        superstarRepository.save(superstar);

        superstar = new Superstar();

        superstar.setName("Naomi");
        superstar.setWeight(57);
        superstar.setHeight(165);
        superstar.setEntranceMusic("Amazing");
        superstar.setHeel(false);
        superstar.setGender(Gender.FEMALE);
        superstarRepository.save(superstar);

        Championship rw = new Championship();

        rw.setName("Raw Women's Championship");
        rw.setDescription("Major title of the Raw brand for women");
        rw.setGender(Gender.FEMALE);
        superstar = superstarRepository.findById(5L).get();
        rw.setSuperstar(superstar);
        championshipRepository.save(rw);
        superstar.setChampionships(Set.of(rw));
        superstarRepository.save(superstar);

        Championship sdw = new Championship();

        sdw.setName("SmackDown Women's Championship");
        sdw.setDescription("Major title of the SmackDown brand for women");
        sdw.setGender(Gender.FEMALE);
        superstar = superstarRepository.findById(8L).get();
        sdw.setSuperstar(superstar);
        championshipRepository.save(sdw);
        superstar.setChampionships(Set.of(sdw));
        superstarRepository.save(superstar);

        Championship universal = new Championship();

        universal.setName("Universal Championship");
        universal.setDescription("Major title of WWE");
        universal.setGender(Gender.MALE);
        superstar = superstarRepository.findById(1L).get();
        universal.setSuperstar(superstar);
        championshipRepository.save(universal);
        superstar.setChampionships(Set.of(universal));
        superstarRepository.save(superstar);

        Championship wwe = new Championship();

        wwe.setName("WWE Championship");
        wwe.setDescription("Major title of WWE");
        wwe.setGender(Gender.MALE);
        superstar = superstarRepository.findById(2L).get();
        wwe.setSuperstar(superstar);
        championshipRepository.save(wwe);
        superstar.setChampionships(Set.of(wwe));
        superstarRepository.save(superstar);

        Championship ic = new Championship();

        ic.setName("Intercontinental Championship");
        ic.setDescription("Major title of WWE for male wrestlers");
        ic.setGender(Gender.MALE);
        superstar = superstarRepository.findById(3L).get();
        ic.setSuperstar(superstar);
        championshipRepository.save(ic);
        superstar.setChampionships(Set.of(ic));
        superstarRepository.save(superstar);

        Championship us = new Championship();

        us.setName("United States Championship");
        us.setDescription("Major title of WWE for male wrestlers");
        us.setGender(Gender.MALE);
        superstar = superstarRepository.findById(4L).get();
        us.setSuperstar(superstar);
        championshipRepository.save(us);
        superstar.setChampionships(Set.of(us));
        superstarRepository.save(superstar);

        Show raw = new Show();

        raw.setName("Raw");
        raw.setFrequency(Frequency.WEEKLY);
        raw.setSuperstars(
                Set.of(
                        superstarRepository.findById(1L).get(),
                        superstarRepository.findById(2L).get(),
                        superstarRepository.findById(3L).get(),
                        superstarRepository.findById(4L).get(),
                        superstarRepository.findById(5L).get(),
                        superstarRepository.findById(6L).get(),
                        superstarRepository.findById(7L).get(),
                        superstarRepository.findById(8L).get()

                )
        );

        showRepository.save(raw);

        Show smackdown = new Show();

        smackdown.setName("SmackDown");
        smackdown.setFrequency(Frequency.WEEKLY);
        smackdown.setSuperstars(
                Set.of(
                        superstarRepository.findById(9L).get(),
                        superstarRepository.findById(10L).get(),
                        superstarRepository.findById(11L).get(),
                        superstarRepository.findById(12L).get(),
                        superstarRepository.findById(13L).get(),
                        superstarRepository.findById(14L).get(),
                        superstarRepository.findById(15L).get(),
                        superstarRepository.findById(16L).get()
                )
        );

        showRepository.save(smackdown);

        Show wrestlemania = new Show();

        wrestlemania.setName("WrestleMania");
        wrestlemania.setFrequency(Frequency.YEARLY);
        wrestlemania.setSuperstars(
                Set.of(
                        superstarRepository.findById(1L).get(),
                        superstarRepository.findById(2L).get(),
                        superstarRepository.findById(3L).get(),
                        superstarRepository.findById(4L).get(),
                        superstarRepository.findById(5L).get(),
                        superstarRepository.findById(6L).get(),
                        superstarRepository.findById(7L).get(),
                        superstarRepository.findById(8L).get(),
                        superstarRepository.findById(9L).get(),
                        superstarRepository.findById(10L).get(),
                        superstarRepository.findById(11L).get(),
                        superstarRepository.findById(12L).get(),
                        superstarRepository.findById(13L).get(),
                        superstarRepository.findById(14L).get(),
                        superstarRepository.findById(15L).get(),
                        superstarRepository.findById(16L).get()
                )
        );

        showRepository.save(wrestlemania);

    }
}
