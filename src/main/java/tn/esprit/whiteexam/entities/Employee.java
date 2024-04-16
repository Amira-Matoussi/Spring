package tn.esprit.whiteexam.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idEmp;
    String name;
    String firstName;
    LocalDate date;
    @Enumerated(EnumType.STRING)
    Sex sexe;
    @ManyToOne
    Usine usine;
    @OneToOne
    Contract contract;
}
