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
public class ejercicio1 {
    //Escriba un programa que pida la edad y despliegue "MAYOR DE EDAD" si la edad es mayor que 18

    public static void main(String[] args) {

        Scanner sp = new Scanner(System.in);
        int edad = sp.nextInt();

        if (edad >= 18) {
            System.out.println("MAYOR DE EDAD");
        }
    }

}
