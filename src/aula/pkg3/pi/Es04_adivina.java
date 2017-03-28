/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.pkg3.pi;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aline.poliveira3
 */
public class Es04_adivina {

    public static void main(String[] args) {
        // Escreva um algoritmo que sorteia um número entre 1 e 10 (inclusos)
        // e depois pede para o usuário tentar adivinhá-lo. Caso o número lido
        // seja igual ao sorteado, mostre a mensagem “Você acertou!”. 
        // Caso contrário, mostre a mensagem “Você errou!”.
        Scanner NN = new Scanner(System.in);

        //Entradas
        Random rng = new Random();
        int N = rng.nextInt(10) + 1;
        System.out.println(N);

        System.out.println("Adivinhe o número");
        int adv = Integer.parseInt(NN.nextLine()); //lê apenas a informação contida na linha.

//Processamentos e saída
        if (N == adv) {
            System.out.println("Número correto");
        } else {
            System.out.printf("Número incorreto, número correto é %S", N);
            System.out.println("");
        }
    }

}
