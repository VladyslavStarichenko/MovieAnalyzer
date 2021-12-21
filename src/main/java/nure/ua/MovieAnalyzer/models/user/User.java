package nure.ua.MovieAnalyzer.models.user;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nure.ua.MovieAnalyzer.models.BaseEntity;
import nure.ua.MovieAnalyzer.models.Cinema;


import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User extends BaseEntity {

    @Id
    @GeneratedValue(generator = "UUID")
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "user_name", unique = true, nullable = false)
    @Size(min = 2, message = "Username should be unique and with length more then 2")
    private String userName;

    @Column(name = "password")
    private String password;

    @ManyToOne
    private Role role;

    @OneToOne(mappedBy = "admin")
    private Cinema cinema;

    @OneToOne(mappedBy = "user")
    private Viewer viewer;


}
