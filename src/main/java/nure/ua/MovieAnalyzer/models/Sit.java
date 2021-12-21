//package nure.ua.MovieAnalyzer.models;
//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import javax.persistence.*;
//
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity
//@Table(name = "sit")
//public class Sit {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//
//    private Integer row_number;
//    private Integer column_number;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "hall_id", referencedColumnName = "id")
//    private CinemaHall hall;
//}
