
package com.mycompany.mavenproject1;

public class Main {


    public static void main(String[] args) {
        
        Deportista deportista = new Deportista();
        Doctor doctor = new Doctor();
        
        
        System.out.println("--------------------------------------------");
        deportista.Informacion();
        deportista.SetVestimenta("Calzoneta, Camisa Corta");
        deportista.SetSexo("Masculino");
        deportista.SetEspecialidad("Gimnasta Local");
        deportista.GetVestimenta();
        deportista.GetSexo();
        deportista.GetEspecialidad();
        System.out.println("--------------------------------------------");
        doctor.Informacion();
        doctor.SetVestimenta("Pantalon y Bata Blanca");
        doctor.SetSexo("Femenino");
        doctor.SetEspecialidad("Cirujia Craneal");
        doctor.GetVestimenta();
        doctor.GetSexo();
        doctor.GetEspecialidad();
        System.out.println("--------------------------------------------");
        
        
        
  
        
    }
    
}
