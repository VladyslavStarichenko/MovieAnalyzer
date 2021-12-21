package nure.ua.MovieAnalyzer.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "emotion")
public class Emotion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer value;

    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="watch_id", nullable = false)
    private Watch watch;
}
