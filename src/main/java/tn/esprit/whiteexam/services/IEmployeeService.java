package tn.esprit.whiteexam.services;

import tn.esprit.whiteexam.entities.Employee;

import java.util.Set;

public interface IEmployeeService {
    void ajouterEmployesEtAffecterAUsine(long usineId, Set<Employee>
            employes) ;
    void affecterContratAEmploye(long contratId, long employeId) ;

}
