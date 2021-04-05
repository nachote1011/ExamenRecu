/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication64;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class JavaApplication64 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int num;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("di un numero");
            num = sc.nextInt();
            if (repe(numeros, num) == true) {
                numeros[i] = num;
            } else {
                System.out.println("Numero repetido");
            }

        }
        Arrays.sort(numeros);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    public static boolean repe(int[] numeros, int num) {
        boolean repetido = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == num) {
                repetido = true;
            }

        }
        return false;
    }

}
