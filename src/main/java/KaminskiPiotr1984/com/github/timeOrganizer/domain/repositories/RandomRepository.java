package KaminskiPiotr1984.com.github.timeOrganizer.domain.repositories;

import KaminskiPiotr1984.com.github.timeOrganizer.domain.entities.RandomData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RandomRepository extends JpaRepository<RandomData, Long> {
}
