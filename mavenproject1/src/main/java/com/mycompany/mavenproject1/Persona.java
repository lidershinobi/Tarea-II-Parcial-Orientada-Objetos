package com.mycompany.mavenproject1;

public class Persona {
    private String Nombre;
    private String Apellido; 
    private int Edad;
    private String Carrera;

    public Persona(){}
    
    public void Informacion(){
        System.out.println("Nombre: " + Nombre);
        System.out.println("Apellido: " + Apellido);
        System.out.println("Edad: " + Edad);
        System.out.println("Carrera: " + Carrera);
    }
    
    public void SetNombre(String nombre){
        this.Nombre = nombre;
    }
    
    public void SetApellido(String apellido){
        this.Apellido = apellido;
    }
    
    public void SetEdad(int edad){
        this.Edad = edad;
    }
    
    public void SetCarrera(String carrera){
        this.Carrera = carrera;
    }
    
}
