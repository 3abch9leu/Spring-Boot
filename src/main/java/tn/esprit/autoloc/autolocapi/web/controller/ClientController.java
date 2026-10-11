package tn.esprit.autoloc.autolocapi.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autolocapi.domain.Client;
import tn.esprit.autoloc.autolocapi.service.IClientS;
import java.util.List;

@RestController
@RequestMapping("/api/clients")
@RequiredArgsConstructor
public class ClientController {
    private final IClientS clientService;

    @PostMapping
    public Client add(@RequestBody Client c) { return clientService.addClient(c); }
    @GetMapping
    public List<Client> all() { return clientService.retrieveAllClients(); }
    @GetMapping("/{id}")
    public Client one(@PathVariable Long id) { return clientService.retrieveClient(id); }
    @PutMapping
    public Client update(@RequestBody Client c) { return clientService.updateClient(c); }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { clientService.removeClient(id); }
}
