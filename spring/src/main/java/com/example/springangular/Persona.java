package com.example.springangular;

public class Persona {
    private int id;
    private String name;
    private String apellidos;

    public Persona() {
    }

    public Persona(int id, String name, String apellidos) {
        this.id = id;
        this.name = name;
        this.apellidos = apellidos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}
