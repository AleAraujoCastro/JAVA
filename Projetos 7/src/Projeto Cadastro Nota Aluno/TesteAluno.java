package exercicio03;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		Scanner teclado = new Scanner(System.in);

		
		System.out.println("Nome do Aluno: ");
		aluno.nome = teclado.nextLine();
		
		System.out.println("Número da Matrícula: ");
		aluno.matricula = teclado.nextInt();
		
		System.out.println("Nome do Curso: ");
		aluno.curso = teclado.next();
		
		System.out.println("Quais as Disciplinas: ");
		aluno.disciplinas[0] = teclado.next();
		aluno.disciplinas[1] = teclado.next();
		aluno.disciplinas[2] = teclado.next();
		
		System.out.println("Quais as notas das Disciplinas: ");
		aluno.notas[0] = teclado.nextDouble();
		aluno.notas[1] = teclado.nextDouble();
		aluno.notas[2] = teclado.nextDouble();
		
		System.out.println();
		
		aluno.mostrarDados();
		
		System.out.println();
		
		aluno.verificarAprovado();
	}
}
