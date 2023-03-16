package be.wamberchies.WWEapi.model.dto;

import be.wamberchies.WWEapi.model.entity.enums.Type;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class PriseDTO {

    private Long id;
    private String name;
    private String description;
    private Type type;
    private Set<SuperstarDTO> superstars;

    public static PriseDTO from(be.wamberchies.WWEapi.model.entity.Prise entity){
        return PriseDTO.builder()
                .id(entity.getId())
                .name(entity.getName())
                .description(entity.getDescription())
                .type(entity.getType())
                .superstars(entity.getSuperstars().stream().map(SuperstarDTO::from).collect(java.util.stream.Collectors.toSet()))
                .build();
    }

}
