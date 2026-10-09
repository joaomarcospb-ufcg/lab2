package lab2;

/**
 * Classe para criar um resumo, com um tema e conteúdo.
 *
 * @author João Marcos Paiva Batista
 */
public class Resumo {

    /**
     * Tema do resumo.
     */
    private String tema;

    /**
     * Conteúdo do resumo.
     */
    private String conteudo;

    /**
     * Constrói um resumo.
     *
     * @param tema tema do resumo
     * @param conteudo conteúdo do resumo
     */
    public Resumo(String tema, String conteudo) {
        this.tema = tema;
        this.conteudo = conteudo;
    }

    /**
     * Acessa o tema de um resumo.
     *
     * @return O tema do resumo.
     */
    public String getTema() {
        return this.tema;
    }

    /**
     * Acessa o conteúdo de um resumo.
     *
     * @return O conteúdo do resumo.
     */
    public String getConteudo() {
        return this.conteudo;
    }

    /**
     * Override do toString para retornar a representação desejada.
     *
     * @return A representação textual de um resumo.
     */
    @Override
    public String toString() {
        return this.tema + ": " + this.conteudo;
    }
}
