package tn.esprit.autoloc.autolocapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.autolocapi.domain.Client;
import tn.esprit.autoloc.autolocapi.repository.ClientR;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienS implements IClientS {
    private final ClientR clientR;



    @Override
    public List<Client> retrieveAllClients() {
        return clientR.findAll();
    }

    @Override
    public Client addClient(Client c) {
        return clientR.save(c);
    }

    @Override
    public Client updateClient(Client c) {
        return clientR.save(c) ;
    }

    @Override
    public Client retrieveClient(Long idClient) {
        return clientR.findById(idClient).orElse(null);
    }

    @Override
    public void removeClient(Long idClient) {
        clientR.deleteById(idClient);
    }

    @Override
    public List<Client> addClients(List<Client> clients) {
        return clientR.saveAll(clients);
    }
}
