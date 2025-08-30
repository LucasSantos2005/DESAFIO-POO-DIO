import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao do curso java");
        curso1.setCargaHoraria(10);


        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao do curso js");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
        */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("Descrição bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        devLucas.progredir();
        devLucas.progredir();
        devLucas.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Lucas" + devLucas.getConteudosInscritos());
        System.out.println("Conteudos concluidos Lucas" + devLucas.getConteudosConcluidos());
        System.out.println("Xp" + devLucas.calcularTotalXP());
        System.out.println("----------------------");

        Dev devIasmyn  = new Dev();
        devIasmyn.setNome("Iasmyn ");
        devIasmyn.inscreverBootcamp(bootcamp);
        devIasmyn.progredir();
        System.out.println("-");
        devIasmyn.progredir();
        System.out.println("Conteudos Inscritos Iasmyn" + devIasmyn .getConteudosInscritos());
        System.out.println("Conteudos concluidos Iasmyn" + devIasmyn.getConteudosConcluidos());
        System.out.println("Xp" + devIasmyn.calcularTotalXP());






    }
}
