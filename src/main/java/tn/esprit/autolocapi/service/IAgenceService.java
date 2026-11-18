package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Agence;

import java.util.List;

public interface IAgenceService {
    Agence ajouterAgence(Agence a);
    Agence modifierAgence(Agence a);
    Agence getAgenceById(Long id);
    List<Agence> getAllAgences();
    void supprimerAgence(Long id);
}