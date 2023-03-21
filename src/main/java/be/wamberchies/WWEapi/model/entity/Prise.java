package be.wamberchies.WWEapi.model.entity;

import be.wamberchies.WWEapi.model.entity.enums.Type;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Getter @Setter
public class Prise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prise_id")
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Type type;

    @ManyToMany
    @JoinTable(name = "prise_superstars",
            joinColumns = @JoinColumn(name = "prise_prise_id"),
            inverseJoinColumns = @JoinColumn(name = "superstars_superstar_id"))
    private Set<Superstar> superstars = new LinkedHashSet<>();

}
