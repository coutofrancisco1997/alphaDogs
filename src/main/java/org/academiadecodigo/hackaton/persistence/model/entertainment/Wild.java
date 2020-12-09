package org.academiadecodigo.hackaton.persistence.model.entertainment;

import javax.persistence.Entity;

@Entity
public class Wild extends Entertainment {

    @Override
    public EntertainmentType getBusinessType() {
        return EntertainmentType.WILD;
    }

}
