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
public class Es01 {

    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);

        //ENTRADA
        System.out.print("Qual teu nome? ");
        String Nome = NN.next();

        //Processamento & Saída
        if (Nome != null) {
            System.out.println("Olá, " + Nome);
        } else {
            System.out.println("Olá, mundo!");
        }

    }
}
