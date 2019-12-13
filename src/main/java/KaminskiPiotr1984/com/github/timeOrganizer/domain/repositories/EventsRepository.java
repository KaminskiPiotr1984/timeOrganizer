package KaminskiPiotr1984.com.github.timeOrganizer.domain.repositories;

import KaminskiPiotr1984.com.github.timeOrganizer.domain.entities.Event;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface EventsRepository extends JpaRepository<Event, Long> {

    List<Event> findAllByUserUsername(String user);
//List<Event>findAllByStartTimeIsAfter();
List<Event>findEventByEndTimeBefore(Event endTime);


@Query("select t from Event t where t.startTime = ?1")
    List<Event> startPoCzasie(LocalDateTime startTime);

//Optional<Event>countAllByUserUsername(String name);

    List<Event>getAllByStartTime(String name);

//    @EntityGraph(type = EntityGraph.EntityGraphType.LOAD,
//            attributePaths = {"events"})
    int countAllByUserUsername(String userName);




//    @Query("select t from Event t where t.startTime between ?1 and ?2")
//    List<Event>Międzyczas(LocalDateTime startTime, LocalDateTime endTime);

//
//    @EntityGraph(type = EntityGraph.EntityGraphType.LOAD,
//            attributePaths = {"authors"})
//    Optional<Book> findWithAuthorsById(Long id);
//
//
//    @Query("select b from Book b where b.category=?1")
//    List<Book> dawajZKategorii(Category category);
//
//    @Query("select b from Book b  where b.title=?1")
//    List<Book> chrzanićKsiążkiBezTegoTytułu(String title);
//
//
//
//
//    @Query("select b from Book b where b.rating between ?1 and ?2 ")
//    List<Book> książkiGdzieRatingPomiędzyWartościami(Double rating);
//
//
//    @Query("select p from Book p where p.authors = ?1")
//    List<Book> książkiWydawcy(Publisher id);
//
//
//    @Query("select b from Book b where b.category = ?1")
//    List<Book> pierwszaKsiążkaZKategoriiSortTytuł(Category category);





//    @Query("select p from Book p where p.authors = ?1")
//    List<Book> książkiWydawcy(Publisher id);
}
