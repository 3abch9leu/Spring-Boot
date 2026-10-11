package tn.esprit.autoloc.autolocapi.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autolocapi.domain.Reservation;
import tn.esprit.autoloc.autolocapi.service.IReservationS;
import java.util.List;

@RestController
@RequestMapping("/api/reservations")
@RequiredArgsConstructor
public class ReservationController {
    private final IReservationS reservationService;

    @PostMapping
    public Reservation add(@RequestBody Reservation r) { return reservationService.addReservation(r); }
    @GetMapping
    public List<Reservation> all() { return reservationService.retrieveAllReservations(); }
    @GetMapping("/{id}")
    public Reservation one(@PathVariable Long id) { return reservationService.retrieveReservation(id); }
    @PutMapping
    public Reservation update(@RequestBody Reservation r) { return reservationService.updateReservation(r); }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { reservationService.removeReservation(id); }
}
