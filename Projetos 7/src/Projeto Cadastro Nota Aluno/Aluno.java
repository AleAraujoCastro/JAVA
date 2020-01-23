package exercicio03;

import java.util.Arrays;

public class Aluno {
	
	String nome;
	int matricula;
	String curso;
	
	String [] disciplinas = new String[3];
	double[] notas = new double[3];
	
	
	void mostrarDados() {
		System.out.println("----- Aluno ------");
		System.out.println("Nome: " + nome);
		System.out.println("Matricula: " + matricula);
		System.out.println("Curso: " + curso);
		System.out.println("Disciplina 1: " + disciplinas[0] + " --- Nota = " + notas[0]);
		System.out.println("Disciplina 2: " + disciplinas[1] + " --- Nota = " + notas[1]);
		System.out.println("Disciplina 3: " + disciplinas[2] + " --- Nota = " + notas[2]);
		
	}

	void verificarAprovado () {
		for(int i = 0; i<notas.length; i++) {
				if(notas[i] >= 7) {
					System.out.println("Aluno APROVADO na Disciplina " + disciplinas[i]);
					System.out.println("Nota: " + notas[i]);
				}else {
					System.out.println("Aluno REPROVADO na Disciplina " + disciplinas[i]);
					System.out.println("Nota: " + notas[i]);
				}
		}
	}
}
