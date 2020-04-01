package com.com470.holaMundoApp.service;

import com.com470.holaMundoApp.model.Persona;
import java.util.ArrayList;
import java.util.List;

public class UtilidadesNull {

    private List<Persona> personas;
    //delcara lista de personas

    public UtilidadesNull() {
        personas = new ArrayList<>();
        personas.add(new Persona("Carlos", "Romero"));
        personas.add(new Persona("Juan", "Perez"));
        personas.add(new Persona("Maria", "Lopez"));
    }

    public Persona buscaPersona(String nombres) {
        Persona p = null;
        for (Persona persona : personas) {
            if (persona.getNombres().equalsIgnoreCase(nombres)) {
                p = persona;
            }
        }
        return p;
    }
}
