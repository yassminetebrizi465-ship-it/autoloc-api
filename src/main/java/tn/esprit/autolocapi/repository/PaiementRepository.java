package tn.esprit.autolocapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autolocapi.domain.Paiement;

public interface PaiementRepository extends JpaRepository<Paiement, Long> {
}