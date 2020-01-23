package exercicio03;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {
		
		
		Aluno aluno = new Aluno();
		
		Scanner teclado = new Scanner(System.in);

		
		System.out.println("Nome do Aluno: ");
		aluno.setNome(teclado.nextLine());
		
		System.out.println("Número da Matrícula: ");
		aluno.setMatricula(teclado.nextInt());
		
		System.out.println("Nome do Curso: ");
		aluno.setCurso(teclado.next());
		
		System.out.println("Quais as Disciplinas: ");
		aluno.setNomeDisciplinaPos(teclado.next());
		aluno.setNomeDisciplinaPos(teclado.next());
		aluno.setNomeDisciplinaPos(teclado.next());
		
		
		System.out.println("Quais as notas das Disciplinas: ");
		aluno.setNotasPos(teclado.nextDouble());
		aluno.setNotasPos(teclado.nextDouble());
		aluno.setNotasPos(teclado.nextDouble());
		
		System.out.println();
		
		aluno.mostrarDados();
		
		System.out.println();
		
		aluno.verificarAprovado();

	}

}
