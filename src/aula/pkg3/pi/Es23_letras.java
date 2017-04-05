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
public class Es23_letras {

    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        String letra = NN.nextLine();
        boolean vogal = false;

        switch (letra.toUpperCase()) {
            case "A":
                vogal = true;
                break;
            case "E":
                vogal = true;
                break;
            case "I":
                vogal = true;
                break;
            case "O":
                vogal = true;
                break;
            case "U":
                vogal = true;
                break;
            default:
                vogal = false;
                break;
        }
        if (vogal) {
            System.out.printf("%S é uma vogal", letra);
        } else {
            System.out.printf("%S não é uma vogal", letra);
        }
    }
}
