package lab2;

import java.util.Arrays;

public class Disciplina {

    private String nomeDisciplina;
    private int horasDeEstudo;
    private double[] notas;

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasDeEstudo = 0;
        this.notas = new double[4];
    }

    public void cadastraHoras(int horas) {
        this.horasDeEstudo += horas;
    }

    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota - 1] = valorNota;
    }

    public boolean aprovado() {
        if (mediaArray(notas) >= 7) {
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

    @Override
    public String toString() {
        return this.nomeDisciplina + " " + this.horasDeEstudo + " " + mediaArray(this.notas) + " " + Arrays.toString(notas);
    }
}
