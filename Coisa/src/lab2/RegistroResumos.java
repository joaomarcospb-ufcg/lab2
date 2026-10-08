package lab2;

import java.util.*;

public class RegistroResumos {

    private Resumo[] resumos;
    private int contadorResumos = 0;
    private int totalResumos = 0;

    public RegistroResumos(int numeroDeResumos) {
        this.resumos = new Resumo[numeroDeResumos];
    }

    public void adiciona(String tema, String conteudo) {
        resumos[contadorResumos] = new Resumo(tema, conteudo);
        contadorResumos++;
        totalResumos++;
        if (contadorResumos >= resumos.length) {
            contadorResumos = 0;
            totalResumos = resumos.length;
        }
    }

    public int conta() {
        return totalResumos;
    }

    public String[] pegaResumos() {
        String[] temas = new String[conta()];
        for (int contador = 0; contador < temas.length; contador++) {
            temas[contador] = resumos[contador].getResumo();
        }
        return temas;
    }

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

    public boolean temResumo(String tema) {
        for (int i = 0; i < totalResumos; i++) {
            if (resumos[i].getTema().equals(tema)) {
                return true;
            }
        }
        return false;
    }

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