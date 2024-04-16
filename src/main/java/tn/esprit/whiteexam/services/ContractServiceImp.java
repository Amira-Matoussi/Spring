package tn.esprit.whiteexam.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.whiteexam.entities.Contract;
import tn.esprit.whiteexam.repositories.ContractRepo;

import java.util.List;
@Service
@AllArgsConstructor
public class ContractServiceImp implements IContractService{
    ContractRepo contractRepo;



}
