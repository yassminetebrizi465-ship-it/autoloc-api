package tn.esprit.autolocapi.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Equipement;
import tn.esprit.autolocapi.service.IEquipementService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/equipement")
public class EquipementController {

    private final IEquipementService equipementService;

    @PostMapping("/ajouterEquipement")
    public Equipement ajouterEquipement(@RequestBody Equipement e) {
        return equipementService.ajouterEquipement(e);
    }

    @PutMapping("/modifierEquipement")
    public Equipement modifierEquipement(@RequestBody Equipement e) {
        return equipementService.modifierEquipement(e);
    }

    @GetMapping("/getAllEquipements")
    public List<Equipement> getAllEquipements() {
        return equipementService.getAllEquipements();
    }

    @GetMapping("/recupererEquipement/{id}")
    public Equipement getEquipementById(@PathVariable("id") Long id) {
        return equipementService.getEquipementById(id);
    }

    @DeleteMapping("/supprimerEquipement/{id}")
    public void supprimerEquipement(@PathVariable("id") Long id) {
        equipementService.supprimerEquipement(id);
    }
}