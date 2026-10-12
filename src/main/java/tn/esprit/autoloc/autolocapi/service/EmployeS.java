package tn.esprit.autoloc.autolocapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.autolocapi.domain.Employe;
import tn.esprit.autoloc.autolocapi.repository.EmployeR;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeS implements IEmployeS {
    private final EmployeR employeR;

    @Override
    public List<Employe> retrieveAllEmployes() { return employeR.findAll(); }
    @Override
    public Employe addEmploye(Employe e) { return employeR.save(e); }
    @Override
    public Employe updateEmploye(Employe e) { return employeR.save(e); }
    @Override
    public Employe retrieveEmploye(Long idEmploye) { return employeR.findById(idEmploye).orElse(null); }
    @Override
    public void removeEmploye(Long idEmploye) { employeR.deleteById(idEmploye); }
}
