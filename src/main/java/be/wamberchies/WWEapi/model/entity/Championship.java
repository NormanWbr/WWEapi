package be.wamberchies.WWEapi.model.entity;

import be.wamberchies.WWEapi.model.entity.enums.Gender;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

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

    @Enumerated(EnumType.STRING)
    private Gender gender;


    @ManyToOne
    @JoinColumn(name = "superstar_id")
    private Superstar superstar;

}
