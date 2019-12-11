package KaminskiPiotr1984.com.github.timeOrganizer.domain.repositories;

import KaminskiPiotr1984.com.github.timeOrganizer.domain.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventsRepository extends JpaRepository<Event, Long> {
}
