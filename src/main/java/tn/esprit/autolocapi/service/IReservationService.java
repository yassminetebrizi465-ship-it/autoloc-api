package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation ajouterReservation(Reservation r);
    Reservation modifierReservation(Reservation r);
    Reservation getReservationById(Long id);
    List<Reservation> getAllReservations();
    void supprimerReservation(Long id);
}