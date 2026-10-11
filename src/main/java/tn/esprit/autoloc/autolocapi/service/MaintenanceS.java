package tn.esprit.autoloc.autolocapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.autolocapi.domain.Maintenance;
import tn.esprit.autoloc.autolocapi.repository.MaintenanceR;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MaintenanceS implements IMaintenanceS {
    private final MaintenanceR maintenanceR;

    @Override
    public List<Maintenance> retrieveAllMaintenances() { return maintenanceR.findAll(); }
    @Override
    public Maintenance addMaintenance(Maintenance m) { return maintenanceR.save(m); }
    @Override
    public Maintenance updateMaintenance(Maintenance m) { return maintenanceR.save(m); }
    @Override
    public Maintenance retrieveMaintenance(Long idMaintenance) { return maintenanceR.findById(idMaintenance).orElse(null); }
    @Override
    public void removeMaintenance(Long idMaintenance) { maintenanceR.deleteById(idMaintenance); }
    @Override
    public List<Maintenance> addMaintenances(List<Maintenance> maintenances) { return maintenanceR.saveAll(maintenances); }
}
