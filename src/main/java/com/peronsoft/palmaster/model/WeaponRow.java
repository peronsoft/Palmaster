package com.peronsoft.palmaster.model;

import java.util.List;

public class WeaponRow {

    private List<String> values;

    public WeaponRow (List<String> values){
        this.values=values;
    }

    public List <String> getValues() {
        return values;
    }

    public String getValue (int index){
        return values.get(index);
    }

}
