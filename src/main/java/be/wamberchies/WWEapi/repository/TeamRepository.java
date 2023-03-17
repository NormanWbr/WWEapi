package be.wamberchies.WWEapi.repository;

import be.wamberchies.WWEapi.model.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
