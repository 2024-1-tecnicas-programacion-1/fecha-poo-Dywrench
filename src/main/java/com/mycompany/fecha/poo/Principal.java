package com.mycompany.fecha.poo;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Complejidad temporal O(1)
        System.out.println("Ingrese el dia actual");
        int dia = sc.nextInt();
        // Complejidad temporal O(1)
        System.out.println("Ingrese el mes actual.");
        int mes = sc.nextInt();
        // Complejidad temporal O(1)
        System.out.println("Ingrese el año actual.");
        int año = sc.nextInt();
        
        // Complejidad temporal O(1)
        Fecha date = new Fecha(dia, mes, año);
        // Complejidad temporal O(1)
        String fechaFinal = date.fechaCorta();
        
        // Complejidad temporal O(1)
        boolean validarFecha = date.validarFecha();
        
        // Complejidad temporal O(1)
        String mesNumero = date.Fechanumero(mes);
        
        // Complejidad temporal O(1)
        String fechaLarga = date.fechaLarga();
        
        // Complejidad temporal O(1)
        System.out.println(fechaFinal);
        
        // Complejidad temporal O(1)
        if (validarFecha) {
            System.out.println(fechaLarga);
        } else {
            System.out.println("Fecha no valida");
        }
        
        
    }

}
