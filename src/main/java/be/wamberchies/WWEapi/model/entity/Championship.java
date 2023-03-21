package be.wamberchies.WWEapi.model.entity;

import be.wamberchies.WWEapi.model.entity.enums.Gender;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Getter @Setter
public class Championship {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "championship_id")
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    private String image;

    @ManyToMany
    @JoinTable(name = "championship_superstars",
            joinColumns = @JoinColumn(name = "championship_championship_id"),
            inverseJoinColumns = @JoinColumn(name = "superstars_superstar_id"))
    private Set<Superstar> superstars = new LinkedHashSet<>();

}
