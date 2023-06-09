package be.wamberchies.WWEapi.model.dto;

import be.wamberchies.WWEapi.model.entity.Championship;
import be.wamberchies.WWEapi.model.entity.Prise;
import be.wamberchies.WWEapi.model.entity.Show;
import be.wamberchies.WWEapi.model.entity.Superstar;
import be.wamberchies.WWEapi.model.entity.enums.Gender;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

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
    private List<String> prises;
    private List<String> shows;
    private List<String> championships;
    private String team;
    private String image;

    public static SuperstarDTO from(Superstar entity) {
        System.out.println(entity.getTeam());

        return SuperstarDTO.builder()
                .id(entity.getId())
                .name(entity.getName())
                .gender(entity.getGender())
                .entranceMusic(entity.getEntranceMusic())
                .Heel(entity.getHeel())
                .height(entity.getHeight())
                .weight(entity.getWeight())
                .image(entity.getImage())
                .shows(entity.getShows().stream().map(Show::getName).collect(Collectors.toList()))
                .championships(entity.getChampionships().stream().map(Championship::getName).collect(Collectors.toList()))
                .prises(entity.getPrises().stream().map(Prise::getName).collect(Collectors.toList()))
                .team(entity.getTeam() != null ? entity.getTeam().getName() : "No teams")
                .build();
    }
}
