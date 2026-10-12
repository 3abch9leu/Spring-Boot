package tn.esprit.autoloc.autolocapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.autolocapi.domain.Contrat;
import tn.esprit.autoloc.autolocapi.repository.ContratR;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ContratS implements IContratS {
    private final ContratR contratR;

    @Override
    public List<Contrat> retrieveAllContrats() { return contratR.findAll(); }
    @Override
    public Contrat addContrat(Contrat c) { return contratR.save(c); }
    @Override
    public Contrat updateContrat(Contrat c) { return contratR.save(c); }
    @Override
    public Contrat retrieveContrat(Long idContrat) { return contratR.findById(idContrat).orElse(null); }
    @Override
    public void removeContrat(Long idContrat) { contratR.deleteById(idContrat); }
}
