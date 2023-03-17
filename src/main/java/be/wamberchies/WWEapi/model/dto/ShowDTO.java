package be.wamberchies.WWEapi.model.dto;

import be.wamberchies.WWEapi.model.entity.Show;
import be.wamberchies.WWEapi.model.entity.enums.Frequency;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ShowDTO {
    private Long id;
    private String name;
    private Frequency frequency;
    private List<String> superstars;

    public static ShowDTO from(Show entity){
        return ShowDTO.builder()
                .id(entity.getId())
                .name(entity.getName())
                .frequency(entity.getFrequency())
                .superstars(entity.getSuperstars().stream().map(superstar -> superstar.getName()).collect(java.util.stream.Collectors.toList()))
                .build();
    }

}
