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
public class Es22_salario_planoCarreira {

    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);

        System.out.print("Nome do funcionario: ");
        String nome = NN.nextLine();
        System.out.print("Nível dentro da empresa: ");
        String nivel = NN.nextLine();
        System.out.print("Quantidade de horas trabalhadas: ");
        double horas = Double.parseDouble(NN.nextLine());

        double valorHora = 0;

        switch (nivel) {
            case "1":
                valorHora = 15.00;
                break;
            case "2":
                valorHora = 18.00;
                break;
            case "3":
                valorHora = 22.00;
                break;
            case "4":
                valorHora = 27.00;
                break;
            case "5":
                valorHora = 33.00;
                break;
            default:
                System.out.println("Nivel não existe.");
                break;
        }

        double valorSalario = horas * valorHora;

        System.out.printf("O funcionario %S trabalhou %.0f horas por R$%.2f a hora (nível %S) e deve receber R$%.2f ", nome, horas, valorHora, nivel, valorSalario);
        System.out.println("");
    }
}
