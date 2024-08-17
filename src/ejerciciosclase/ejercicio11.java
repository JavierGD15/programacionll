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
public class ejercicio11 {

    public static void main(String[] args) {
        //Escriba un programa que pida una cadena de texto y cuente el número de vocales dentro de la cadena ingresada.
        char vocales[] = {'a', 'e', 'i', 'o', 'u'};
        int total = 0;
        Scanner sp = new Scanner(System.in);
        System.out.println("Ingresa tu texto");
        String palabra = sp.nextLine();
        
        for (int i = 0; i < palabra.length(); i++) {
            for (int j = 0; j < vocales.length; j++) {
                if (palabra.charAt(i) == vocales[j]) {
                    total++;
                }
            }
        }
        System.out.println("Su total de vocales son: "+total);
    }
}
