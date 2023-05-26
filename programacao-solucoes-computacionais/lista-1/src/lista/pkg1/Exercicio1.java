/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite o valor do lado do quadrado: ");
        double lado = Double.parseDouble(input);

        double perimetro = lado * 4;
        double area = lado * lado;

        String mensagemFeedback = "Perímetro do quadrado: " + perimetro + "\n" + "Área do quadrado: " + area;

        JOptionPane.showMessageDialog(null, mensagemFeedback);
    }

}
