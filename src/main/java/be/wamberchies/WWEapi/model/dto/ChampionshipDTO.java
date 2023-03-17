package be.wamberchies.WWEapi.model.dto;

import be.wamberchies.WWEapi.model.entity.Championship;
import be.wamberchies.WWEapi.model.entity.enums.Gender;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChampionshipDTO {
    private Long id;
    private String name;
    private String description;
    private Gender gender;

    private String superstar;

    public static ChampionshipDTO from(Championship entity) {
        return ChampionshipDTO.builder()
                .id(entity.getId())
                .name(entity.getName())
                .description(entity.getDescription())
                .gender(entity.getGender())
                .superstar(entity.getSuperstar().getName())
                .build();
    }
}
