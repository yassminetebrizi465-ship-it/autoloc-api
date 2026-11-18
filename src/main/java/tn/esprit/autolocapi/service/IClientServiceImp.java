package tn.esprit.autolocapi.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolocapi.domain.Client;
import tn.esprit.autolocapi.repository.ClientRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class IClientServiceImp implements IClientService {

    private final ClientRepository clientRepository;

    @Override
    public Client ajouterClient(Client c) {
        return clientRepository.save(c);
    }

    @Override
    public Client modifierClient(Client c) {
        return clientRepository.save(c);
    }

    @Override
    public Client getClientById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public void supprimerClient(Long id) {
        clientRepository.deleteById(id);
    }
}