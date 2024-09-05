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
        sc.close();

        //Exercicio 2
        System.out.print("Informe uma string: ");
        String input = sc.nextLine();

        int count = test.countLestra(input);
        System.out.println("A letra 'a' aparece " + count + " vez(es) na string.");

    }
    
}
