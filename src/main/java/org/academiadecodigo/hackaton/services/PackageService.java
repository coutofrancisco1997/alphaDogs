package org.academiadecodigo.hackaton.services;

import org.academiadecodigo.hackaton.persistence.model.Pacote;
import org.academiadecodigo.hackaton.persistence.model.entertainment.Entertainment;
import org.academiadecodigo.hackaton.persistence.model.entertainment.EntertainmentType;

import java.util.List;

public interface PackageService {

    Pacote get(Integer id);

    List<Pacote> list();

    void delete(Integer id);

    void add(Pacote aPackage);

}
