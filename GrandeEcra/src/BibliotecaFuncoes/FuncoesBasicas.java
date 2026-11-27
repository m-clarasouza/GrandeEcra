package BibliotecaFuncoes;

import java.io.*;
import java.util.Scanner;

public class FuncoesBasicas {

    private static int contarColunas(String caminho) throws FileNotFoundException {
        // carregar e ler o ficheiro
        File ficheiro = new File(caminho);
        Scanner sc = new Scanner(ficheiro);

        if (sc.hasNextLine()) { // se o ficheiro tiver linhas
            String primeiraLinha = sc.nextLine(); // a primeira linha vai ser lida
            String[] colunas = primeiraLinha.split(";"); // vamos "cortar" essa linha pelo delimitador das colunas, neste caso é o ponto e vírgula
            return colunas.length; // o comprimento do array é o número de colunas
        } else { // se o ficheiro tiver vazio devolve 0 (0 linhas)
            return 0;
        }
    }

    private static int contarLinhas(String caminho) throws FileNotFoundException {
        // carregar e ler o ficheiro
        File ficheiro = new File(caminho);
        Scanner sc = new Scanner(ficheiro);

        // começamos a contagem a 0
        int contagemLinhas = 0;

        // enquanto houver linhas no ficheiro, ele conta uma linha
        while (sc.hasNextLine()) {
            sc.nextLine();
            contagemLinhas++;
        }

        // o resultado é o número total das linhas
        return contagemLinhas;
    }

    public static String[][] criarMatriz(String caminhoFicheiro, String separador) throws FileNotFoundException {
        File ficheiro = new File(caminhoFicheiro);
        int totalLinhas = 0;
        int totalColunas = 0;
        try {
            // contar linhas e descobrir o número de colunas
            Scanner leitor = new Scanner(ficheiro);
            if (leitor.hasNextLine()) {
                String cabecalho = leitor.nextLine().trim();
                totalColunas = cabecalho.split(separador).length;
                while (leitor.hasNextLine()) {
                    String linha = leitor.nextLine();
                    if (!linha.isEmpty()) {
                        totalLinhas++;
                    }
                }
            }
            leitor.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static String[][] ficheiroMatriz(String caminho) throws FileNotFoundException {
        File ficheiro = new File(caminho);

        Scanner contar = new Scanner(ficheiro);
        int linhas = 0;
        int colunasMax = 0;

        while (contar.hasNextLine()) {
            String linha = contar.nextLine().trim();
            if (!linha.isEmpty()) {
                linhas++;
                String[] partes = linha.split(";");
                if (partes.length > colunasMax) {
                    colunasMax = partes.length;
                }
            }
        }
        contar.close();

        String[][] dados = new String[linhas][colunasMax];
        Scanner ler = new Scanner(ficheiro);
        int i = 0;

        while (ler.hasNextLine()) {
            String linha = ler.nextLine().trim();
            if (!linha.isEmpty()) {
                String[] partes = linha.split(";");
                for (int j = 0; j < partes.length; j++) {
                    dados[i][j] = partes[j].trim();
                }
                i++;
            }
        }
        ler.close();

        return dados;
    }

}
