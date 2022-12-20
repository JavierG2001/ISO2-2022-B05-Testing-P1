
package com.mycompany.problema1_testing;

import java.util.Calendar;
import java.util.GregorianCalendar;


/**
 *
 * @author Javier González
 * @author Laura Fernández
 */
public class Problema1 {
    
    private Calendar fecha;
    public Problema1(int anio,int mes, int dia){
        
        if(dia<0 || mes<0 || anio<0){
            throw new IllegalArgumentException("error en los argumentos, no se permiten nº negativos");
        }
        
        this.setFecha(new GregorianCalendar(anio,mes,dia));
               
    }
    
    public void setFecha(Calendar fecha){
        this.fecha = fecha;
    }
    
    public boolean es_bisiesto(){
        boolean bisiesto=false;
        
        
        int ultimasCifras = this.fecha.get(Calendar.YEAR) % 100;
        int anio = this.fecha.get(Calendar.YEAR);
        if(ultimasCifras % 4 == 0 && anio % 100 != 0)
            bisiesto = true;
        else if(ultimasCifras % 4 == 0 && anio % 100 == 0 && anio % 400 == 0)
            bisiesto = true;
        
        return bisiesto;
    }
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Problema1 p = new Problema1(2012,4,10);
        if(p.es_bisiesto()){
            System.out.println("es bisiesto");
        }else{
            System.out.println("NO es bisiesto");
        }
        
    }
    
}
