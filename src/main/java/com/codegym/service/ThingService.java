package com.codegym.service;

import com.codegym.model.Thing;

import java.util.List;

public interface ThingService  {
    List<Thing>findAll();
    Thing findById(Long id);
    void save(Thing thing);
    void remove (Long id);


}
