package tn.esprit.autoloc.autolocapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.autolocapi.domain.Agence;

public interface AgenceR extends JpaRepository<Agence,Long> {

}
