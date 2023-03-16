package be.wamberchies.WWEapi.model.dto;

import be.wamberchies.WWEapi.model.entity.*;
import be.wamberchies.WWEapi.model.entity.enums.Gender;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class SuperstarDTO {

    private Long id;
    private String name;
    private Gender gender;
    private double height;
    private double weight;
    private String entranceMusic;
    private Boolean Heel;
    private Set<PriseDTO> prises;
    private TeamDTO team;
    private Set<ShowDTO> shows;
    private Set<ChampionshipDTO> championships;

public static SuperstarDTO from(Superstar entity){
return SuperstarDTO.builder()
        .id(entity.getId())
        .name(entity.getName())
        .gender(entity.getGender())
        .height(entity.getHeight())
        .weight(entity.getWeight())
        .entranceMusic(entity.getEntranceMusic())
        .Heel(entity.getHeel())
        .prises(entity.getPrises().stream().map(PriseDTO::from).collect(java.util.stream.Collectors.toSet()))
        .team(TeamDTO.from(entity.getTeam()))
        .shows(entity.getShows().stream().map(ShowDTO::from).collect(java.util.stream.Collectors.toSet()))
        .championships(entity.getChampionships().stream().map(ChampionshipDTO::from).collect(java.util.stream.Collectors.toSet()))
        .build();
}

}
