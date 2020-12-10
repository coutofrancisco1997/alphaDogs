package org.academiadecodigo.hackaton.services;

import org.academiadecodigo.hackaton.persistence.model.entertainment.Entertainment;
import org.academiadecodigo.hackaton.persistence.model.entertainment.EntertainmentType;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EntertainmentServiceImpl implements EntertainmentService {

    private Map<Integer, Entertainment> entertainmentMap = new HashMap<>();

    @Override
    public Entertainment get(Integer id){
        return entertainmentMap.get(id);
    }

    @Override
    public List<Entertainment> list(){
        return new ArrayList<>(entertainmentMap.values());
    }

    @Override
    public void delete(Integer id) {
        entertainmentMap.remove(id);
    }

    @Override
    public void add(Entertainment entertainment){

        if (entertainment.getId() == null) {
            entertainment.setId(getNextId());
        }

        entertainmentMap.put(entertainment.getId(), entertainment);
    }

    @Override
    public List<Entertainment> listByType(EntertainmentType entertainmentType) {

        List<Entertainment> newList = new ArrayList<>();
        List<Entertainment> mapList = list();

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
