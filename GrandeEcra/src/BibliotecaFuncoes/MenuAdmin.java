package BibliotecaFuncoes;

import java.util.Scanner;

import static BibliotecaFuncoes.FuncoesAdmin.*;

public class MenuAdmin {
    public static void menuAdmin() {
        Scanner input = new Scanner(System.in);
        int opcaoAdmin=0;

        do {

            System.out.println("\n-=========== MENU ADMINISTRAÇÃO ===========");
            System.out.println("\n1. Consultar ficheiros");
            System.out.println("2. Estatisticas gerais de vendas");
            System.out.println("3. Receita por sala");
            System.out.println("4. Receita por filme");
            System.out.println("5. Top 3 filmes com maior receita");
            System.out.println("6. Resetar lotacao de uma sala");
            System.out.println("\n0. Voltar");

            System.out.println("\nOpção: ");
            opcaoAdmin=input.nextInt();

            switch (opcaoAdmin){

                case 1:
                    System.out.println("Consultar ficheiros");
                    consultarFicheiros();
                    break;

                case 2:
                    System.out.println("Estatisticas gerais de vendas");
                    estatVendas();
                    break;

                case 3:
                    System.out.println("Receita por sala");
                    receitaSala();
                    break;

                case 4:
                    System.out.println("Receita por filme");
                    receitaFilme();
                    break;

                case 5:
                    System.out.println("Top 3 filmes com maior receita");
                    topTresfilmesMaiorReceita();
                    break;

                case 6:
                    System.out.println();
                    resetarSala();
                    break;

                case 0:
                    System.out.println("\nVoltar\n");
                    break;

                default:
                    System.out.println("\nOpção inválida: " + opcaoAdmin + "\n");
            }

        }while (opcaoAdmin!=0);

    }
}

