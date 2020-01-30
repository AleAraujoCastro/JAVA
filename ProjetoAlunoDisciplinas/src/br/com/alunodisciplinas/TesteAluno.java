package br.com.alunodisciplinas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class TesteAluno {

	
public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<>();
		
		for(int qtd = 1; qtd <= 2; qtd++) {
		
		Aluno aluno1 = new Aluno();
		
		
		
		String nome = JOptionPane.showInputDialog("Qual o nome do Aluno " + qtd + ":");
		/*String idade = JOptionPane.showInputDialog("Qual a idade: ");
		String dataNasc = JOptionPane.showInputDialog("Data de Nascimento: ");
		String rg = JOptionPane.showInputDialog("Registro Geral: ");
		String cpf = JOptionPane.showInputDialog("CPF: ");
		String nomeMae = JOptionPane.showInputDialog("Nome da Mãe: ");
		String nomePai = JOptionPane.showInputDialog("Nome da Pai: ");
		String dataMatricula = JOptionPane.showInputDialog("Data da Matrícula: ");
		String nomeEscola = JOptionPane.showInputDialog("Nome da Escola: ");
		String serieMatriculado = JOptionPane.showInputDialog("Série do Matriculado: ");*/
		
		
		for(int i=0; i<= 3; i++){
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina " + (i+1));
			String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina " + (i+1));
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina? ");
		
		
		if(escolha == 0) {
			String disciplinaRemover = JOptionPane.showInputDialog("Remover disciplina 1, 2, 3 ou 4 ?");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - 1);
		}
		
		
		aluno1.setNome(nome);
		/*aluno1.setIdade(Integer.parseInt(idade));
		aluno1.setDataNascimento(dataNasc);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setSerieMatriculado(serieMatriculado);*/
		
		
		
		alunos.add(aluno1);
		}
		
		
		for (Aluno aluno : alunos) {
			
			if(aluno.getNome().equalsIgnoreCase("Claudio")) {
				alunos.remove(aluno);
				break;
			}
			
				System.out.println(aluno.toString());
				System.out.println("Média do Aluno: " + aluno.getMediaNota());
				System.out.println("Resultado: " + aluno.getAlunoAprovado2());
				System.out.println("--------------------------------------------------------------");
		
			}
		
		
		
		for (Aluno aluno : alunos) {
			System.out.println("Alunos que sobraram na Lista:");
			System.out.println(aluno.getNome());
			System.out.println("As matérias do Aluno são >>");
			
			for(Disciplina disciplina : aluno.getDisciplinas()) {
				System.out.println(disciplina.getDisciplina());
			}
			
		}
		
	}
	
	
}
