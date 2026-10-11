package tn.esprit.autoloc.autolocapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.autoloc.autolocapi.domain.Client;

import java.util.Optional;

public interface ClientR extends JpaRepository<Client, Long> {

    Optional<Client> findByName(String name);



}
