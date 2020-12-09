package org.academiadecodigo.hackaton.services;

import org.academiadecodigo.hackaton.persistence.model.entertainment.Entertainment;
import org.academiadecodigo.hackaton.persistence.model.entertainment.EntertainmentType;

import java.util.List;

public interface EntertainmentService {

    Entertainment getOnMap(Integer id);

    List<Entertainment> getListFromMap();

    void deleteEntertainmentFromMap(Integer id);

    void addOnMap(Entertainment entertainment);

    List<Entertainment> getListFromMapByType(EntertainmentType entertainmentType);
}
