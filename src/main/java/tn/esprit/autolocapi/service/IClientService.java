package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Client;

import java.util.List;

public interface IClientService {
    Client ajouterClient(Client c);
    Client modifierClient(Client c);
    Client getClientById(Long id);
    List<Client> getAllClients();
    void supprimerClient(Long id);
}