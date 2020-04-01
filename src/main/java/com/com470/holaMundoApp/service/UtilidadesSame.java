package com.com470.holaMundoApp.service;

import com.com470.holaMundoApp.model.Persona;
import java.util.ArrayList;
import java.util.List;

public class UtilidadesSame {

    private List<Persona> personas;

    public UtilidadesSame() {
        personas = new ArrayList<Persona>();
        personas.add(new Persona("Carlos", "Romero"));
        personas.add(new Persona("Juan", "Perez"));

    }

    public Persona devuelveObjeto(Persona persona) {
        if (personas.contains(persona)) {
            return persona;
        } else {
            return new Persona("Maria", "Lopez");
        }
    }

}
