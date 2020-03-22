
package com.mycompany.mavenproject1;


public class Deportista extends Persona{
    private String Vestimenta;
    private String Especialidad;
    private String Sexo;
    
    public Deportista(){
       SetNombre("Alberto");
       SetApellido("PAz");
       SetEdad(25);
       SetCarrera("Deportista Gimnasia");
    }
    
    public void SetVestimenta(String vestimenta){
        this.Vestimenta = vestimenta;
    }
    
    public void SetEspecialidad(String especialidad){
        this.Especialidad = especialidad;
    }
    
    public void SetSexo(String sexo){
        this.Sexo = sexo;
    }
    
    public void GetVestimenta(){
        System.out.println("Vestimenta: " + Vestimenta);
    }
    
    public void GetEspecialidad(){
        System.out.println("Especialidad: " + Especialidad);
    }
    
    public void GetSexo(){
        System.out.println("Sexo: " + Sexo);
    }
    
    
    }
