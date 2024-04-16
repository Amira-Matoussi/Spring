package tn.esprit.whiteexam.services;

import tn.esprit.whiteexam.entities.Contract;

import java.util.List;

public interface IContractService {
    List<Contract> retrieveAllContracts();
    Contract addCourse(Contract course);
    Contract updateCourse (Contract course);
    Contract retrieveCourse (Contract numContract);
}
