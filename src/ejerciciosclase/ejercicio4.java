/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosclase;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = sp.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = sp.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int num3 = sp.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("El número mayor es: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El número mayor es: " + num2);
        } else {
            System.out.println("El número mayor es: " + num3);
        }
    }
}