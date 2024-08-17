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
public class ejercicio10 {
    //Escriba un programa que pida 10 numeros, y que por ultimo despliegue el mayor.

    public static void main(String[] args) {
        int valor = 0;
        for (int i = 0; i < 10; i++) {
            Scanner sp = new Scanner(System.in);
            System.out.println("Ingresa tu numero");
            int num1 = sp.nextInt();
            if (num1> valor) {
                valor = num1;
            }
        }
        System.out.println("El valor mayor es: " + valor);

    }
}
