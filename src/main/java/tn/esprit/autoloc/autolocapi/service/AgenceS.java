package tn.esprit.autoloc.autolocapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.autolocapi.domain.Agence;
import tn.esprit.autoloc.autolocapi.repository.AgenceR;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AgenceS implements IAgenceS {

    private final AgenceR agenceR;

    @Override
    public List<Agence> retrieveAllAgences() {
        return agenceR.findAll();
    }

    @Override
    public Agence addAgence(Agence a) {
        return agenceR.save(a);
    }

    @Override
    public Agence updateAgence(Agence a) {
        return agenceR.save(a);
    }

    @Override
    public Agence retrieveAgence(Long idAgence) {
        return agenceR.findById(idAgence).orElse(null);
    }

    @Override
    public void removeAgence(Long idAgence) {
        agenceR.deleteById(idAgence);
    }
}
