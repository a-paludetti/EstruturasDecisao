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
public class Es20_calculadora {

    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = Double.parseDouble(NN.nextLine());
        System.out.print("Digite o segundo número: ");
        double n2 = Double.parseDouble(NN.nextLine());

        double resultado = 0;

        System.out.println("Qual operação deseja?\n"
                + "A - soma,\n"
                + "B - subtração,\n"
                + "C - multiplicação,\n"
                + "D - Divisão");
        String operacao = NN.nextLine();

        switch (operacao.toUpperCase()) {
            case "A":
                resultado = n1 + n2;
                break;
            case "B":
                resultado = n1 - n2;
                break;
            case "C":
                resultado = n1 * n2;
                break;
            case "D":
                resultado = n1 / n2;
                break;
            default:
                System.out.println("operação não existe");
        }
        System.out.print(resultado);
    }
}
