package com.mycompany.fecha.poo;
import java.util.HashMap;
public class Fecha {
      // TODO: Aquí va el código de la clase fechas

    //Complejidad temporal O(1)
    private int dia;
    private int mes;
    private int ano;
    
     //Complejidad temporal O(1)
    public Fecha(int dia, int mes, int ano) {  
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

    }
    
    // Complejidad temporal O(1)
    public String fechaCorta() { //Complejidad temporal O(1)
        String fc = dia + "/" + mes + "/" + ano;
        return fc;
    }
    
     // Complejidad temporal O(1)
    public boolean validarFecha() {
     
        
        
         if (mes==2){
          if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){ //Complejidad temporal O(1)
          return (dia > 0 && dia < 30 && mes == 2);
          }
        }
          else if (mes!=2){  
              return (dia > 0 && dia < 32 && mes < 12);
          
          }
        return false;
 }
   // Complejidad temporal O(1)
   public String Fechanumero(int Mes){
   HashMap<Integer, String> meses  = new HashMap<>();
    meses.put(1, "Enero");
        meses.put(2, "Febrero");
        meses.put(3, "Marzo");
        meses.put(4, "Abril");
        meses.put(5, "Mayo");
        meses.put(6, "Junio");
        meses.put(7, "Julio");
        meses.put(8, "Agosto");
        meses.put(9, "Septiembre");
        meses.put(10, "Octubre");
        meses.put(11, "Noviembre");
        meses.put(12, "Diciembre");
   
     return meses.get(Mes);
   }
   
   // Complejidad temporal O(1)
   public String fechaLarga(){
        return dia + " de " + this.Fechanumero(mes) + " de " + ano;
   }
}

