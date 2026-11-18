package tn.esprit.autolocapi.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolocapi.domain.Paiement;
import tn.esprit.autolocapi.repository.PaiementRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class IPaiementServiceImp implements IPaiementService {

    private final PaiementRepository paiementRepository;

    @Override
    public Paiement ajouterPaiement(Paiement p) {
        return paiementRepository.save(p);
    }

    @Override
    public Paiement modifierPaiement(Paiement p) {
        return paiementRepository.save(p);
    }

    @Override
    public Paiement getPaiementById(Long id) {
        return paiementRepository.findById(id).orElse(null);
    }

    @Override
    public List<Paiement> getAllPaiements() {
        return paiementRepository.findAll();
    }

    @Override
    public void supprimerPaiement(Long id) {
        paiementRepository.deleteById(id);
    }
}