package Site;

import java.util.*;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public Dev(String nome) {
        this.nome = nome;
    }

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.adicionarDevs(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public void calcularTotalXp() {
        double XP =conteudosConcluidos.stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
        System.out.println("Xp atual de " + getNome() + " é: " + XP);
    }

    public String getNome() {
        return nome;
    }

    public void getConteudosInscritos() {
        if (!conteudosInscritos.isEmpty()) {
            System.out.println("Conteúdos Inscritos do usuário:  " + getNome());
            System.out.println("<--------->");
            conteudosInscritos.stream().forEach(System.out::println);
            System.out.println("<--------->");
        }
        else {
            System.out.println("Não há nenhum conteúdo inscrito!");
        }

    }

    public void getConteudosConcluidos() {
        if (!conteudosConcluidos.isEmpty()) {
            System.out.println("Conteúdos Concluidos do usuário:  " + getNome());
            System.out.println("<--------->");
            conteudosConcluidos.stream().forEach(System.out::println);
            System.out.println("<--------->");
        }
        else {
            System.out.println("Não há nenhum conteúdo Concluido!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
