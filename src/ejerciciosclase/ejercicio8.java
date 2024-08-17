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
public class ejercicio8 {

    //Escriba un programa que muestre la tabla de multiplicar de un número dado.
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        System.out.println("Ingresa tu tabla");
        int num1 = sp.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num1 + " * " + i + " = " + i * num1);
        }
    }
}
