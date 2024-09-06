/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package resolucao;

import java.util.Scanner;

/**
 *
 * @author tinar
 */
public class TesteMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Solucoes test = new Solucoes();

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = sc.nextInt();

        if (test.isFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }

        sc.nextLine();

        // Exercicio 2
        System.out.print("Informe uma string: ");
        String input = sc.nextLine();

        int count = test.countLestra(input);
        System.out.println("A letra 'a' aparece " + count + " vez(es) na string.");

        System.out.println("Rosolucao do caso 3");
        test.SomaCalculo();

        // Caso 4

        System.out.println("a) 1, 3, 5, 7, 9");

        System.out.println("b) 2, 4, 8, 16, 32, 64, 128");

        System.out.println("c) 0, 1, 4, 9, 16, 25, 36, 49");

        System.out.println("d) 4, 16, 36, 64, 100");

        System.out.println("e) 1, 1, 2, 3, 5, 8, 13");

        System.out.println("f) 2, 10, 12, 16, 17, 18, 19, 20");

    }

}
