package tn.esprit.whiteexam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.whiteexam.entities.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {
}