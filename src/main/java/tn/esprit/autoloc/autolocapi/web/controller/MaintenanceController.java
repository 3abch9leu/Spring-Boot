package tn.esprit.autoloc.autolocapi.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autolocapi.domain.Maintenance;
import tn.esprit.autoloc.autolocapi.service.IMaintenanceS;
import java.util.List;

@RestController
@RequestMapping("/api/maintenances")
@RequiredArgsConstructor
public class MaintenanceController {
    private final IMaintenanceS maintenanceService;

    @PostMapping
    public Maintenance add(@RequestBody Maintenance m) { return maintenanceService.addMaintenance(m); }
    @GetMapping
    public List<Maintenance> all() { return maintenanceService.retrieveAllMaintenances(); }
    @GetMapping("/{id}")
    public Maintenance one(@PathVariable Long id) { return maintenanceService.retrieveMaintenance(id); }
    @PutMapping
    public Maintenance update(@RequestBody Maintenance m) { return maintenanceService.updateMaintenance(m); }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { maintenanceService.removeMaintenance(id); }
}
