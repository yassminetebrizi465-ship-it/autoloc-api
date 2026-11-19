package tn.esprit.autolocapi.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Employe;
import tn.esprit.autolocapi.service.IEmployeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/employe")
public class EmployeController {

    private final IEmployeService employeService;

    @PostMapping("/ajouterEmploye")
    public Employe ajouterEmploye(@RequestBody Employe e) {
        return employeService.ajouterEmploye(e);
    }

    @PutMapping("/modifierEmploye")
    public Employe modifierEmploye(@RequestBody Employe e) {
        return employeService.modifierEmploye(e);
    }

    @GetMapping("/getAllEmployes")
    public List<Employe> getAllEmployes() {
        return employeService.getAllEmployes();
    }

    @GetMapping("/recupererEmploye/{id}")
    public Employe getEmployeById(@PathVariable("id") Long id) {
        return employeService.getEmployeById(id);
    }

    @DeleteMapping("/supprimerEmploye/{id}")
    public void supprimerEmploye(@PathVariable("id") Long id) {
        employeService.supprimerEmploye(id);
    }

    @PutMapping("/desaffecterEmploye/{idEmploye}")
    public Employe dessaffecterEmploye(@PathVariable Long idEmploye) {
        return employeService.desaffecterEmploye(idEmploye);
    }

    @PutMapping("/affecterEmploye/{idEmploye}/{idAgence}")
    public Employe affecterEmploye(@PathVariable Long idEmploye, @PathVariable Long idAgence) {
        return employeService.affecterEmploye(idEmploye, idAgence);
    }
}