package lab2;

public class RegistroResumos {

    private Resumo[] resumos;
    private int contadorResumos = 0;
    private int totalResumos = 0;

    public RegistroResumos(int numeroDeResumos) {
        this.resumos = new Resumo[numeroDeResumos];
    }

    public void adiciona(String tema, String conteudo) {
        resumos[contadorResumos] = new Resumo(tema, conteudo);
        contadorResumos += 1;
        totalResumos += 1;
        if (contadorResumos >= resumos.length) {
            contadorResumos = 0;
            totalResumos = resumos.length;
        }
    }

    public int conta(){
        return totalResumos;
    }

    public String[] pegaResumos() {
        String[] saida = new String[conta()];
        for (int contador = 0; contador < saida.length; contador++) {
            saida[contador] = resumos[contador].getResumo();
        }
        return saida;
    }
}

