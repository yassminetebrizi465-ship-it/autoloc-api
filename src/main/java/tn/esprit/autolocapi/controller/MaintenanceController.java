package tn.esprit.autolocapi.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Maintenance;
import tn.esprit.autolocapi.service.IMaintenanceService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/maintenance")
public class MaintenanceController {

    private final IMaintenanceService maintenanceService;

    @PostMapping("/ajouterMaintenance")
    public Maintenance ajouterMaintenance(@RequestBody Maintenance m) {
        return maintenanceService.ajouterMaintenance(m);
    }

    @PutMapping("/modifierMaintenance")
    public Maintenance modifierMaintenance(@RequestBody Maintenance m) {
        return maintenanceService.modifierMaintenance(m);
    }

    @GetMapping("/getAllMaintenances")
    public List<Maintenance> getAllMaintenances() {
        return maintenanceService.getAllMaintenances();
    }

    @GetMapping("/recupererMaintenance/{id}")
    public Maintenance getMaintenanceById(@PathVariable("id") Long id) {
        return maintenanceService.getMaintenanceById(id);
    }

    @DeleteMapping("/supprimerMaintenance/{id}")
    public void supprimerMaintenance(@PathVariable("id") Long id) {
        maintenanceService.supprimerMaintenance(id);
    }
}