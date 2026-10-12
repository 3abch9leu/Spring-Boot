package tn.esprit.autoloc.autolocapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.autolocapi.domain.Employe;

public interface EmployeR extends JpaRepository<Employe,Long> {

}
