package com.mycompany.fecha.poo;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Complejidad temporal O(1)
        System.out.println("Ingrese el dia actual");
        int dia = sc.nextInt();
        System.out.println("Ingrese el mes actual.");
        int mes = sc.nextInt();
        System.out.println("Ingrese el año actual.");
        int año = sc.nextInt();

        Fecha date = new Fecha(dia, mes, año);

        String fechaFinal = date.fechaCorta();
        boolean validarFecha = date.validarFecha();
        String mesNumero = date.Fechanumero(mes);
        String fechaLarga = date.fechaLarga();

        System.out.println(fechaFinal);
        if (validarFecha) {
            System.out.println(fechaLarga);
        } else {
            System.out.println("Fecha no valida");
        }
        
        
    }

}
