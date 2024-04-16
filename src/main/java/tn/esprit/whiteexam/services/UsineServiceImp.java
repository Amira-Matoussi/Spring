package tn.esprit.whiteexam.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.whiteexam.entities.Usine;
import tn.esprit.whiteexam.repositories.UsineRepo;
@Service
@AllArgsConstructor
public class UsineServiceImp implements IUsineService{
    UsineRepo usineRepo;
    public Usine ajouterUsine(Usine u)
    {
        return usineRepo.save(u);
    }
}
