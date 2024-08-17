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
public class ejercicio3 {
    public static void main(String[] args) {
        //Programa que pide un No en pantalla y determina si este es negativo o positivo.
        Scanner sp = new Scanner(System.in);
        System.out.println("Ingresa tu numero");
        int num1 = sp.nextInt();
        if (num1 >= 0) {
            System.out.println("Es positivo");
        } else {
            System.out.println("Es negativo");
        }
    }
}
