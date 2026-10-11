package tn.esprit.autoloc.autolocapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.autolocapi.domain.Equipement;
import tn.esprit.autoloc.autolocapi.repository.EquipementR;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EquipementS implements IEquipementS {
    private final EquipementR equipementR;

    @Override
    public List<Equipement> retrieveAllEquipements() { return equipementR.findAll(); }
    @Override
    public Equipement addEquipement(Equipement e) { return equipementR.save(e); }
    @Override
    public Equipement updateEquipement(Equipement e) { return equipementR.save(e); }
    @Override
    public Equipement retrieveEquipement(Long idEquipement) { return equipementR.findById(idEquipement).orElse(null); }
    @Override
    public void removeEquipement(Long idEquipement) { equipementR.deleteById(idEquipement); }
    @Override
    public List<Equipement> addEquipements(List<Equipement> equipements) { return equipementR.saveAll(equipements); }
}
