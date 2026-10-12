package tn.esprit.autoloc.autolocapi.service;

import tn.esprit.autoloc.autolocapi.domain.Agence;

import java.util.List;

public interface IAgenceS {
    List<Agence> retrieveAllAgences();
    Agence addAgence(Agence a);
    Agence updateAgence(Agence a);
    Agence retrieveAgence(Long idAgence);
    void removeAgence(Long idAgence);
}
