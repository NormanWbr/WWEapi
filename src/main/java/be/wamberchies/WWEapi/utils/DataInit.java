package be.wamberchies.WWEapi.utils;

import be.wamberchies.WWEapi.model.entity.Championship;
import be.wamberchies.WWEapi.model.entity.Show;
import be.wamberchies.WWEapi.model.entity.Superstar;
import be.wamberchies.WWEapi.model.entity.Team;
import be.wamberchies.WWEapi.model.entity.enums.Frequency;
import be.wamberchies.WWEapi.model.entity.enums.Gender;
import be.wamberchies.WWEapi.repository.*;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.Arrays;
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

        Team Bloodline = new Team();

        Bloodline.setName("Bloodline");
        Bloodline.setHeel(true);

        teamRepository.save(Bloodline);

        Team LitaBecky = new Team();

        LitaBecky.setName("Lita & Becky Lynch");
        LitaBecky.setHeel(false);

        teamRepository.save(LitaBecky);

        Superstar RomanReigns = new Superstar();

        RomanReigns.setName("Roman Reigns");
        RomanReigns.setGender(Gender.MALE);
        RomanReigns.setWeight(130);
        RomanReigns.setHeight(191);
        RomanReigns.setHeel(true);
        RomanReigns.setEntranceMusic("The Head Of The Table");
        RomanReigns.setImage("https://github.com/NormanWbr/WWEapi/blob/master/src/main/java/be/wamberchies/WWEapi/WWE%20Photo/Roman%20Reigns.jpg?raw=true");
        RomanReigns.setTeam(Bloodline);

        superstarRepository.save(RomanReigns);

        Superstar Gunther = new Superstar();

        Gunther.setName("Gunther");
        Gunther.setGender(Gender.MALE);
        Gunther.setWeight(137.72);
        Gunther.setHeight(193);
        Gunther.setHeel(true);
        Gunther.setEntranceMusic("Prepare To Fight");
        Gunther.setImage("https://github.com/NormanWbr/WWEapi/blob/master/src/main/java/be/wamberchies/WWEapi/WWE%20Photo/Gunther.jpg?raw=true");

        superstarRepository.save(Gunther);

        Superstar AustinTheory = new Superstar();

        AustinTheory.setName("Austin Theory");
        AustinTheory.setGender(Gender.MALE);
        AustinTheory.setWeight(100);
        AustinTheory.setHeight(185);
        AustinTheory.setHeel(true);
        AustinTheory.setEntranceMusic("A-Town Down");
        AustinTheory.setImage("https://github.com/NormanWbr/WWEapi/blob/master/src/main/java/be/wamberchies/WWEapi/WWE%20Photo/Austin%20Theory.jpg?raw=true");

        superstarRepository.save(AustinTheory);

        Superstar JeyUso = new Superstar();

        JeyUso.setName("Jey Uso");
        JeyUso.setGender(Gender.MALE);
        JeyUso.setWeight(110);
        JeyUso.setHeight(188);
        JeyUso.setHeel(true);
        JeyUso.setEntranceMusic("Done With That");
        JeyUso.setImage("https://github.com/NormanWbr/WWEapi/blob/master/src/main/java/be/wamberchies/WWEapi/WWE%20Photo/Jey%20Uso.jpg?raw=true");
        JeyUso.setTeam(Bloodline);

        superstarRepository.save(JeyUso);

        Superstar JimmyUso = new Superstar();

        JimmyUso.setName("Jimmy Uso");
        JimmyUso.setGender(Gender.MALE);
        JimmyUso.setWeight(114);
        JimmyUso.setHeight(191);
        JimmyUso.setHeel(true);
        JimmyUso.setEntranceMusic("Done With That");
        JimmyUso.setImage("https://github.com/NormanWbr/WWEapi/blob/master/src/main/java/be/wamberchies/WWEapi/WWE%20Photo/Jimmy%20Uso.jpg?raw=true");
        JimmyUso.setTeam(Bloodline);

        superstarRepository.save(JimmyUso);

        Superstar CharlotteFlair = new Superstar();

        CharlotteFlair.setName("Charlotte Flair");
        CharlotteFlair.setGender(Gender.FEMALE);
        CharlotteFlair.setWeight(65);
        CharlotteFlair.setHeight(178);
        CharlotteFlair.setHeel(false);
        CharlotteFlair.setEntranceMusic("Recognition");
        CharlotteFlair.setImage("https://github.com/NormanWbr/WWEapi/blob/master/src/main/java/be/wamberchies/WWEapi/WWE%20Photo/Charlotte%20Flair.jpg?raw=true");

        superstarRepository.save(CharlotteFlair);

        Superstar BiancaBelair = new Superstar();

        BiancaBelair.setName("Bianca Belair");
        BiancaBelair.setGender(Gender.FEMALE);
        BiancaBelair.setWeight(75);
        BiancaBelair.setHeight(170);
        BiancaBelair.setHeel(false);
        BiancaBelair.setEntranceMusic("Watch Me Shine");
        BiancaBelair.setImage("https://github.com/NormanWbr/WWEapi/blob/master/src/main/java/be/wamberchies/WWEapi/WWE%20Photo/Bianca%20Belair.jpg?raw=true");

        superstarRepository.save(BiancaBelair);

        Superstar Lita = new Superstar();

        Lita.setName("Lita");
        Lita.setGender(Gender.FEMALE);
        Lita.setWeight(61);
        Lita.setHeight(168);
        Lita.setHeel(false);
        Lita.setEntranceMusic("Lovefurypassionenergy");
        Lita.setImage("https://github.com/NormanWbr/WWEapi/blob/master/src/main/java/be/wamberchies/WWEapi/WWE%20Photo/Lita.jpg?raw=true");
        Lita.setTeam(LitaBecky);

        superstarRepository.save(Lita);

        Superstar BeckyLynch = new Superstar();

        BeckyLynch.setName("Becky Lynch");
        BeckyLynch.setGender(Gender.FEMALE);
        BeckyLynch.setWeight(68);
        BeckyLynch.setHeight(161);
        BeckyLynch.setHeel(false);
        BeckyLynch.setEntranceMusic("Celtic Invasion");
        BeckyLynch.setImage("https://github.com/NormanWbr/WWEapi/blob/master/src/main/java/be/wamberchies/WWEapi/WWE%20Photo/Becky%20Lynch.jpg?raw=true");
        BeckyLynch.setTeam(LitaBecky);

        superstarRepository.save(BeckyLynch);

        Show Raw = new Show();

        Raw.setName("Raw");
        Raw.setFrequency(Frequency.WEEKLY);
        Raw.setImage("https://github.com/NormanWbr/WWEapi/blob/master/src/main/java/be/wamberchies/WWEapi/WWE%20Photo/Raw.png?raw=true");

        showRepository.save(Raw);

        Show SmackDown = new Show();

        SmackDown.setName("SmackDown");
        SmackDown.setFrequency(Frequency.WEEKLY);
        SmackDown.setImage("https://github.com/NormanWbr/WWEapi/blob/master/src/main/java/be/wamberchies/WWEapi/WWE%20Photo/SmackDown.png?raw=true");

        showRepository.save(SmackDown);

        Show Wrestlemania = new Show();

        Wrestlemania.setName("Wrestlemania");
        Wrestlemania.setFrequency(Frequency.YEARLY);
        Wrestlemania.setImage("https://github.com/NormanWbr/WWEapi/blob/master/src/main/java/be/wamberchies/WWEapi/WWE%20Photo/Wrestlemania%2039.png?raw=true");

        showRepository.save(Wrestlemania);

        Championship WWEChampionship = new Championship();

        WWEChampionship.setName("WWE Championship");
        WWEChampionship.setDescription("");
        WWEChampionship.setImage("https://github.com/NormanWbr/WWEapi/blob/master/src/main/java/be/wamberchies/WWEapi/WWE%20Photo/Titles/WWE%20World%20Heavyweight%20Championship.png?raw=true");
        WWEChampionship.setSuperstars(Set.of(RomanReigns));

        championshipRepository.save(WWEChampionship);

        Championship UniversalChampionship = new Championship();

        UniversalChampionship.setName("Universal Championship");
        UniversalChampionship.setDescription("");
        UniversalChampionship.setSuperstars(Set.of(RomanReigns));
        UniversalChampionship.setImage("https://github.com/NormanWbr/WWEapi/blob/master/src/main/java/be/wamberchies/WWEapi/WWE%20Photo/Titles/WWE%20Universal%20Championship.png?raw=true");

        championshipRepository.save(UniversalChampionship);

        Championship IntercontinentalChampionship = new Championship();

        IntercontinentalChampionship.setName("Intercontinental Championship");
        IntercontinentalChampionship.setDescription("");
        IntercontinentalChampionship.setImage("https://github.com/NormanWbr/WWEapi/blob/master/src/main/java/be/wamberchies/WWEapi/WWE%20Photo/Titles/WWE%20Intercontinental%20Championship.png?raw=true");
        IntercontinentalChampionship.setSuperstars(Set.of(Gunther));

        championshipRepository.save(IntercontinentalChampionship);

        Championship UnitedStatesChampionship = new Championship();

        UnitedStatesChampionship.setName("United States Championship");
        UnitedStatesChampionship.setDescription("");
        UnitedStatesChampionship.setImage("https://github.com/NormanWbr/WWEapi/blob/master/src/main/java/be/wamberchies/WWEapi/WWE%20Photo/Titles/WWE%20United%20States%20Championship.png?raw=true");
        UnitedStatesChampionship.setSuperstars(Set.of(AustinTheory));

        championshipRepository.save(UnitedStatesChampionship);

        Championship RawWomenChampionship = new Championship();

        RawWomenChampionship.setName("Raw Women's Championship");
        RawWomenChampionship.setDescription("");
        RawWomenChampionship.setImage("https://github.com/NormanWbr/WWEapi/blob/master/src/main/java/be/wamberchies/WWEapi/WWE%20Photo/Titles/WWE%20Raw%20Women%20Championship.png?raw=true");
        RawWomenChampionship.setSuperstars(Set.of(BiancaBelair));

        championshipRepository.save(RawWomenChampionship);

        Championship SmackDownWomenChampionship = new Championship();

        SmackDownWomenChampionship.setName("SmackDown Women's Championship");
        SmackDownWomenChampionship.setDescription("");
        SmackDownWomenChampionship.setImage("https://github.com/NormanWbr/WWEapi/blob/master/src/main/java/be/wamberchies/WWEapi/WWE%20Photo/Titles/WWE%20SmackDown%20Women%20Championship.png?raw=true");
        SmackDownWomenChampionship.setSuperstars(Set.of(CharlotteFlair));

        championshipRepository.save(SmackDownWomenChampionship);

        Championship RawTagTeamChampionship = new Championship();

        RawTagTeamChampionship.setName("Raw Tag Team Championship");
        RawTagTeamChampionship.setDescription("");
        RawTagTeamChampionship.setImage("https://github.com/NormanWbr/WWEapi/blob/master/src/main/java/be/wamberchies/WWEapi/WWE%20Photo/Titles/WWE%20Raw%20Tag%20Team%20Championship.png?raw=true");
        RawTagTeamChampionship.setSuperstars(Set.of(JimmyUso, JeyUso));

        championshipRepository.save(RawTagTeamChampionship);

        Championship SmackDownTagTeamChampionship = new Championship();

        SmackDownTagTeamChampionship.setName("SmackDown Tag Team Championship");
        SmackDownTagTeamChampionship.setDescription("");
        SmackDownTagTeamChampionship.setImage("https://github.com/NormanWbr/WWEapi/blob/master/src/main/java/be/wamberchies/WWEapi/WWE%20Photo/Titles/WWE%20SmackDown%20Tag%20Team%20Championship.png?raw=true");
        SmackDownTagTeamChampionship.setSuperstars(Set.of(JimmyUso, JeyUso));

        championshipRepository.save(SmackDownTagTeamChampionship);

        Championship WomenTagTeamChampionship = new Championship();

        WomenTagTeamChampionship.setName("WWE Women's Tag Team Championship ");
        WomenTagTeamChampionship.setDescription("");
        WomenTagTeamChampionship.setImage("https://github.com/NormanWbr/WWEapi/blob/master/src/main/java/be/wamberchies/WWEapi/WWE%20Photo/Titles/WWE%20Womens%20Tag%20Team%20Championship.png?raw=true");
        WomenTagTeamChampionship.setSuperstars(Set.of(Lita, BeckyLynch));

        championshipRepository.save(WomenTagTeamChampionship);


    }
}
