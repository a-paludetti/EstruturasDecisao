/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.pkg3.pi;

import java.util.Scanner;

/**
 *
 * @author aline.poliveira3 21/02/2017
 */
public class Es01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Bhaskara as avesas (sp???)
        Scanner NN = new Scanner(System.in);
        //ENTRADAS
        System.out.print("X1: ");
        double x1 = NN.nextDouble();
        System.out.println("");
        System.out.print("X2: ");
        double x2 = NN.nextDouble();
        System.out.println("");
        System.out.print("C: ");
        double c = NN.nextDouble();
        System.out.println("");

        //PROCESSAMENTO
        double sum = x1 + x2;
        double pr = x1 * x2;
        double a = c / pr;
        double b = -(a * sum);

        //SAIDA
        System.out.printf("%.2fx² + %.2fx + %.2f = 0", a, b, c);
        System.out.println("");
    }

}
