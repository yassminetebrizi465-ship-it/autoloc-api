package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Employe;

import java.util.List;

public interface IEmployeService {
    Employe ajouterEmploye(Employe e);
    Employe modifierEmploye(Employe e);
    Employe getEmployeById(Long id);
    List<Employe> getAllEmployes();
    void supprimerEmploye(Long id);
}