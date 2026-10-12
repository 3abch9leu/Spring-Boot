package tn.esprit.autoloc.autolocapi.service;

import tn.esprit.autoloc.autolocapi.domain.Employe;
import java.util.List;

public interface IEmployeS {
    List<Employe> retrieveAllEmployes();
    Employe addEmploye(Employe e);
    Employe updateEmploye(Employe e);
    Employe retrieveEmploye(Long idEmploye);
    void removeEmploye(Long idEmploye);
}
