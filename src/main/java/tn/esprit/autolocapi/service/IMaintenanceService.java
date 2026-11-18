package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Maintenance;

import java.util.List;

public interface IMaintenanceService {
    Maintenance ajouterMaintenance(Maintenance m);
    Maintenance modifierMaintenance(Maintenance m);
    Maintenance getMaintenanceById(Long id);
    List<Maintenance> getAllMaintenances();
    void supprimerMaintenance(Long id);
}