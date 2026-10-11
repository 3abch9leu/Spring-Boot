package tn.esprit.autoloc.autolocapi.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autolocapi.domain.Equipement;
import tn.esprit.autoloc.autolocapi.service.IEquipementS;
import java.util.List;

@RestController
@RequestMapping("/api/equipements")
@RequiredArgsConstructor
public class EquipementController {
    private final IEquipementS equipementService;

    @PostMapping
    public Equipement add(@RequestBody Equipement e) { return equipementService.addEquipement(e); }
    @GetMapping
    public List<Equipement> all() { return equipementService.retrieveAllEquipements(); }
    @GetMapping("/{id}")
    public Equipement one(@PathVariable Long id) { return equipementService.retrieveEquipement(id); }
    @PutMapping
    public Equipement update(@RequestBody Equipement e) { return equipementService.updateEquipement(e); }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { equipementService.removeEquipement(id); }
}
