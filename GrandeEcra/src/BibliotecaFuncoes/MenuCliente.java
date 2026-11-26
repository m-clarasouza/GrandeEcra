package BibliotecaFuncoes;

import java.util.Scanner;

import static BibliotecaFuncoes.FuncoesCliente.*;

public class MenuCliente {
    public static void menuCliente() {
        Scanner input = new Scanner(System.in);
        int opcaoCliente=0;

        do {

            System.out.println("\n-=========== MENU CLIENTE ===========");
            System.out.println("Seja bem-vindo!!!\nPara continuar, selecione uma das opções a seguir:");
            System.out.println("\n1. Novo registro");
            System.out.println("2. Consultar cartaz cinematografico");
            System.out.println("3. Pesquisar filmes");
            System.out.println("4. Visualizar mapa de uma sala");
            System.out.println("5. Reservar bilhetes");
            System.out.println("6. Recomendar filmes");
            System.out.println("7. Quiz cinematografico");
            System.out.println("\n0. Voltar");

            System.out.println("\nOpção: ");
            opcaoCliente=input.nextInt();


            switch (opcaoCliente){

                case 1:
                    System.out.println("Novo registro");
                    novoRegistro();
                    break;

                case 2:
                    System.out.println("Consultar cartaz cinematografico");
                    consultarCartaz();
                    break;

                case 3:
                    System.out.println("Pesquisar filmes");
                    pesquisarFilmes();
                    break;

                case 4:
                    System.out.println("Visualizar mapa de uma sala");
                    mapaSala();
                    break;

                case 5:
                    System.out.println("Reservar bilhetes");
                    reservarBilhetes();
                    break;

                case 6:
                    System.out.println("Recomendar filmes");
                    recomendarFilmes();
                    break;

                case 7:
                    System.out.println("Quiz cinematografico");
                    quiz();
                    break;

                case 0:
                    System.out.println("\nVoltar\n");
                    break;

                default:
                    System.out.println("\nOpção inválida: " + opcaoCliente + "\n");
            }

        }while (opcaoCliente!=0);

    }
}

