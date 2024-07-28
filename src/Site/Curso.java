package Site;

public class Curso extends Conteudo {
    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso(String titulo, String descricao, int cargaHoraria, Bootcamp bootcamp) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
        bootcamp.adicionarConteudo(this);
    }

    @Override
    public String toString() {
        return "Site.Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
