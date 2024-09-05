/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author tinar
 */
public abstract class Funcionarios {

    protected String nome;
    protected String Cargo;
    protected String mes_Contratacao;
    protected double salario;

    //Getter e setter da nosssa classe
    public Funcionarios(String nome, String Cargo, String mes_Contratacao, double salario) {
        this.nome = nome;
        this.Cargo = Cargo;
        this.mes_Contratacao = mes_Contratacao;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getMes_Contratacao() {
        return mes_Contratacao;
    }

    public void setMes_Contratacao(String mes_Contratacao) {
        this.mes_Contratacao = mes_Contratacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double calcularSalario(int mes, int ano);

    public abstract double calcularBeneficios(int mes, int ano);

    @Override
    public String toString() {
        return  nome +"   " + Cargo +"   " +  mes_Contratacao  ;
    }
    
   
    

}
