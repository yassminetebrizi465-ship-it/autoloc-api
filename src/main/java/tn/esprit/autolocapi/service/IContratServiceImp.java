package tn.esprit.autolocapi.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolocapi.domain.Contrat;
import tn.esprit.autolocapi.repository.ContratRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class IContratServiceImp implements IContratService {

    private final ContratRepository contratRepository;

    @Override
    public Contrat ajouterContrat(Contrat c) {
        return contratRepository.save(c);
    }

    @Override
    public Contrat modifierContrat(Contrat c) {
        return contratRepository.save(c);
    }

    @Override
    public Contrat getContratById(Long id) {
        return contratRepository.findById(id).orElse(null);
    }

    @Override
    public List<Contrat> getAllContrats() {
        return contratRepository.findAll();
    }

    @Override
    public void supprimerContrat(Long id) {
        contratRepository.deleteById(id);   // CASCADE : supprime aussi les paiements
    }
}