/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.problema1_testing;


/**
 *
 * @author usuario
 */
public class Problema1 {
    private int dia;
    private int mes;
    private int anio;
    
    public Problema1(int dia, int mes, int anio){
        
        if(dia<0 || mes<0 || anio<0){
            throw new IllegalArgumentException("error en los argumentos, no se permiten nº negativos"
                + " ni letras");
        }
        
        this.setDia(dia);
        this.setMes(mes);
        this.setAnio(anio);
        
        
    }
    
    public void es_bisiesto(){
        if(this.anio % 4 == 0){
            System.out.println("el año " + this.anio + " es bisiesto");
        }else{
            System.out.println("el año " + this.anio + " no es bisiesto");
        }
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Problema1 p = new Problema1(10,-6,2017);
        p.es_bisiesto();
        
    }
    
}
