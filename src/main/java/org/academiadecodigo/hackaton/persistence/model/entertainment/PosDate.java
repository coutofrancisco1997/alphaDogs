package org.academiadecodigo.hackaton.persistence.model.entertainment;

import javax.persistence.Entity;

@Entity
public class PosDate extends Entertainment {

    @Override
    public EntertainmentType getEntertainmentType() {
        return EntertainmentType.POS_DATE;
    }
}
