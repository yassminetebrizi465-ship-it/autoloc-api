package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Contrat;

import java.util.List;

public interface IContratService {
    Contrat ajouterContrat(Contrat c);
    Contrat modifierContrat(Contrat c);
    Contrat getContratById(Long id);
    List<Contrat> getAllContrats();
    void supprimerContrat(Long id);
}