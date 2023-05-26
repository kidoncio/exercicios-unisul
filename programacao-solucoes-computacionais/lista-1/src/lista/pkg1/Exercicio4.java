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
public class Exercicio4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite um número inteiro:");
        int numero = Integer.parseInt(input);

        int digitoDezenas = (numero / 10) % 10;

        String mensagemFeedback = "O dígito das dezenas é: " + digitoDezenas;

        JOptionPane.showMessageDialog(null, mensagemFeedback);
    }
}
