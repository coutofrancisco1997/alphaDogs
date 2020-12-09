package org.academiadecodigo.hackaton.persistence.model.entertainment;


import org.academiadecodigo.hackaton.persistence.model.AbstractModel;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity(name = "entertainment")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "entertainment_type")
public abstract class Entertainment extends AbstractModel {

    private String name;
    /*private Time open;
    private Time close;*/

    public abstract EntertainmentType getBusinessType();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
/*
    public Time getOpen() {
        return open;
    }

    public void setOpen(Time open) {
        this.open = open;
    }

    public Time getClose() {
        return close;
    }

    public void setClose(Time close) {
        this.close = close;
    }*/
}
