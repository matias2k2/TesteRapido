/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resolucao;

/**
 *
 * @author tinar
 */
public class Solucoes {
    
    public boolean isFibonacci(int num)
    {
        int a = 0, b = 1;

        do {
            if (a == num) {
                return true;
            }
            int temp = a;
            a = b;
            b = temp + b;
        } while (a <= num);

        return false;
    }
     //Caso 2
    public int countLestra(String str){
         int count =0;
         for(int i =0;i<str.length();i++){
            char c = str.charAt(i);
            if(c=='a'||c=='A'){
                count++;
            }
         }
         return count;
    }

    //Soma Calculo 
    public void SomaCalculo()
    {
        int INDICE = 12;
        int SOMA = 0;
        int K = 1;
    }
}
