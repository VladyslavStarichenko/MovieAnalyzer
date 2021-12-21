package nure.ua.MovieAnalyzer.models;

import lombok.*;
import nure.ua.MovieAnalyzer.models.user.User;
import java.util.List;
import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cinema")
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User admin;

    @OneToMany(mappedBy = "cinema", fetch = FetchType.LAZY)
    private List<CinemaHall> halls;
}
