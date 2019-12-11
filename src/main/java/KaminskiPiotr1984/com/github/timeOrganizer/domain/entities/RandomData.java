package KaminskiPiotr1984.com.github.timeOrganizer.domain.entities;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "random")
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "id")
public class RandomData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @Size(max = 250)
    private String description;


    @Column
    private Boolean repeating = Boolean.FALSE;



}
