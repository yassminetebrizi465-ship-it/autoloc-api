package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Equipement;

import java.util.List;

public interface IEquipementService {
    Equipement ajouterEquipement(Equipement e);
    Equipement modifierEquipement(Equipement e);
    Equipement getEquipementById(Long id);
    List<Equipement> getAllEquipements();
    void supprimerEquipement(Long id);
}