package tn.esprit.autoloc.autolocapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.autolocapi.domain.Reservation;
import tn.esprit.autoloc.autolocapi.repository.ReservationR;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationS implements IReservationS {
    private final ReservationR reservationR;

    @Override
    public List<Reservation> retrieveAllReservations() { return reservationR.findAll(); }
    @Override
    public Reservation addReservation(Reservation r) { return reservationR.save(r); }
    @Override
    public Reservation updateReservation(Reservation r) { return reservationR.save(r); }
    @Override
    public Reservation retrieveReservation(Long idReservation) { return reservationR.findById(idReservation).orElse(null); }
    @Override
    public void removeReservation(Long idReservation) { reservationR.deleteById(idReservation); }
}
