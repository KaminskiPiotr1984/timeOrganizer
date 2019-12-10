package KaminskiPiotr1984.com.github.timeOrganizer.domain.repositories;

import KaminskiPiotr1984.com.github.timeOrganizer.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}