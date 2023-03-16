package be.wamberchies.WWEapi.model.entity;

import be.wamberchies.WWEapi.model.entity.enums.Frequency;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Getter @Setter
public class Show {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "show_id")
    private Long id;

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    private Frequency frequency;

    @ManyToMany
    @JoinTable(name = "show_superstars",
            joinColumns = @JoinColumn(name = "show_id"),
            inverseJoinColumns = @JoinColumn(name = "superstar_id"))
    private Set<Superstar> superstars = new LinkedHashSet<>();

}
