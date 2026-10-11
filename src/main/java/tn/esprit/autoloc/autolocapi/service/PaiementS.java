package tn.esprit.autoloc.autolocapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.autolocapi.domain.Paiement;
import tn.esprit.autoloc.autolocapi.repository.PaiementR;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PaiementS implements IPaiementS {
    private final PaiementR paiementR;

    @Override
    public List<Paiement> retrieveAllPaiements() { return paiementR.findAll(); }
    @Override
    public Paiement addPaiement(Paiement p) { return paiementR.save(p); }
    @Override
    public Paiement updatePaiement(Paiement p) { return paiementR.save(p); }
    @Override
    public Paiement retrievePaiement(Long idPaiement) { return paiementR.findById(idPaiement).orElse(null); }
    @Override
    public void removePaiement(Long idPaiement) { paiementR.deleteById(idPaiement); }
    @Override
    public List<Paiement> addPaiements(List<Paiement> paiements) { return paiementR.saveAll(paiements); }
}
