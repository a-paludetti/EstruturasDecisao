/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.pkg3.pi;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author aline.poliveira3
 */
public class Es21_dias_mes {

    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);

        String mes = JOptionPane.showInputDialog("Digite o mês");

        switch (mes) {
            case "1":
                JOptionPane.showMessageDialog(null, "O mês " + mes + " tem 31 dias.");
                break;
            case "2":
                JOptionPane.showMessageDialog(null, "O mês " + mes + " tem 28 dias.");
                break;
            case "3":
                JOptionPane.showMessageDialog(null, "O mês " + mes + " tem 31 dias.");
                break;
            case "4":
                JOptionPane.showMessageDialog(null, "O mês " + mes + " tem 30 dias.");
                break;
            case "5":
                JOptionPane.showMessageDialog(null, "O mês " + mes + " tem 31 dias.");
                break;
            case "7":
                JOptionPane.showMessageDialog(null, "O mês " + mes + " tem 31 dias.");
                break;
            case "8":
                JOptionPane.showMessageDialog(null, "O mês " + mes + " tem 31 dias.");
                break;
            case "10":
                JOptionPane.showMessageDialog(null, "O mês " + mes + " tem 31 dias.");
                break;
            case "12":
                JOptionPane.showMessageDialog(null, "O mês " + mes + " tem 31 dias.");
                break;
            case "6":
                JOptionPane.showMessageDialog(null, "O mês " + mes + " tem 30 dias.");
                break;
            case "9":
                JOptionPane.showMessageDialog(null, "O mês " + mes + " tem 30 dias.");
                break;
            case "11":
                JOptionPane.showMessageDialog(null, "O mês " + mes + " tem 30 dias.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Mês inexistente.");
                break;
        }
    }
}
