
package com.mycompany.mavenproject1;

public class Doctor extends Persona{
    private String Vestimenta;
    private String Especialidad;
    private String Sexo;
    
    public Doctor(){
       SetNombre("Kevin");
       SetApellido("Lozano");
       SetEdad(43);
       SetCarrera("Doctorado General");
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



    
    
    
    
