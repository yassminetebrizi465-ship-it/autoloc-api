package tn.esprit.autolocapi.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolocapi.domain.Reservation;
import tn.esprit.autolocapi.repository.ReservationRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class IReservationServiceImp implements IReservationService {

    private final ReservationRepository reservationRepository;

    @Override
    public Reservation ajouterReservation(Reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public Reservation modifierReservation(Reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public Reservation getReservationById(Long id) {
        return reservationRepository.findById(id).orElse(null);
    }

    @Override
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public void supprimerReservation(Long id) {
        reservationRepository.deleteById(id);
    }
}