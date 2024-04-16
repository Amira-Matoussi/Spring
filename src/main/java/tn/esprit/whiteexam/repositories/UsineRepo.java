package tn.esprit.whiteexam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.whiteexam.entities.Usine;
@Repository
public interface UsineRepo extends JpaRepository<Usine,Long> {
}
