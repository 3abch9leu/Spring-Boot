package tn.esprit.autoloc.autolocapi.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autolocapi.domain.Contrat;
import tn.esprit.autoloc.autolocapi.service.IContratS;
import java.util.List;

@RestController
@RequestMapping("/api/contrats")
@RequiredArgsConstructor
public class ContratController {
    private final IContratS contratService;

    @PostMapping
    public Contrat add(@RequestBody Contrat c) { return contratService.addContrat(c); }
    @GetMapping
    public List<Contrat> all() { return contratService.retrieveAllContrats(); }
    @GetMapping("/{id}")
    public Contrat one(@PathVariable Long id) { return contratService.retrieveContrat(id); }
    @PutMapping
    public Contrat update(@RequestBody Contrat c) { return contratService.updateContrat(c); }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { contratService.removeContrat(id); }
}
