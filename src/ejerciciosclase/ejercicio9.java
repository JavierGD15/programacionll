/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosclase;

import java.util.Scanner;

/**
 *
 * @author javiergiron
 */
public class ejercicio9 {

    //Escribe un programa que lea n números y calcule su promedio.
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        int num1;
        int promedio = 0;
        int usos = 0;
        do {
            System.out.println("---------------------");
            System.out.println("| 1. Ingresar numero|");
            System.out.println("| 2. Salir y calcular|");
            System.out.println("---------------------");
            num1 = sp.nextInt();
            switch(num1){
                case 1:
                    System.out.println("Ingresa tu numero");
                    promedio += sp.nextInt();
                    usos++;
                    break;
                case 0: 
                    System.out.println("Su promedio es: "+ (promedio/usos));
                    break;
            }
        } while (num1 != 0);

    }
}
