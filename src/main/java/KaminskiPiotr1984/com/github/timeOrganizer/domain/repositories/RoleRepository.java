package KaminskiPiotr1984.com.github.timeOrganizer.domain.repositories;

import KaminskiPiotr1984.com.github.timeOrganizer.domain.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role getByName(String name);
}