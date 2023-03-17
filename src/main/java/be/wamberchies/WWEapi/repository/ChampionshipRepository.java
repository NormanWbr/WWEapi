package be.wamberchies.WWEapi.repository;

import be.wamberchies.WWEapi.model.entity.Championship;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChampionshipRepository extends JpaRepository<Championship, Long>{
}
