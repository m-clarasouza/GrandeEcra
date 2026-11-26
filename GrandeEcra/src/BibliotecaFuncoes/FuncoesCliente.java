package BibliotecaFuncoes;

import java.io.File;
import java.util.Scanner;

public class FuncoesCliente {

    public static void novoRegistro() {
        Scanner input = new Scanner(System.in);

        System.out.println("NOVO REGISTRO - GRANDE ECRÃ");
        System.out.print(">Nome: ");
        String nome = input.nextLine();

        System.out.print(">Contacto: ");
        int contacto = input.nextInt();
        input.nextLine(); //limpeza

        System.out.print(">Email: ");
        String email = input.nextLine();

        System.out.println("Cliente inserido com sucesso! ;)");
        System.out.println("\nNome: " + nome);
        System.out.println("Contacto: " + contacto);
        System.out.println("Email: " + email);
    }

    public static void consultarCartaz(){

    }

    public static void pesquisarFilmes(){

    }

    public static void mapaSala(){

    }

    public static void reservarBilhetes(){

    }

    public static void recomendarFilmes(){

    }

    public static void quiz(){

    }

}