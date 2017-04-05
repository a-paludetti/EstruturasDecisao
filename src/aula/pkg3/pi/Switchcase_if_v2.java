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
public class Switchcase_if_v2 {

    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);

        System.out.printf("Material é 'A', 'B', 'C' ou 'D' ");
        String material = NN.nextLine();

        System.out.printf("Temperatura ambiente: ");
        double temperatura = Double.parseDouble(NN.nextLine());
        boolean transporte = true;

        switch (material.toUpperCase()) {
            case "A":
                transporte = (temperatura <= 10 && temperatura >= 17);
                break;
            case "B":
                transporte = (temperatura <= 11 && temperatura >= 16);
                break;
            case "C":
                transporte = (temperatura <= 12 && temperatura>= 15);
                break;
            case "D":
                transporte = (temperatura <= 13 && temperatura >= 14);
                break;
            default:
                transporte = false;
        }

        if (transporte) {
            System.out.println("Pode transportar.");
        } else {
            System.out.println("Não pode transportar.");
        }
    }
}
