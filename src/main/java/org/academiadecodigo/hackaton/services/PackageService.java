package org.academiadecodigo.hackaton.services;

import org.academiadecodigo.hackaton.persistence.model.Pact;

import java.util.List;

public interface PackageService {

    Pact get(Integer id);

    List<Pact> list();

    void delete(Integer id);

    void add(Pact aPackage);

}
