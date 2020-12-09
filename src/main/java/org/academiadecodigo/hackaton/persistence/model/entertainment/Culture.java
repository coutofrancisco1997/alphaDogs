package org.academiadecodigo.hackaton.persistence.model.entertainment;

import javax.persistence.Entity;

@Entity
public class Culture extends Entertainment {

    @Override
    public EntertainmentType getBusinessType() {
        return EntertainmentType.CULTURE;
    }
}
