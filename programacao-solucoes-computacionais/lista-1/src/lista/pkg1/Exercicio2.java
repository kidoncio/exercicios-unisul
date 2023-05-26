/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class Exercicio2 {

     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Digite a primeira nota:");
        double nota1 = Double.parseDouble(input1);

        String input2 = JOptionPane.showInputDialog("Digite a segunda nota:");
        double nota2 = Double.parseDouble(input2);

        String input3 = JOptionPane.showInputDialog("Digite a terceira nota:");
        double nota3 = Double.parseDouble(input3);

        String input4 = JOptionPane.showInputDialog("Digite a quarta nota:");
        double nota4 = Double.parseDouble(input4);

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        String mensagemFeedback = "Média aritmética das 4 notas: " + media;

        JOptionPane.showMessageDialog(null, mensagemFeedback);
    }
}
