/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author tinar
 */
public class Vendedor extends Funcionarios {

    private Map<String, Double> vendas;

    public Vendedor(String nome, String mes_Contratacao) {
        super(nome, "Vendedor", mes_Contratacao, 12000.00);
        this.vendas = new HashMap<>();
    }

    @Override
    public double calcularSalario(int mes, int ano) {
        Calendar cal = Calendar.getInstance();
        String aux = String.format("%02d/%04d", mes, ano);
        this.setMes_Contratacao(aux);
        aux = "";
        int anosDeServico = ano - cal.get(Calendar.YEAR);
        return this.getSalario() + (1800 * anosDeServico);
    }

    @Override
    public double calcularBeneficios(int mes, int ano) {
        return calcularSalario(mes, ano) * 0.3;
    }

    public double getVendasMes(int mes, int ano) {
        String mesAno = String.format("%02d/%04d", mes, ano);
        return vendas.getOrDefault(mesAno, 0.0);
    }

    public void registrarVenda(String mesAno, double valor) {
        vendas.put(mesAno, valor);
    }

    public void imprimirVedas() {

        if (!vendas.isEmpty()) {
            for (Map.Entry<String, Double> saida : vendas.entrySet()) {
                String mes = saida.getKey();
                double valor = saida.getValue();
                String nomeVendedor = this.getNome();
                System.out.printf("| %-10s| %-10s| %10.2f|\n", nomeVendedor, mes, valor);
            }
        }
        

    }

}
