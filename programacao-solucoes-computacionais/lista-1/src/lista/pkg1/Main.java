/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista.pkg1;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite o número do exercício desejado:");
        double numeroDoExercicio = Double.parseDouble(input);

        try {
            Process processo = Runtime.getRuntime().exec("java " + "./Exercicio" + numeroDoExercicio + ".java");
            int status = processo.waitFor();

            String mensagem;

            if (status == 0) {
                mensagem = "O arquivo Java foi executado com sucesso!";
            } else {
                mensagem = "O arquivo não foi executado corretamente";
            }

            System.out.println(mensagem);
        } catch (IOException e) {
            System.out.println("Erro ao executar o arquivo Java: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("A execução do arquivo Java foi interrompida: " + e.getMessage());
        }
    }

}
