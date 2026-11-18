package tn.esprit.autolocapi.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Reservation;
import tn.esprit.autolocapi.service.IReservationService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationController {

    private final IReservationService reservationService;

    @PostMapping("/ajouterReservation")
    public Reservation ajouterReservation(@RequestBody Reservation r) {
        return reservationService.ajouterReservation(r);
    }

    @PutMapping("/modifierReservation")
    public Reservation modifierReservation(@RequestBody Reservation r) {
        return reservationService.modifierReservation(r);
    }

    @GetMapping("/getAllReservations")
    public List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }

    @GetMapping("/recupererReservation/{id}")
    public Reservation getReservationById(@PathVariable("id") Long id) {
        return reservationService.getReservationById(id);
    }

    @DeleteMapping("/supprimerReservation/{id}")
    public void supprimerReservation(@PathVariable("id") Long id) {
        reservationService.supprimerReservation(id);
    }
}