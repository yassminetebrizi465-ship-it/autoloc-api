package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Paiement;

import java.util.List;

public interface IPaiementService {
    Paiement ajouterPaiement(Paiement p);
    Paiement modifierPaiement(Paiement p);
    Paiement getPaiementById(Long id);
    List<Paiement> getAllPaiements();
    void supprimerPaiement(Long id);
}