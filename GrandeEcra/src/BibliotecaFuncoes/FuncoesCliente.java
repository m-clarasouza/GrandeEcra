package BibliotecaFuncoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.util.Scanner;

import static BibliotecaFuncoes.FuncoesBasicas.criarMatriz;
import static BibliotecaFuncoes.FuncoesBasicas.ficheiroMatriz;

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

    public static void consultarCartaz() throws FileNotFoundException {
        File consultarCartaz = new File("GrandeEcra/Files/GrandeEcra_Cartaz.txt");
        Scanner sc = new Scanner(consultarCartaz);

        System.out.println("========FILMES EM CARTAZ=========");

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            System.out.println(linha);
        }
    }

    public static void pesquisarFilmes() throws FileNotFoundException {
            String[][] matriz = ficheiroMatriz("GrandeEcra/Files/GrandeEcra_Filmes.csv");
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite o género que quer pesquisar:");
            String generoProcurado = sc.nextLine().trim();
            //.trim() remove espaços em branco no início e no fim do texto digitado(era o que falhava)

            // começa com false pq ñ sabemos o genero
            boolean encontrado = false;

            // i = 1 para saltar a primeira linha do cabeçalho
            for (int i = 1; i < matriz.length; i++) {
                if (matriz[i] == null || matriz[i].length < 8) { // a linha existe e tem pelo menos 8 colunas (0 a 7) para não dar erro
                    continue; //se a linha for nula ou tiver menos de 8 colunas, salta para a próxima linha
                }

                String titulo = matriz[i][1];
                String genero = matriz[i][2];
                String realizador = matriz[i][3];
                String ano = matriz[i][4];
                String duracao = matriz[i][5];
                String idadeMinima = matriz[i][6];
                String classificacao = matriz[i][7];

                if (genero.equalsIgnoreCase(generoProcurado)) {
                    System.out.println("- " + titulo + " | " + realizador + " | " + ano + " | " + duracao + " min | " + idadeMinima + "+ | " + classificacao);
                    encontrado = true; // marca que encontramos filmes correspondente
                }
            }

            // se o ciclo terminou e nenhum filme encontrado, avisa
            if (!encontrado) {
                System.out.println("Não foram encontrados filmes.");
            }
        }


    public static void mapaSala() {

    }

    public static void reservarBilhetes() {

    }

    public static void recomendarFilmes() {

    }

    public static void quiz() {

    }
}