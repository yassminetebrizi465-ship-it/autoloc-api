package tn.esprit.autolocapi.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Paiement;
import tn.esprit.autolocapi.service.IPaiementService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/paiement")
public class PaiementController {

    private final IPaiementService paiementService;

    @PostMapping("/ajouterPaiement")
    public Paiement ajouterPaiement(@RequestBody Paiement p) {
        return paiementService.ajouterPaiement(p);
    }

    @PutMapping("/modifierPaiement")
    public Paiement modifierPaiement(@RequestBody Paiement p) {
        return paiementService.modifierPaiement(p);
    }

    @GetMapping("/getAllPaiements")
    public List<Paiement> getAllPaiements() {
        return paiementService.getAllPaiements();
    }

    @GetMapping("/recupererPaiement/{id}")
    public Paiement getPaiementById(@PathVariable("id") Long id) {
        return paiementService.getPaiementById(id);
    }

    @DeleteMapping("/supprimerPaiement/{id}")
    public void supprimerPaiement(@PathVariable("id") Long id) {
        paiementService.supprimerPaiement(id);
    }
}