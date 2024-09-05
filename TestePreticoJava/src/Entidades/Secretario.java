/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Calendar;

/**
 *
 * @author tinar
 */
public class Secretario extends Funcionarios {

    public Secretario(String nome, String mes_Contratacao) {
        super(nome, "Secretário", mes_Contratacao, 7000.00);
    }

    @Override
    public double calcularSalario(int mes, int ano) {
        Calendar cal =  Calendar.getInstance();
        int anosDeServico = ano - cal.get(Calendar.YEAR);
        String aux = String.format("%02d/%04d", mes, ano);
        this.setMes_Contratacao(aux);
        aux="";
        return this.getSalario() + (1000 * anosDeServico);
    }

    @Override
    public double calcularBeneficios(int mes, int ano) {
      return calcularSalario(mes, ano)*0.2;
    }

   

}
