package be.wamberchies.WWEapi.model.dto;

import be.wamberchies.WWEapi.model.entity.enums.Type;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class PriseDTO {

    private Long id;
    private String name;
    private String description;
    private Type type;

    private List<String> superstars;

    public static PriseDTO from(be.wamberchies.WWEapi.model.entity.Prise entity){
        return PriseDTO.builder()
                .id(entity.getId())
                .name(entity.getName())
                .type(entity.getType())
                .superstars(entity.getSuperstars().stream().map(be.wamberchies.WWEapi.model.entity.Superstar::getName).collect(java.util.stream.Collectors.toList()))
                .build();
    }

}
