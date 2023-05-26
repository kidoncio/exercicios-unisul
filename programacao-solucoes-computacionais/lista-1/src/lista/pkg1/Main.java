/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista.pkg1;

import java.lang.reflect.Method;
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
        int numeroDoExercicio = Integer.parseInt(input);
        
        String className = "Exercicio" + numeroDoExercicio;

        try {
            Class<?> classe = Class.forName("lista.pkg1." + className);
            Method metodoMain = classe.getMethod("main", String[].class);

            String[] argumentos = {};

            metodoMain.invoke(null, (Object) argumentos);
        } catch (ClassNotFoundException e) {
            System.out.println("O exercício " + className + " não foi encontrado");
        } catch (Exception e) {
            System.out.println("Erro ao instanciar o exercício");
        }
    }

}
