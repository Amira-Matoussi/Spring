package tn.esprit.whiteexam.entities;

import jakarta.persistence.*;
import lombok.*;
import tn.esprit.whiteexam.entities.Employee;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idUsine;
    String name;
    String address;
    @Column(length = 8)
    int phone ;
    @OneToMany
    Set<Employee> employees;


}
