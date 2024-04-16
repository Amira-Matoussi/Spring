package tn.esprit.whiteexam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.whiteexam.entities.Contract;
@Repository
public interface ContractRepo extends JpaRepository<Contract,Long> {
}
