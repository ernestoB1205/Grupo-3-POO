/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejem1;

/**
 *
 * @author LENOVO
 */
public class PERSONA {
    //Atributos
    String nombres, dni, cargo, area;
    int añoser;
    
    //Costructor
    public PERSONA(String nom, String dn, String car, String ar, int as){
       nombres = nom;
       dni = dn;
       cargo = car;
       area = ar;
       añoser = as;
    }
    
    //Metodo para calcular el sueldo base 
    double calcularSuelBa(){
        if (cargo.equals("GERENTE") && area.equals("CONTABILIDAD"))return 6000;
        if (cargo.equals("GERENTE") && area.equals("PLANIFICACION"))return 7000;
        if (cargo.equals("SUBGERENTE") && area.equals("CONTABILIDAD"))return 8000;
        if (cargo.equals("SUBGERENTE") && area.equals("PLANIFICACION"))return 9000;
        return 0;
    }
    //Calcular Bonificacion
    double calcBonifi(){
        if(añoser<=7)
        return 0.05* calcularSuelBa();//5% menor o igual a 7 
        else 
        return 0.04* calcularSuelBa();//4% mayor a 7
    }
    
    //Calcular por movilidad
    double calcMovili(){
        switch(cargo){
            case "GERENTE": return 800;
            case "SUBGERENTE": return 600;
            default: return 0;
        }
    }
    
    //Sueldo final
    double calcSuelFina(){
        return (calcularSuelBa() + calcBonifi() + calcMovili());
    }
}
