package Arquivos.SwitchCase;

import java.util.Scanner;

public class AjusteSalario {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double salarioAtual;
        double salarioNovo;
        int codigo;

        System.out.println("Programa ajuste de Salário");

        System.out.println("Digite o seu salário atual");
        salarioAtual = scan.nextFloat();

        System.out.println("Digite o código do seu cargo");
        codigo = scan.nextInt();

        switch (codigo) {
            case 1001:
                salarioNovo = salarioAtual + (salarioAtual * 0.15);
                System.out.println("Seu antigo salário era " + salarioAtual);
                System.out.println("Seu novo salário  é" + salarioNovo);
                System.out.println("A diferença de salário é " + (salarioNovo - salarioAtual));
                break;

            case 1002:
                salarioNovo = salarioAtual + (salarioAtual * 0.3);
                System.out.println("Seu antigo salário era " + salarioAtual);
                System.out.println("Seu novo salário é " + salarioNovo);
                System.out.println("A diferença de salário é " + (salarioNovo - salarioAtual));
                break;

            case 1003:
                salarioNovo = salarioAtual + (salarioAtual * 0.2);
                System.out.println("Seu antigo salário era " + salarioAtual);
                System.out.println("Seu novo salário é " + salarioNovo);
                System.out.println("A diferença de salário é " + (salarioNovo - salarioAtual));
                break;

            case 1004:
                salarioNovo = salarioAtual + (salarioAtual * 0.25);
                System.out.println("Seu antigo salário era " + salarioAtual);
                System.out.println("Seu novo salário é " + salarioNovo);
                System.out.println("A diferença de salário é " + (salarioNovo - salarioAtual));
                break;

            case 1005:
                salarioNovo = salarioAtual + (salarioAtual * 0.18);
                System.out.println("Seu antigo salário era " + salarioAtual);
                System.out.println("Seu novo salário é " + salarioNovo);
                System.out.println("A diferença de salário é " + (salarioNovo - salarioAtual));
                break;

            case 1006:
                salarioNovo = salarioAtual + (salarioAtual * 0.23);
                System.out.println("Seu antigo salário era " + salarioAtual);
                System.out.println("Seu novo salário é " + salarioNovo);
                System.out.println("A diferença de salário é " + (salarioNovo - salarioAtual));
                break;

            case 1007:
                salarioNovo = salarioAtual + (salarioAtual * 0.3);
                System.out.println("Seu antigo salário era " + salarioAtual);
                System.out.println("Seu novo salário é " + salarioNovo);
                System.out.println("A diferença de salário é " + (salarioNovo - salarioAtual));
                break;

            case 1008:
                salarioNovo = salarioAtual + (salarioAtual * 0.40);
                System.out.println("Seu antigo salário era " + salarioAtual);
                System.out.println("Seu novo salário é " + salarioNovo);
                System.out.println("A diferença de salário é " + (salarioNovo - salarioAtual));
                break;
            default:
                System.out.println("Código inválido");
        }
    }
}

