package lab2;


/**
 * Classe para o acompanhamento das horas de descanso do aluno e para a exibição do status de descanso dele.
 *
 * @author João Marcos Paiva Batista
 */
    public class Descanso {

    /**
     * Horas de descanso totais.
     */
    private int horasDescanso;

    /**
     * Número de semanas totais.
     */
    private int numeroSemanas;

    /**
     * Constrói um objeto do tipo Descanso com padrão de 0 horas de descanso e 1 semana.
     */
    public Descanso() {
        this.horasDescanso = 0;
        this.numeroSemanas = 1;
    }

    /**
     * Define a quantidade de horas de descanso do objeto Descanso em questão.
     *
     * @param valor O total das horas de descanso
     */
    public void defineHorasDescanso(int valor) {
        this.horasDescanso = valor;

    }

    /**
     * Define a quantidade de semanas do objeto Descanso em questão.
     *
     * @param valor quantidade de semanas
     */
    public void defineNumeroSemanas(int valor) {
        this.numeroSemanas = valor;
    }

    /**
     * Analisa se o estudante está cansado ou não.
     *
     * @return String com o status do estudante (cansado ou descansado).
     */
    public String getStatusGeral() {
        if (this.horasDescanso / this.numeroSemanas < 26) {
            return "cansado";
        } else {
            return "descansado";
        }
    }
}