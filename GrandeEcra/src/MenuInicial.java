import BibliotecaFuncoes.MenuAdmin;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static BibliotecaFuncoes.MenuAdmin.menuAdmin;
import static BibliotecaFuncoes.MenuCliente.menuCliente;

public class MenuInicial {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        int opcaoInicial;

        do {

            System.out.println("\n=========== MENU GRANDE ECRÃ ===========");
            System.out.println("Grandes histórias merecem um grande ecrã.");

            System.out.println("\n1 - ADMINISTRADOR");
            System.out.println("2 - CLIENTE");
            System.out.println("0 - SAIR");
            System.out.println("Opção: ");
            opcaoInicial = input.nextInt();

            switch (opcaoInicial){
                case 1:
                    menuAdmin();
                    //se selecionar adimin
                    //pedir senha
                    // abrir ficheiro
                    //buscar no csv - GrandeEcra_AdminLogin
                    //comparar se é igual
                    //então chamar função  menuAdmin()
                    break;
                    
                case 2:
                    menuCliente();
                    //se selecionar adimin
                    // exibir menuCliente()
                    break;

                case 0:
                    System.out.println("Até o próximo filme :)");
                    break;

                default:
                    System.out.println("\nOpção Inválida: " + opcaoInicial + "\n");
                    break;

            }

        }while (opcaoInicial != 0);

    }

}



