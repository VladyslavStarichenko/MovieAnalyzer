package nure.ua.MovieAnalyzer.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "hall")
public class CinemaHall {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String color;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="cinema_id", nullable = false)
    private Cinema cinema;

    private  Integer sit_count;

    @OneToMany(mappedBy = "hall")
    private List<Movie> movies;
}
