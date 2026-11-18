package tn.esprit.autolocapi.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Client;
import tn.esprit.autolocapi.service.IClientService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/client")
public class ClientController {

    private final IClientService clientService;

    @PostMapping("/ajouterClient")
    public Client ajouterClient(@RequestBody Client c) {
        return clientService.ajouterClient(c);
    }

    @PutMapping("/modifierClient")
    public Client modifierClient(@RequestBody Client c) {
        return clientService.modifierClient(c);
    }

    @GetMapping("/getAllClients")
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    @GetMapping("/recupererClient/{id}")
    public Client getClientById(@PathVariable("id") Long id) {
        return clientService.getClientById(id);
    }

    @DeleteMapping("/supprimerClient/{id}")
    public void supprimerClient(@PathVariable("id") Long id) {
        clientService.supprimerClient(id);
    }
}