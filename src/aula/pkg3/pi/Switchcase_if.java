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
public class Switchcase_if {

    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);

        System.out.printf("Material é 'A', 'B', 'C' ou 'D' ");
        String material = NN.nextLine();

        System.out.printf("Temperatura ambiente: ");
        int temperatura = Integer.parseInt(NN.nextLine());

        switch (material) {
            case "A":
                if (temperatura >= 10 && temperatura <= 17) {
                    System.out.println("Material A pode ser transportado");
                } else {
                    System.out.println("Temperatura fora dos limites de segurança para transporte");
                }
                break;
            case "B":
                if (temperatura >= 11 && temperatura <= 16) {
                    System.out.println("Material B pode ser transportado");
                } else {
                    System.out.println("Temperatura fora dos limites de segurança para transporte");
                }
                break;
            case "C":
                if (temperatura >= 12 && temperatura <= 15) {
                    System.out.println("Material C pode ser transportado");
                } else {
                    System.out.println("Temperatura fora dos limites de segurança para transporte");
                }
                break;
            case "D":
                if (temperatura >= 13 && temperatura <= 14) {
                    System.out.println("Material D pode ser transportado");
                } else {
                    System.out.println("Temperatura fora dos limites de segurança para transporte");
                }
                break;
        }
    }
}
