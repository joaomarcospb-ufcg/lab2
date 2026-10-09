package lab2;

import java.util.*;

/**
 * Classe para registrar e acompanhar os resumos registrados.
 *
 * @author João Marcos Paiva Batista
 */
public class RegistroResumos {

    /**
     * O array onde objetos da classe Resumo serão guardados.
     */
    private Resumo[] resumos;

    /**
     * Apontador para o resumo atual no Array de resumos.
     */
    private int contadorResumos = 0;

    /**
     * Quantidade total de resumos cadastrados (não acompanha mais o contador caso acabe o tamanho do array).
     */
    private int totalResumos = 0;

    /**
     * Constrói de um registro de resumos.
     *
     * @param numeroDeResumos a quantidade de resumos máxima do registro
     */
    public RegistroResumos(int numeroDeResumos) {
        this.resumos = new Resumo[numeroDeResumos];
    }

    /**
     * Adiciona um resumo ao registro de resumos.
     *
     * @param tema tema do resumo
     * @param conteudo conteudo do resumo
     */
    public void adiciona(String tema, String conteudo) {
        resumos[contadorResumos] = new Resumo(tema, conteudo);
        contadorResumos++;
        totalResumos++;
        if (contadorResumos >= resumos.length) {
            contadorResumos = 0;
            totalResumos = resumos.length;
        }
    }

    /**
     * Retorna a quantidade total de resumos cadastrados.
     *
     * @return Quantidade total de resumos cadastrados.
     */
    public int conta() {
        return totalResumos;
    }

    /**
     * Representa os resumos que já estão cadastrados.
     *
     * @return A representação textual dos resumos já cadastrados.
     */
    public String[] pegaResumos() {
        String[] temas = new String[conta()];
        for (int contador = 0; contador < temas.length; contador++) {
            temas[contador] = resumos[contador].toString();
        }
        return temas;
    }

    /**
     * Imprime quantos resumos estão cadastrados e seus respectivos temas.
     *
     * @return Quantidade de resumos cadastrados e seus temas.
     */
    public String imprimeResumos() {
        String saida = "- ";
        for (int i = 0; i < totalResumos; i++) {
            if (i == totalResumos - 1) {
                saida += resumos[i].getTema();
            } else {
                saida += resumos[i].getTema() + " | ";
            }
        }
        return "- " + totalResumos + " resumo(s) cadastrado(s)\n" + saida;
    }

    /**
     * Verifica se existe um resumo com o tema dado.
     *
     * @param tema o tema a ser buscado
     * @return true (se encontrado) ou false (se não encontrado).
     */
    public boolean temResumo(String tema) {
        for (int i = 0; i < totalResumos; i++) {
            if (resumos[i].getTema().equals(tema)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Faz uma busca insensitive-casing de uma string dentro do conteudo dos resumos.
     *
     * @param chaveDeBusca a string a ser buscada
     * @return Os temas onde a string foi encontrada.
     */
    public String[] busca(String chaveDeBusca) {
        int contadorBusca = 0;
        String temas = "";
        String chave = chaveDeBusca.toLowerCase();
        for (int i = 0; i < totalResumos; i++) {
            String conteudoTemp = resumos[i].getConteudo().toLowerCase();
            if (conteudoTemp.contains(chave)) {
                if (contadorBusca == 0) {
                    temas += resumos[i].getTema();
                } else {
                    temas += " " + resumos[i].getTema();
                }
                contadorBusca++;
            }
        }
        String[] temasBuscados = temas.split(" ");
        Arrays.sort(temasBuscados);
        return temasBuscados;
    }
}