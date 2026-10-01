package lab2;

public class Resumo {

    private String tema;
    private String conteudo;

    public Resumo(String tema, String conteudo) {
        this.tema = tema;
        this.conteudo = conteudo;
    }

    private String getTema() {
        return this.tema;
    }

    private String getConteudo() {
        return this.conteudo;
    }

    private void setTema(String tema) {
        this.tema = tema;
    }

    private void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getResumo() {
        return this.tema + ": " + this.conteudo;
    }
}
