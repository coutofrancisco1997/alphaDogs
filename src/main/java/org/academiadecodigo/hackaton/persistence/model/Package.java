package org.academiadecodigo.hackaton.persistence.model;

import org.academiadecodigo.hackaton.persistence.model.entertainment.Entertainment;

import java.util.ArrayList;
import java.util.List;

public class Package extends AbstractModel{

    private List<Entertainment> entertainmentList = new ArrayList<>();

    public void addEntertainment(Entertainment entertainment){
        entertainmentList.add(entertainment);
    }

    public List<Entertainment> getList(){
        return entertainmentList;
    }

}
