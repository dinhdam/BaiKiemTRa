package com.codegym.model;

public class Thing {
    private String name;
    private String desceription;
    public Thing(){
    }
    public Thing(String name,String desceription){
        this.name = name;
        this.desceription = desceription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesceription() {
        return desceription;
    }

    public void setDesceription(String desceription) {
        this.desceription = desceription;
    }
}
