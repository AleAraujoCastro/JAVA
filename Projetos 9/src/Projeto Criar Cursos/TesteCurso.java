package exercicio02;

import java.util.Scanner;

public class TesteCurso {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Curso curso = new Curso();
		
		
		System.out.println("Entre com o nome do Curso: ");
		curso.setNome(scan.nextLine());
		
		System.out.println("Entre com o Horário do curso: ");
		curso.setHorario(scan.nextLine());
		
		Professor prof = new Professor();
		
		System.out.println("Entre com o nome do Professor: ");
		prof.setNome(scan.nextLine());
		
		System.out.println("Entre com o Departamento do Professor: ");
		prof.setDepartamento(scan.nextLine());
		
		System.out.println("Entre com o email do Professor: ");
		prof.setEmail(scan.nextLine());
		
		curso.setProfessor(prof);
		
		System.out.println("------- Alunos -------");
		
		Aluno[] alunos = new Aluno[5];
		
		
		for(int i = 0; i<5; i++){
		
			scan.nextLine();
			
		System.out.println("Entre com o nome do Aluno " + (i+1));
		String nomeAluno = scan.nextLine();
		
		
		System.out.println("Entre com o número da Matrícula: ");
		String matAluno = scan.nextLine();
		
		double[] notas = new double[4];
		
		for(int j = 0; j<4; j++){
			System.out.println("Entre com a nota " + (j+1));
			notas[j] = scan.nextDouble();
			}
		
			Aluno aluno = new Aluno();
			aluno.setNome(nomeAluno);
			aluno.setMatricula(matAluno);
			aluno.setNotas(notas);
			alunos[i] = aluno;
		}
			curso.setAluno(alunos);
			System.out.println(curso.mostrarInfo()); 
	}

}


