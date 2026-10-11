package tn.esprit.autoloc.autolocapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.autolocapi.domain.Vehicule;
import tn.esprit.autoloc.autolocapi.repository.VehiculeR;
import java.util.List;

@Service
@RequiredArgsConstructor
public class VehiculeS implements IVehiculeS {
    private final VehiculeR vehiculeR;

    @Override
    public List<Vehicule> retrieveAllVehicules() { return vehiculeR.findAll(); }
    @Override
    public Vehicule addVehicule(Vehicule v) { return vehiculeR.save(v); }
    @Override
    public Vehicule updateVehicule(Vehicule v) { return vehiculeR.save(v); }
    @Override
    public Vehicule retrieveVehicule(Long idVehicule) { return vehiculeR.findById(idVehicule).orElse(null); }
    @Override
    public void removeVehicule(Long idVehicule) { vehiculeR.deleteById(idVehicule); }
    @Override
    public List<Vehicule> addVehicules(List<Vehicule> vehicules) { return vehiculeR.saveAll(vehicules); }
}
