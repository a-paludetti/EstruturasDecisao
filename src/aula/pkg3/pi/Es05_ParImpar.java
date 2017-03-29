/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.pkg3.pi;

import java.util.Scanner;

/**
 *
 * @author aline.poliveira3
 */
public class Es05_ParImpar {

    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = NN.nextInt();

        if (numero % 2 == 0) {
            System.out.printf("%S é um número par,", numero);
        } else {
            System.out.printf("%S é um número impar", numero);
        }
    }
}
