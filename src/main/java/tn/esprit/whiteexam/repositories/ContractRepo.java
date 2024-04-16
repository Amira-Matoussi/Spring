package tn.esprit.whiteexam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.whiteexam.entities.Contract;

public interface ContractRepo extends JpaRepository<Contract,Long> {
}
