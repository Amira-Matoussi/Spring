package tn.esprit.whiteexam.restController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import tn.esprit.whiteexam.entities.Employee;
import tn.esprit.whiteexam.entities.Usine;
import tn.esprit.whiteexam.services.IContractService;
import tn.esprit.whiteexam.services.IEmployeeService;
import tn.esprit.whiteexam.services.IUsineService;

import java.util.Set;

@org.springframework.web.bind.annotation.RestController
@AllArgsConstructor

public class RestController {
    IUsineService iUsineService ;
    IContractService iContractService;
    IEmployeeService iEmployeeService;

    @PostMapping("/usine")
    Usine ajouterUsine(@RequestBody Usine u) {
        return iUsineService.ajouterUsine(u);
    }
    @PutMapping("/employe-usine/{usine-id}")
    void ajouterEmployesEtAffecterAUsine(@PathVariable("usine-id") long usineId,@RequestBody Set<Employee> employes) {
        iEmployeeService.ajouterEmployesEtAffecterAUsine(usineId ,employes);
    }
    @PutMapping("/contract-employee/{contract-id}/ {employee-id}")
    public void affecterContratAEmploye( @PathVariable("contract-id") long contratId,@PathVariable("employee-id") long employeId) {
        iEmployeeService.affecterContratAEmploye(contratId,employeId);
    }

}
