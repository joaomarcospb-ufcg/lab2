package lab2;

/**
 * Classe para acompanhar o tempo online dedicado a uma disciplina.
 *
 * @author João Marcos Paiva Batista
 */
public class RegistroTempoOnline {

    /**
     * Nome da disciplina.
     */
    private String nomeDisciplina;

    /**
     * Tempo online dedicado a disciplina.
     */
    private int tempoOnline;

    /**
     * Meta de tempo online a ser dedicado para a disciplina.
     */
    private int tempoOnlineEsperado;

    /**
     * Constrói de um registro de tempo online para uma disciplina, com o tempo padrão de 120 horas.
     *
     * @param nomeDisciplina o nome da disciplina
     */
    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnline = 0;
        this.tempoOnlineEsperado = 120;
    }

    /**
     * Construtor de um registro de tempo online para uma disciplina, onde o tempo online esperado pode ser escolhido.
     *
     * @param nomeDisciplina o nome da disciplina
     * @param tempoOnlineEsperado o tempo online esperado para a disciplina
     */
    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnline = 0;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }

    /**
     * Adiciona tempo online no registro.
     *
     * @param tempo tempo a ser adicionado (em um valor inteiro)
     */
    public void adicionaTempoOnline(int tempo) {
        this.tempoOnline += tempo;
    }

    /**
     * Verifica se foi atingido o tempo online esperado.
     *
     * @return true (se foi atingido) ou false (se não foi atingido).
     */
    public boolean atingiuMetaTempoOnline() {
        if (this.tempoOnline >= this.tempoOnlineEsperado) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Override do toString para retornar a representação desejada.
     *
     * @return A representação textual do registro de tempo online.
     */
    @Override
    public String toString() {
        return this.nomeDisciplina + " " + this.tempoOnline + "/" + this.tempoOnlineEsperado;
    }

}
