

package ejerciciosclase;

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        // Escriba un programa que pida 3 números y determine cuál es el mediano
        Scanner sp = new Scanner(System.in);
        System.out.println("Ingresa tu primer numero");
        int num1 = sp.nextInt();
        System.out.println("Ingresa tu segundo numero");
        int num2 = sp.nextInt();
        System.out.println("Ingresa tu tercer numero");
        int num3 = sp.nextInt();

        int mediano;

        if ((num1 > num2 && num1 < num3) || (num1 > num3 && num1 < num2)) {
            mediano = num1;
        } else if ((num2 > num1 && num2 < num3) || (num2 > num3 && num2 < num1)) {
            mediano = num2;
        } else {
            mediano = num3;
        }

        System.out.println("El número mediano es: " + mediano);

        sp.close();
    }
}