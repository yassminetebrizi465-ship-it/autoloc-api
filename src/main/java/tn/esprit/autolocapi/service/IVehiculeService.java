package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Vehicule;

import java.util.List;

public interface IVehiculeService {

    public Vehicule ajouterVehicule(Vehicule vehicule);

    public Vehicule modifierVehicule(Vehicule vehicule);

    public Vehicule getVehiculeById(Long id);

    public List<Vehicule> getAllVehicules();

    public void supprimerVehiculeById(Long id);



}
