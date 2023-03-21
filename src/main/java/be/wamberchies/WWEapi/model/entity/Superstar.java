package be.wamberchies.WWEapi.model.entity;

import be.wamberchies.WWEapi.model.entity.enums.Gender;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Getter @Setter
public class Superstar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "superstar_id")
    private Long id;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private double height;

    @Column(nullable = false)
    private double weight;

    private String entranceMusic;

    @Column(nullable = false)
    private Boolean Heel;

    private String image;

    @ManyToMany(mappedBy = "superstars")
    private Set<Show> shows = new LinkedHashSet<>();

    @ManyToMany(mappedBy = "superstars")
    private Set<Prise> prises = new LinkedHashSet<>();

    @ManyToMany(mappedBy = "superstars")
    private Set<Championship> championships = new LinkedHashSet<>();

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

}
