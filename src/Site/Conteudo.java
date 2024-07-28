package Site;

public abstract class Conteudo {
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    public Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

}
