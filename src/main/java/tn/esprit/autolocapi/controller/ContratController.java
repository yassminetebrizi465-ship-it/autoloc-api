package tn.esprit.autolocapi.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Contrat;
import tn.esprit.autolocapi.service.IContratService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/contrat")
public class ContratController {

    private final IContratService contratService;

    @PostMapping("/ajouterContrat")
    public Contrat ajouterContrat(@RequestBody Contrat c) {
        return contratService.ajouterContrat(c);
    }

    @PutMapping("/modifierContrat")
    public Contrat modifierContrat(@RequestBody Contrat c) {
        return contratService.modifierContrat(c);
    }

    @GetMapping("/getAllContrats")
    public List<Contrat> getAllContrats() {
        return contratService.getAllContrats();
    }

    @GetMapping("/recupererContrat/{id}")
    public Contrat getContratById(@PathVariable("id") Long id) {
        return contratService.getContratById(id);
    }

    @DeleteMapping("/supprimerContrat/{id}")
    public void supprimerContrat(@PathVariable("id") Long id) {
        contratService.supprimerContrat(id);
    }
}