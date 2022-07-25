import br.com.dio.desafio.domain.*;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args){

        /*
        * Cria um curso e uma mentoria como conteúdos para o bootcamp criado abaixo.
        * */

        Curso curso = new Curso();

        curso.setTitulo("Curso JavaScript");
        curso.setCargaHoraria(12);
        curso.setDescricao("Curso de JavaScript Básico");

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria de ExpressJS");
        mentoria.setDescricao("Mentoria de ExpressJS.");
        mentoria.setData(LocalDate.now());

        /*
        * Cria um bootcamp para ser utilizado de exemplo.
        * */

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("NodeJS FullStack Experience");
        bootcamp.setDescricao("Se torne um desenvolvedor FullStack utilizando as tecnologias NodeJS e AngularJS.");

        Set<Conteudo> conteudosBootcamp = new LinkedHashSet<>();
        conteudosBootcamp.add(curso);
        conteudosBootcamp.add(mentoria);

        bootcamp.setConteudos(conteudosBootcamp);

        /*
        * Cria um desenvolvedor e o inscreve no bootcamp.
        * */

        Dev dev = new Dev();

        dev.setNome("John Doe");
        dev.inscreverBootcamp(bootcamp);

        // Progride o desenvolvedor nos dois conteúdos.
        dev.progredir();
        dev.progredir();

        // Calcula o total de XP;
        dev.calcularTotalXp();

        /*
        * Printa todas as entidades criadas no projeto.
        * */

        // Conteudos:
        System.out.println(curso);
        System.out.println(mentoria);

        // Bootcamp:
        System.out.println(bootcamp);

        // Dev inscrito:
        System.out.println(dev);
    }
}
