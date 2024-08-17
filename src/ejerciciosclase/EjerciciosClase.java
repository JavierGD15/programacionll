/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosclase;

import java.util.Scanner;

public class EjerciciosClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        System.out.println("Ingresa tu cadena");
        String cadena = sp.nextLine();
        int cantidadA = 0;
        int cantidadE = 0;
        int cantidadI = 0;
        int cantidadO = 0;
        int cantidadU = 0;

        for (int i = 0; i < cadena.length(); i++) {
            switch (cadena.charAt(i)) {
                case 'a':
                    cantidadA++;
                    break;
                case 'e':
                    cantidadE++;
                    break;
                case 'i':
                    cantidadI++;
                    break;
                case 'o':
                    cantidadO++;
                    break;
                case 'u':
                    cantidadU++;
                    break;
            }
        }
        System.out.println("Total: ");
        System.out.println("A "+ cantidadA);
        System.out.println("E "+ cantidadE);
        System.out.println("I "+ cantidadI);
        System.out.println("O "+ cantidadO);
        System.out.println("U "+ cantidadU);
    }
}
