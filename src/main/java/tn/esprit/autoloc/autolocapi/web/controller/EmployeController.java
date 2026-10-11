package tn.esprit.autoloc.autolocapi.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autolocapi.domain.Employe;
import tn.esprit.autoloc.autolocapi.service.IEmployeS;
import java.util.List;

@RestController
@RequestMapping("/api/employes")
@RequiredArgsConstructor
public class EmployeController {
    private final IEmployeS employeService;

    @PostMapping
    public Employe add(@RequestBody Employe e) { return employeService.addEmploye(e); }
    @GetMapping
    public List<Employe> all() { return employeService.retrieveAllEmployes(); }
    @GetMapping("/{id}")
    public Employe one(@PathVariable Long id) { return employeService.retrieveEmploye(id); }
    @PutMapping
    public Employe update(@RequestBody Employe e) { return employeService.updateEmploye(e); }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { employeService.removeEmploye(id); }
}
