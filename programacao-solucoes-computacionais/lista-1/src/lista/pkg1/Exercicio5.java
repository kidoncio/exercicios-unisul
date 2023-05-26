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
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite o valor em segundos:");
        int segundos = Integer.parseInt(input);

        int dias = segundos / (24 * 3600);
        segundos %= (24 * 3600);

        int horas = segundos / 3600;
        segundos %= 3600;

        int minutos = segundos / 60;
        segundos %= 60;

        String mensagemFeedback = "Dias: " + dias + "\n"
                + "Horas: " + horas + "\n"
                + "Minutos: " + minutos + "\n"
                + "Segundos: " + segundos;

        JOptionPane.showMessageDialog(null, mensagemFeedback);
    }
}
