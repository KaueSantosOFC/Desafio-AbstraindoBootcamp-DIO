import Site.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Bootcamp bootcamp1 = new Bootcamp("Bootcamp Java Developer","Descrição Bootcamp Java Developer");

        Curso curso1 = new Curso("curso java","descrição curso java", 8, bootcamp1);
        Curso curso2 = new Curso("curso js","descrição curso js", 4, bootcamp1);

        Mentoria mentoria = new Mentoria("mentoria de java","descrição mentoria java", bootcamp1);
        mentoria.setData(LocalDate.now());

        Dev devCamila = new Dev("Camila");
        devCamila.inscreverBootcamp(bootcamp1);
        devCamila.getConteudosInscritos();
        devCamila.progredir();
        devCamila.progredir();
        devCamila.getConteudosInscritos();
        devCamila.getConteudosConcluidos();
        devCamila.calcularTotalXp();

        System.out.println("\n ||----Divisão----|| \n");

        Dev devJoao = new Dev("Joao");
        devJoao.inscreverBootcamp(bootcamp1);
        devJoao.getConteudosInscritos();
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        devJoao.getConteudosInscritos();
        devJoao.getConteudosConcluidos();
        devJoao.calcularTotalXp();

    }
}
