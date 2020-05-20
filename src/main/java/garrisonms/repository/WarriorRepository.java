package garrisonms.repository;

import garrisonms.entity.Warrior;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WarriorRepository extends JpaRepository<Warrior, Long> {
}