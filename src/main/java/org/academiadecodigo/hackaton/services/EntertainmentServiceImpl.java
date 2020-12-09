package org.academiadecodigo.hackaton.services;

import org.academiadecodigo.hackaton.persistence.dao.EntertainmentDao;
import org.academiadecodigo.hackaton.persistence.model.entertainment.Entertainment;
import org.academiadecodigo.hackaton.persistence.model.entertainment.EntertainmentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
public class EntertainmentServiceImpl implements EntertainmentService {

    private Map<Integer, Entertainment> entertainmentMap = new HashMap<>();

    @Override
    public Entertainment getOnMap(Integer id){
        return entertainmentMap.get(id);
    }

    @Override
    public List<Entertainment> getListFromMap(){
        return new ArrayList<>(entertainmentMap.values());
    }

    @Override
    public void deleteEntertainmentFromMap(Integer id) {
        entertainmentMap.remove(id);
    }

    @Override
    public void addOnMap(Entertainment entertainment){

        if (entertainment.getId() == null) {
            entertainment.setId(getNextId());
        }

        entertainmentMap.put(entertainment.getId(), entertainment);
    }

    @Override
    public List<Entertainment> getListFromMapByType(EntertainmentType entertainmentType) {

        List<Entertainment> newList = new ArrayList<>();
        List<Entertainment> mapList = getListFromMap();

        for (Entertainment entertainment: mapList) {
            if(entertainment.getEntertainmentType()==entertainmentType){
                newList.add(entertainment);
            }
        }

        return newList;
    }

    private Integer getNextId() {
        return entertainmentMap.isEmpty() ? 1 : Collections.max(entertainmentMap.keySet()) + 1;
    }

}
