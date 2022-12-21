package ISOFT2_B05.Pr1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Problema1 {
    
    private Calendar fecha;
    public Problema1(int anio,int mes, int dia){
        
        this.setFecha(anio,mes,dia);
               
    }
    
    public void setFecha(int anio,int mes, int dia){
        if(dia<0 || mes<0 || anio<0){
            throw new IllegalArgumentException("error en los argumentos, no se permiten nº negativos");
        }
        this.fecha = new GregorianCalendar(anio,mes,dia);
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
}