package tn.esprit.whiteexam.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.whiteexam.entities.Contract;
import tn.esprit.whiteexam.entities.Employee;
import tn.esprit.whiteexam.entities.Usine;
import tn.esprit.whiteexam.repositories.ContractRepo;
import tn.esprit.whiteexam.repositories.EmployeeRepo;
import tn.esprit.whiteexam.repositories.UsineRepo;

import java.util.Set;

@Service
@AllArgsConstructor

public class EmployeeServiceImp implements IEmployeeService{
    EmployeeRepo employeeRepo;
    UsineRepo usineRepo2;
    ContractRepo contractRepo;
    @Override
    public void ajouterEmployesEtAffecterAUsine(long usineId, Set<Employee> employes) {
        Usine u = usineRepo2.findById(usineId).orElse(null);
        u.setEmployees(employes);
        usineRepo2.save(u);
    }

    @Override
    public void affecterContratAEmploye(long contratId, long employeId) {
        Contract c = contractRepo.findById(contratId).orElse(null);
        Employee e = employeeRepo.findById(employeId).orElse(null);
        employeeRepo.save(e); //save naamlouha ll autoritaire
    }

}
