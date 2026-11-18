package tn.esprit.autolocapi.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Agence;
import tn.esprit.autolocapi.service.IAgenceService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/agence")
public class AgenceController {

    private final IAgenceService agenceService;

    @PostMapping("/ajouterAgence")
    public Agence ajouterAgence(@RequestBody Agence a) {
        return agenceService.ajouterAgence(a);
    }

    @PutMapping("/modifierAgence")
    public Agence modifierAgence(@RequestBody Agence a) {
        return agenceService.modifierAgence(a);
    }

    @GetMapping("/getAllAgences")
    public List<Agence> getAllAgences() {
        return agenceService.getAllAgences();
    }

    @GetMapping("/recupererAgence/{id}")
    public Agence getAgenceById(@PathVariable("id") Long id) {
        return agenceService.getAgenceById(id);
    }

    @DeleteMapping("/supprimerAgence/{id}")
    public void supprimerAgence(@PathVariable("id") Long id) {
        agenceService.supprimerAgence(id);
    }
}