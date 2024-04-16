package tn.esprit.whiteexam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.whiteexam.entities.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long> {
}
