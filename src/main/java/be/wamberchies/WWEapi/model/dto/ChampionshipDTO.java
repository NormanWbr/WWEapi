package be.wamberchies.WWEapi.model.dto;

import be.wamberchies.WWEapi.model.entity.Championship;
import be.wamberchies.WWEapi.model.entity.enums.Gender;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ChampionshipDTO {
    private Long id;
    private String name;
    private String description;
    private Gender gender;
    private List<String> superstars;
    private String image;

    public static ChampionshipDTO from(Championship entity) {
        return ChampionshipDTO.builder()
                .id(entity.getId())
                .name(entity.getName())
                .image(entity.getImage())
                .description(entity.getDescription())
                .superstars(entity.getSuperstars().stream().map(superstar -> superstar.getName()).collect(java.util.stream.Collectors.toList()))
                .build();
    }
}
