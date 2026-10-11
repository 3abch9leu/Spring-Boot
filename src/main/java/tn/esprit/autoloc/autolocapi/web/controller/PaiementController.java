package tn.esprit.autoloc.autolocapi.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autolocapi.domain.Paiement;
import tn.esprit.autoloc.autolocapi.service.IPaiementS;
import java.util.List;

@RestController
@RequestMapping("/api/paiements")
@RequiredArgsConstructor
public class PaiementController {
    private final IPaiementS paiementService;

    @PostMapping
    public Paiement add(@RequestBody Paiement p) { return paiementService.addPaiement(p); }
    @GetMapping
    public List<Paiement> all() { return paiementService.retrieveAllPaiements(); }
    @GetMapping("/{id}")
    public Paiement one(@PathVariable Long id) { return paiementService.retrievePaiement(id); }
    @PutMapping
    public Paiement update(@RequestBody Paiement p) { return paiementService.updatePaiement(p); }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { paiementService.removePaiement(id); }
}
