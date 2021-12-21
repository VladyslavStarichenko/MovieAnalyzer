package nure.ua.MovieAnalyzer.models;


import lombok.*;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "movie")
public class Movie  extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="hall_id", nullable = false)
    private CinemaHall hall;

    private Integer duration;

    private String name;

    @OneToMany(mappedBy="movie")
    private List<Watch> watches;

    private String author;

    private String description;

    private Integer ticket_price;

}
