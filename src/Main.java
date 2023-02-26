import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso Introdução Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Angular");
        curso2.setDescricao("Curso Introdução Angular");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria do curso de Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp - Backend Banco Inter");
        bootcamp.setDescricao("Bootcamp de backend oferecido pelo Banco Inter usando linguagem Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println(devCamila.getNome() + " - Conteudos Inscritos: " + devCamila.getConteudosIncritos());
        System.out.println(devCamila.getNome() + " - XP: " + devCamila.calcularTotalXp());
        devCamila.progredir();
        System.out.println("----");
        System.out.println(devCamila.getNome() + " - Conteudos Inscritos: " + devCamila.getConteudosIncritos());
        System.out.println(devCamila.getNome() + " - Conteudos Concluidos: " + devCamila.getConteudosConcluidos());
        System.out.println(devCamila.getNome() + " - XP: " + devCamila.calcularTotalXp());

        System.out.println("--------------------------");
        Dev devRicardo = new Dev();
        devRicardo.setNome("Ricardo");
        devRicardo.inscreverBootcamp(bootcamp);
        System.out.println(devRicardo.getNome() + " - Conteudos Inscritos: " + devRicardo.getConteudosIncritos());
        System.out.println(devRicardo.getNome() + " - XP: " + devRicardo.calcularTotalXp());
        devRicardo.progredir();
        devRicardo.progredir();
        devRicardo.progredir();
        System.out.println("----");
        System.out.println(devRicardo.getNome() + " - Conteudos Inscritos: " + devRicardo.getConteudosIncritos());
        System.out.println(devRicardo.getNome() + " - Conteudos Concluidos: " + devRicardo.getConteudosConcluidos());
        System.out.println(devRicardo.getNome() + " - XP: " + devRicardo.calcularTotalXp());

    }
}