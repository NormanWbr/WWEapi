package be.wamberchies.WWEapi.model.dto;

import be.wamberchies.WWEapi.model.entity.Team;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class TeamDTO {

    private Long id;
    private String name;
    private List<String> superstars;

    public static TeamDTO from(Team entity) {
        if (entity != null) {
            return TeamDTO.builder()
                    .id(entity.getId())
                    .name(entity.getName())
                    .superstars(entity.getSuperstars().stream().map(superstar -> superstar.getName()).collect(java.util.stream.Collectors.toList()))
                    .build();
        }else{
            return null;
        }

    }}
