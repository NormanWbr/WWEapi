package be.wamberchies.WWEapi.model.dto;

import be.wamberchies.WWEapi.model.entity.Superstar;
import be.wamberchies.WWEapi.model.entity.Team;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
@Builder
public class TeamDTO {

    private Long id;
    private String name;
    private Set<String> superstars;

    public static TeamDTO from(Team entity) {

        return TeamDTO.builder()
                .id(entity.getId())
                .name(entity.getName())
                .superstars(entity.getSuperstars().stream().map(Superstar::getName).collect(java.util.stream.Collectors.toSet()))
                .build();

    }}
