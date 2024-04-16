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
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idContract;
    float salary;
    TypeContract type;
    LocalDate startDate, endDate;
    @OneToOne(mappedBy = "contract")
    Employee employee;

}
