package KaminskiPiotr1984.com.github.timeOrganizer.dtos;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Data
public class RandomDataCreateDTO {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Size(max = 250)
    private String description;


    private Boolean repeating = Boolean.FALSE;

    private Long user_id;
}
