/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rotaDoprograma;

import Entidades.Funcionarios;
import Entidades.Gerente;
import Entidades.Secretario;
import Entidades.Vendedor;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author tinar
 */
public class CorpoDoPrograma {

    Scanner in = new Scanner(System.in);

    public void main() {
        double num1 = 0.0;
        boolean estado = false;
        int opcao = 0, ops = 0, ops1 = 0, opcao1 = 0, mes = 0, ano = 0;
        String nome = "";
        String aux = "";
        List<Funcionarios> listFuncionarios = new ArrayList<>();

        while (!estado) {
            try {
                painelTeste();
                System.out.printf("Resposta ...: ");
                if (in.hasNextInt()) {
                    opcao = in.nextInt();
                } else {
                    throw new InputMismatchException("Entrada inválida. Por favor, insira um número.");
                }
                switch (opcao) {
                    case 1:
                        //Aqui estemos a escolher o tipo de usuario 
                        TipoDefuncionario();
                        System.out.printf("Resposta ...: ");
                        if (in.hasNextInt()) {
                            opcao1 = in.nextInt();
                        } else {
                            throw new InputMismatchException("Entrada inválida. Por favor, insira um número.");
                        }
                        switch (opcao1) {
                            case 1:
                                System.out.printf("Digite o seu nome ...: ");
                                in.nextLine();
                                nome = in.nextLine();

                                System.out.println("Informa mês/ano da contratação formato 00/0000 ");
                                System.out.printf("Mes ...: ");
                                mes = in.nextInt();

                                System.out.printf("Ano ...: ");
                                ano = in.nextInt();

                                aux = String.format("%02d/%04d", mes, ano);

                                listFuncionarios.add(new Secretario(nome, aux));
                                System.out.println("Funcionario Criado Como susseco");
                                aux = "";

                                break;
                            case 2:
                                System.out.printf("Digite o seu nome ...: ");
                                in.nextLine();
                                nome = in.nextLine();
                                System.out.println("Informa mês/ano da contratação formato 00/0000 ");
                                System.out.printf("Mes ...: ");
                                mes = in.nextInt();
                                System.out.printf("Ano ...: ");
                                ano = in.nextInt();
                                aux = String.format("%02d/%04d", mes, ano);

                                listFuncionarios.add(new Gerente(nome, aux));
                                System.out.println("Funcionario Criado Como susseco");
                                aux = "";

                                break;
                            case 3:

                                System.out.println("Digite o seu nome ...: ");
                                in.nextLine();
                                nome = in.nextLine();

                                System.out.println("Informa mês/ano da contratação formato 00/0000 ");
                                System.out.println("Mes ...: ");

                                mes = in.nextInt();

                                System.out.printf("Ano ...: ");
                                ano = in.nextInt();

                                aux = String.format("%02d/%04d", mes, ano);

                                listFuncionarios.add(new Vendedor(nome, aux));
                                System.out.println("Funcionario Criado Como susseco");
                                aux = "";

                                break;
                            default:
                                System.out.println("--- Opcao Invalida ---");
                        }

                        break;

                    case 2:

                        if (listFuncionarios.isEmpty()) {
                            System.out.println("--- Os funcionarios nao foram registado ");
                        } else {
                            System.out.println("");
                            System.out.println("1) Fazer consulas ");
                            System.out.println("2) Regista vendas ");
                            System.out.printf("Resposta ...: ");
                            if (in.hasNextInt()) {
                                ops = in.nextInt();
                            } else {
                                throw new InputMismatchException("Entrada inválida. Por favor, insira um número.");
                            }
                            switch (ops) {
                                case 1:
                                    OperacoDeconsulatas();
                                    if (in.hasNextInt()) {
                                        ops1 = in.nextInt();
                                    } else {
                                        throw new InputMismatchException("Entrada inválida. Por favor, insira um número.");
                                    }
                                    switch (ops1) {
                                        case 1:
                                            System.out.println("Informa mês/ano da contratação formato 00/0000 ");
                                            System.out.println("Mes ...: ");

                                            mes = in.nextInt();

                                            System.out.printf("Ano ...: ");
                                            ano = in.nextInt();

                                            double totalSalarios = calcularTotalSalarios(listFuncionarios, mes, ano);
                                            System.out.println("Total Salários: " + totalSalarios);
                                            break;
                                        case 2:
                                            System.out.println("Informa mês/ano da contratação formato 00/0000 ");
                                            System.out.println("Mes ...: ");

                                            mes = in.nextInt();

                                            System.out.printf("Ano ...: ");
                                            ano = in.nextInt();
                                            double totalPago = calcularTotalPago(listFuncionarios, mes, ano);
                                            System.out.println("Total Pago: " + totalPago);

                                            break;
                                        case 3:
                                            System.out.println("Informa mês/ano da contratação formato 00/0000 ");
                                            System.out.println("Mes ...: ");

                                            mes = in.nextInt();

                                            System.out.printf("Ano ...: ");
                                            ano = in.nextInt();
                                            double totalBeneficios = calcularTotalBeneficios(listFuncionarios, mes, ano);
                                            System.out.println("Total Benefícios: " + totalBeneficios);

                                            break;
                                        case 4:
                                            System.out.println("Informa mês/ano da contratação formato 00/0000 ");
                                            System.out.println("Mes ...: ");

                                            mes = in.nextInt();

                                            System.out.printf("Ano ...: ");
                                            ano = in.nextInt();
                                            Funcionarios maiorSalario = obterFuncionarioMaiorSalario(listFuncionarios, mes, ano);
                                            System.out.println("Funcionário com maior salário: " + maiorSalario.getNome());

                                            break;
                                        case 5:
                                            System.out.println("Informa mês/ano da contratação formato 00/0000 ");
                                            System.out.println("Mes ...: ");

                                            mes = in.nextInt();

                                            System.out.printf("Ano ...: ");
                                            ano = in.nextInt();

                                            // Funcionário com maior benefício
                                            Funcionarios maiorBeneficio = obterFuncionarioMaiorBeneficio(listFuncionarios, mes, ano);
                                            System.out.println("Funcionário com maior benefício: " + maiorBeneficio.getNome());

                                            break;
                                        case 6:
                                            System.out.println("Informa mês/ano da contratação formato 00/0000 ");
                                            System.out.println("Mes ...: ");

                                            mes = in.nextInt();

                                            System.out.printf("Ano ...: ");
                                            ano = in.nextInt();

                                            Vendedor maiorVendas = obterVendedorMaisVendeu(listFuncionarios, mes, ano);
                                            System.out.println("Vendedor que mais vendeu: " + maiorVendas.getNome());
                                            break;
                                        default:
                                            System.out.println("---- Opecao invalida ----");
                                    }

                                    break;
                                case 2:
                                    System.out.println("");
                                    in.nextLine();
                                    System.out.println("Digite o nome do vendedor: ");
                                    String nomeVendedor = in.nextLine();
                                    boolean vendedorEncontrado = false;

                                    for (Funcionarios f : listFuncionarios) {
                                        if (f instanceof Vendedor) {
                                            if (f.getNome().equalsIgnoreCase(nomeVendedor)) {
                                                vendedorEncontrado = true;
                                                System.out.println("Informe mês/ano da contratação no formato 00/0000");
                                                System.out.print("Mês ...: ");
                                                int mes1 = 0;
                                                int ano1 = 0;
                                                try {
                                                    mes = in.nextInt();
                                                    System.out.print("Ano ...: ");
                                                    ano = in.nextInt();
                                                    in.nextLine(); // Consumir a nova linha pendente
                                                } catch (Exception e) {
                                                    System.out.println("Entrada inválida. Por favor, insira números válidos para mês e ano.");
                                                    in.nextLine(); // Consumir a entrada inválida restante
                                                    continue; // Continue para a próxima iteração se a entrada for inválida
                                                }
                                                aux = String.format("%02d/%04d", mes, ano);
                                                System.out.println("Digite o valor: ");
                                                try {
                                                    num1 = in.nextDouble();
                                                    in.nextLine(); // Consumir a nova linha pendente
                                                } catch (Exception e) {
                                                    System.out.println("Entrada inválida. Por favor, insira um valor numérico válido.");
                                                    in.nextLine(); // Consumir a entrada inválida restante
                                                    continue; // Continue para a próxima iteração se a entrada for inválida
                                                }
                                                ((Vendedor) f).registrarVenda(aux, num1);
                                                aux = "";
                                                System.out.println("--- Venda registrada com sucesso ---");
                                                break; // Encerra o laço após encontrar e registrar a venda

                                            }
                                        }
                                    }
                                    if (!vendedorEncontrado) {
                                        System.out.println("Nenhum registro encontrado com o Nome ...: " + nomeVendedor);
                                    }
                                    

                                    break;

                                default:
                                    System.out.println("opecao invalida");
                            }

                        }

                        break;

                    case 3:
                        //Aqui estamo mortra a nossa lista de funcionario 
                        System.out.println("");
                        System.out.println("");
                        int var = 0;
                        System.out.println(" ---- imprimir ----- ");
                        ImprimirLista();
                        System.out.printf("Resposta ...: ");

                        var = in.nextInt();
                        switch (var) {
                            case 1:
                                if (listFuncionarios.isEmpty()) {
                                    System.out.println("Lista vazia ");
                                } else {
                                    System.out.println("Nome    Cargo  mes/ano da contratacao");
                                    for (Funcionarios lista : listFuncionarios) {
                                        System.out.println("" + lista);
                                    }
                                }
                                break;
                            case 2:
                                System.out.println("\n");

                                System.out.println("Lista de vendas ");
                                if (!listFuncionarios.isEmpty()) {
                                    System.out.println("| Vendedor  | Mes       | Valor     |");
                                    System.out.println("|-----------|-----------|-----------|");
                                    for (Funcionarios f : listFuncionarios) {
                                        if (f instanceof Vendedor) {
                                            ((Vendedor) f).imprimirVedas();
                                        }
                                    }
                                } else {
                                    System.out.printf(" Vazia ");
                                }

                                break;
                            default:
                                System.out.println(" --- Opecao invalida --- ");
                                break;
                        }
                        break;
                    case 4:
                        System.out.println("-- Obrigado e Volte sempre ---");
                        estado = true;
                        break;
                    default:
                        System.out.println("--- Opcao Invalida ---");
                }

            } catch (Exception e) {
                System.out.println("Ocorreu um erro no nosso programa: " + e.getMessage());
                in.next();
            }
            System.out.println("");
        }

        in.close();
    }

    public void painelTeste() {
        System.out.println("--- Seja bem Vindo ao Nosso Empresa --- ");
        System.out.println("1)-- Registar um funcionario  ");
        System.out.println("2)-- Opecao de consulas");
        System.out.println("3)-- Imprimir ");
        System.out.println("4)-- Sair do Programa ");
    }

    public void TipoDefuncionario() {
        System.out.println("1)--- Secretario");
        System.out.println("2)---- Gerente   ");
        System.out.println("3)---- Vendedor  ");
    }

    public void OperacoDeconsulatas() {
        System.out.println("1)--- Calcular o total de salario ");
        System.out.println("2)--- Calcular o total Pagamento ");
        System.out.println("3)--- Calcular o total de beneficio");
        System.out.println("4)--- Obeter o funcionario como Maior Salario ");
        System.out.println("5)--- obter Funcionario como  Maior Beneficio");
        System.out.println("6)--- obter Vendedor que Mais Vendeu");

    }

    public void ImprimirLista() {
        System.out.println("1)--- Imprimir Lista de funcionario");
        System.out.println("2)--- Imprimir Lista de vendas ");
    }

    public double calcularTotalPago(List<Funcionarios> funcionarios, int mes, int ano) {
        double total = 0;
        for (Funcionarios f : funcionarios) {
            total += f.calcularSalario(mes, ano) + f.calcularBeneficios(mes, ano);
        }
        return total;
    }

    public double calcularTotalSalarios(List<Funcionarios> funcionarios, int mes, int ano) {
        double total = 0;
        for (Funcionarios f : funcionarios) {
            total += f.calcularSalario(mes, ano);
        }
        return total;
    }

    public double calcularTotalBeneficios(List<Funcionarios> funcionarios, int mes, int ano) {
        double total = 0;
        for (Funcionarios f : funcionarios) {
            total += f.calcularBeneficios(mes, ano);
        }
        return total;
    }

    public Funcionarios obterFuncionarioMaiorBeneficio(List<Funcionarios> funcionarios, int mes, int ano) {
        Funcionarios maior = null;
        double maiorValor = Double.NEGATIVE_INFINITY;
        for (Funcionarios f : funcionarios) {
            if (f instanceof Funcionarios) {
                double beneficio = f.calcularBeneficios(mes, ano);
                if (beneficio > maiorValor) {
                    maiorValor = beneficio;
                    maior = f;
                }
            }

        }
        return maior;
    }

    public Vendedor obterVendedorMaisVendeu(List<Funcionarios> vendedores, int mes, int ano) {
        Vendedor maior = null;
        double maiorValor = Double.NEGATIVE_INFINITY;
        for (Funcionarios v : vendedores) {
            if (v instanceof Vendedor) {
                double vendas = ((Vendedor) v).getVendasMes(mes, ano);
                if (vendas > maiorValor) {
                    maiorValor = vendas;
                    maior = (Vendedor) v;
                }
            }

        }
        return maior;
    }

    public Funcionarios obterFuncionarioMaiorSalario(List<Funcionarios> funcionarios, int mes, int ano) {
        Funcionarios maior = null;
        double maiorValor = Double.NEGATIVE_INFINITY;
        for (Funcionarios f : funcionarios) {

            double total = f.calcularSalario(mes, ano) + f.calcularBeneficios(mes, ano);
            if (total > maiorValor) {
                maiorValor = total;
                maior = f;
            }
        }
        return maior;
    }

}
