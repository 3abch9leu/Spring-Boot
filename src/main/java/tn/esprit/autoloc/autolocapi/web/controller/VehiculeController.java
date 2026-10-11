package tn.esprit.autoloc.autolocapi.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autolocapi.domain.Vehicule;
import tn.esprit.autoloc.autolocapi.service.IVehiculeS;
import java.util.List;

@RestController
@RequestMapping("/api/vehicules")
@RequiredArgsConstructor
public class VehiculeController {
    private final IVehiculeS vehiculeService;

    @PostMapping
    public Vehicule add(@RequestBody Vehicule v) { return vehiculeService.addVehicule(v); }
    @GetMapping
    public List<Vehicule> all() { return vehiculeService.retrieveAllVehicules(); }
    @GetMapping("/{id}")
    public Vehicule one(@PathVariable Long id) { return vehiculeService.retrieveVehicule(id); }
    @PutMapping
    public Vehicule update(@RequestBody Vehicule v) { return vehiculeService.updateVehicule(v); }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { vehiculeService.removeVehicule(id); }
}
