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
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o nome do cliente:");

        String diaStr = JOptionPane.showInputDialog("Digite o dia da fatura:");
        int dia = Integer.parseInt(diaStr);

        String mesStr = JOptionPane.showInputDialog("Digite o mês da fatura:");
        int mes = Integer.parseInt(mesStr);

        String valorStr = JOptionPane.showInputDialog("Digite o valor da fatura:");
        double valor = Double.parseDouble(valorStr);

        String mensagemFeedback = "-------------------------\n"
                + "    Fatura Eletrônica    \n"
                + "-------------------------\n"
                + "Olá " + nome + ",\n"
                + "Sua fatura com vencimento " + dia + "/" + mes + " no valor de R$ " + valor + " está fechada\n"
                + "-------------------------\n";

        JOptionPane.showMessageDialog(null, mensagemFeedback);
    }
}
