package lab2;

import java.util.Arrays;

public class Disciplina {

    private String nomeDisciplina;
    private int horasDeEstudo;
    private double[] notas;
    private int[] pesos;

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasDeEstudo = 0;
        this.notas = new double[4];
        this.pesos = new int[] {1,1,1,1};
    }

    public Disciplina(String nomeDisciplina, int qntdNotas) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasDeEstudo = 0;
        this.notas = new double[qntdNotas];
        this.pesos = new int[qntdNotas];
    }

    public Disciplina(String nomeDisciplina, int qntdNotas, int[] pesos) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasDeEstudo = 0;
        this.notas = new double[qntdNotas];
        this.pesos = pesos;
    }

    public void cadastraHoras(int horas) {
        this.horasDeEstudo += horas;
    }

    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota - 1] = valorNota;
    }

    public boolean aprovado() {
        if(mediaArrayPesos(notas, pesos) >= 7) {
            return true;
        }
        return false;
    }

    public double mediaArray(double[] numeros) {
        double soma = 0.0;
        for (double num : numeros) {
            soma += num;
        }
        return soma/numeros.length;
    }

    public double mediaArrayPesos(double[] numeros, int[] pesos) {
        double soma = 0.0;
        double somaPesos = 0.0;
        for (int i = 0; i < numeros.length; i++) {
            if (pesos[i] == 0) {
                soma += numeros[i];
                somaPesos += 1;
            }
            else {
                soma += numeros[i] * pesos[i];
                somaPesos += pesos[i];
            }
        }
        return soma/somaPesos;
    }

    @Override
    public String toString() {
        return this.nomeDisciplina + " " + this.horasDeEstudo + " " + mediaArray(this.notas) + " " + Arrays.toString(notas);
    }
}