package desafio_poo_dio.desafio;

import java.time.LocalDate;

import desafio_poo_dio.desafio.dominio.Bootcamp;
import desafio_poo_dio.desafio.dominio.Curso;
import desafio_poo_dio.desafio.dominio.Dev;
import desafio_poo_dio.desafio.dominio.Mentoria;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("java");
		curso1.setDescricao("curso java/poo");
		curso1.setCargaHororia(58);
		Curso curso2 = new Curso();
		curso2.setTitulo("javascript");
		curso2.setDescricao("curso javascript/nodeJs");
		curso2.setCargaHororia(45);

		Mentoria men = new Mentoria();
		men.setData(LocalDate.now());
		men.setTitulo("Mentoria java 1");
		men.setDescricao("Mentoria do curso java");

		Bootcamp boot = new Bootcamp();
		boot.setNome("Bootcamp Santander");
		boot.setDescricao("Descrição Bootcamp Java");
		boot.getConteudos().add(curso1);
		boot.getConteudos().add(curso2);
		boot.getConteudos().add(men);

		Dev devDiego = new Dev();
		devDiego.setNome("Diego");
		devDiego.inscreverBootcamp(boot);
		System.out.println("Conteúdos Inscritos Diego: ");
		devDiego.getConteudosInscritos().forEach(System.out::println);
		devDiego.progredir();
		devDiego.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos Diego: ");
		devDiego.getConteudosInscritos().forEach(System.out::println);
		System.out.println("Conteúdos Concluídos Diego: ");
		devDiego.getConteudosConcluidos().forEach(System.out::println);
		System.out.println("XP = " + devDiego.calcularTotalXp());
		System.out.println("---------");
		Dev devJoao = new Dev();
		devJoao.setNome("João");
		devJoao.inscreverBootcamp(boot);
		System.out.println("Conteúdos Inscritos João: ");
		devJoao.getConteudosInscritos().forEach(System.out::println);
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos João: ");
		devJoao.getConteudosInscritos().forEach(System.out::println);
		System.out.println("Conteúdos Concluídos João: ");
		devJoao.getConteudosConcluidos().forEach(System.out::println);
		System.out.println("XP = " + devJoao.calcularTotalXp());
		System.out.println("---------");
	}
}
