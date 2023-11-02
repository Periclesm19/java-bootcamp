import br.dio.desafio.dominio.Bootcamp;
import br.dio.desafio.dominio.Curso;
import br.dio.desafio.dominio.Dev;
import br.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javaScript");
        curso2.setDescricao("descrição curso javaScript");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de javaScript");
        mentoria.setDescricao("descrição mentoria javaScript");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev Pericles = new Dev();
        Pericles.setNome("Pericles");
        Pericles.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Pericles:" + Pericles.getConteudosInscritos());
        Pericles.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Pericles:" + Pericles.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Pericles:" + Pericles.getConteudosConcluidos());
        System.out.println("XP:" + Pericles.calcularTotalXp());

        System.out.println("-------");

        Dev Joao = new Dev();
        Joao.setNome("Joao");
        Joao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + Joao.getConteudosInscritos());
        Joao.progredir();
        Joao.progredir();
        Joao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + Joao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + Joao.getConteudosConcluidos());
        System.out.println("XP:" + Joao.calcularTotalXp());

    }

}
