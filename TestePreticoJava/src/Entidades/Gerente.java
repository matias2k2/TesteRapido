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
public class Gerente extends Funcionarios {

    public Gerente(String nome, String mes_Contratacao) {
        super(nome, "Gerente", mes_Contratacao, 20000.00);
    }

    @Override
    public double calcularSalario(int mes, int ano) {
        Calendar cal = Calendar.getInstance();
        String aux = String.format("%02d/%04d", mes, ano);
        this.setMes_Contratacao(aux);
        aux="";
        int anosDeServico = ano - cal.get(Calendar.YEAR);
        return this.getSalario() + (3000 * anosDeServico);
    }

    @Override
    public double calcularBeneficios(int mes, int ano) {
        return 0;
    }

}
