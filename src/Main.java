import br.com.dio.desafio.br.dominio.Bootcamp;
import br.com.dio.desafio.br.dominio.Curso;
import br.com.dio.desafio.br.dominio.Dev;
import br.com.dio.desafio.br.dominio.Mentoria;

import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JS");
        curso2.setDescricao("descricao curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Camila"+ devCamila.getConteudosInscritos());
        System.out.println("---------");
        devCamila.progredir();
        devCamila.progredir();

        System.out.println("Conteúdos inscritos Camila"+ devCamila.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Camila"+ devCamila.getConteudosConcluidos());
        System.out.println("XP Camila "+ devCamila.calcularTotalXp());

        System.out.println("---------");


        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos João"+ devJoao.getConteudosInscritos());
        System.out.println("---------");
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();


        System.out.println("Conteúdos inscritos João"+ devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluídos João"+ devJoao.getConteudosConcluidos());
        System.out.println("XP João "+ devJoao.calcularTotalXp());



    }
}