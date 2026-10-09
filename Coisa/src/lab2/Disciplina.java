package lab2;

import java.util.Arrays;

/**
 * Classe para monitorar disciplinas, suas respectivas notas e status de aprovação ou reprovação.
 *
 * @author João Marcos Paiva Batista
 */
public class Disciplina {

    /**
     *Nome da disciplina.
     */
    private String nomeDisciplina;

    /**
     * Quantidade de horas de estudo na disciplina.
     */
    private int horasDeEstudo;

    /**
     * Notas na disciplina.
     */
    private double[] notas;

    /**
     * Pesos das notas na disciplina.
     */
    private int[] pesos;

    /**
     * Constrói um objeto do tipo Disciplina, com valor padrão para horas de estudo sendo 0, a quantidade de notas na
     * disciplina sendo 4 e os pesos das notas sendo todos 1.
     *
     * @param nomeDisciplina o nome da disciplina
     */
    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasDeEstudo = 0;
        this.notas = new double[4];
        this.pesos = new int[] {1,1,1,1};
    }

    /**
     * Constrói um objeto do tipo Disciplina, com valor padrão para horas de estudo sendo 0, podendo ser escolhido
     * o número de notas na disciplina.
     *
     * @param nomeDisciplina o nome da disciplina
     * @param qntdNotas a quantidade de notas da disciplina
     */
    public Disciplina(String nomeDisciplina, int qntdNotas) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasDeEstudo = 0;
        this.notas = new double[qntdNotas];
        this.pesos = new int[qntdNotas];
    }

    /**
     * Constrói um objeto do tipo Disciplina, com valor padrão para horas de estudo sendo 0, podendo ser escolhido
     * o número de notas na disciplina e os pesos dessas notas.
     *
     * @param nomeDisciplina O nome da disciplina
     * @param qntdNotas A quantidade de notas da disciplina
     * @param pesos Os pesos de cada nota
     */
    public Disciplina(String nomeDisciplina, int qntdNotas, int[] pesos) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasDeEstudo = 0;
        this.notas = new double[qntdNotas];
        this.pesos = pesos;
    }

    /**
     * Adiciona horas de estudo na disciplina.
     *
     * @param horas horas a adicionar
     */
    public void cadastraHoras(int horas) {
        this.horasDeEstudo += horas;
    }

    /**
     * Cadastra uma nota no array de notas.
     *
     * @param nota Posição da nota, com a primeira nota sendo na posição 1
     * @param valorNota Valor da nota
     */
    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota - 1] = valorNota;
    }

    /**
     * Verifica se o aluno atingiu a media de 7 na disciplina.
     *
     * @return O status do aluno na disciplina (aprovado ou reprovado).
     */
    public boolean aprovado() {
        if(mediaArrayPesos(notas, pesos) >= 7) {
            return true;
        }
        return false;
    }

    /**
     * Função de apoio para calcular a media das notas, levando em consideração os pesos delas (se os pesos não foram
     * passados no construtor, a função considera todas as notas tendo peso 1).
     *
     * @param notas o array de notas
     * @param pesos o array dos pesos das notas
     * @return A média ponderada.
     */
    private double mediaArrayPesos(double[] notas, int[] pesos) {
        double soma = 0.0;
        double somaPesos = 0.0;
        for (int i = 0; i < notas.length; i++) {
            if (pesos[i] == 0) {
                soma += notas[i];
                somaPesos += 1;
            }
            else {
                soma += notas[i] * pesos[i];
                somaPesos += pesos[i];
            }
        }
        return soma/somaPesos;
    }

    /**
     * Override do toString para retornar a saida desejada.
     *
     * @return A representação textual de um objeto da classe Disciplina.
     */
    @Override
    public String toString() {
        return this.nomeDisciplina + " " + this.horasDeEstudo + " " + mediaArrayPesos(this.notas, this.pesos) + " " + Arrays.toString(notas);
    }
}