package tn.esprit.autoloc.autolocapi.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autolocapi.domain.Agence;
import tn.esprit.autoloc.autolocapi.service.IAgenceS;
import java.util.List;

@RestController
@RequestMapping("/api/agences")
@RequiredArgsConstructor
public class AgenceController {
    private final IAgenceS agenceService;

    @PostMapping
    public Agence add(@RequestBody Agence a) { return agenceService.addAgence(a); }
    @GetMapping
    public List<Agence> all() { return agenceService.retrieveAllAgences(); }
    @GetMapping("/{id}")
    public Agence one(@PathVariable Long id) { return agenceService.retrieveAgence(id); }
    @PutMapping
    public Agence update(@RequestBody Agence a) { return agenceService.updateAgence(a); }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { agenceService.removeAgence(id); }
}
