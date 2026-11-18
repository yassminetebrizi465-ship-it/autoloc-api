package tn.esprit.autolocapi.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Vehicule;
import tn.esprit.autolocapi.service.IVehiculeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/vehicules")
public class VehiculeController {

    private final IVehiculeService vehiculeService;

    /* or
    private final IVehiculeServiceImp vehiculeServiceImp; */

    @PostMapping("/ajouterVehicule")
    public Vehicule ajouterVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.ajouterVehicule(vehicule);
    }

    @PutMapping("/modifierVehicule")
    public Vehicule modifierVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.modifierVehicule(vehicule);
    }

    @GetMapping("/getAllVehicule")
    public List<Vehicule> getAllVehicule() {
        return  vehiculeService.getAllVehicules();
    }

    @GetMapping("/recupererVehicule/{id}")
    public Vehicule getVehiculeById(@PathVariable Long id) {
        return vehiculeService.getVehiculeById(id);
    }

    @DeleteMapping("/deleteVehiculeById/{id}")
    public void supprimerVehiculeById(@PathVariable Long id) {
        vehiculeService.supprimerVehiculeById(id);
    }

}
