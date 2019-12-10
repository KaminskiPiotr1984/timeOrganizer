package KaminskiPiotr1984.com.github.timeOrganizer.domain.entities;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.sql.Timestamp;

@Entity
@Table(name = "posts")
@Getter
@Setter

@EqualsAndHashCode(of = "id")
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @Size(max = 250)
    private String description;

    @Column(nullable = false)
    @CreationTimestamp
    private Timestamp startTime;

    @Column(nullable = false)
    @CreationTimestamp
    private Timestamp endTime;

    @Column
    private Boolean repeating = Boolean.FALSE;

}
