package Site;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria(String titulo, String descricao, Bootcamp bootcamp) {
        super(titulo, descricao);
        bootcamp.adicionarConteudo(this);
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Site.Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
