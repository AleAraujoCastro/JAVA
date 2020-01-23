package exercicio02;

public class Curso {
	
	private String nome;
	private String horario;
	private Professor professor;
	private Aluno[] aluno;
	
	public Curso() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Aluno[] getAluno() {
		return aluno;
	}

	public void setAluno(Aluno[] aluno) {
		this.aluno = aluno;
	}

	public String mostrarInfo() {
			String info = "Nome do Curso: " + nome + "\n" +
					"Horário: " + horario + "h\n";
			
			
			if(this.professor != null) {
				info += professor.monstrarInfo();
			}
			
			if (this.aluno != null) {
				System.out.println("------ Aluno ------");
				for(Aluno aluno : aluno) {
					if(aluno != null) {
						info += aluno.mostrarInfo();
						info += "\n";
					}
				}
				
				info += "\nMédia da Turma = " + mostrarMediaTurma();
			}
		return info;
	}
	
	public double mostrarMediaTurma() {
		double soma = 0;
		for(Aluno aluno : aluno) {
			if(aluno != null) {
				soma += aluno.mostrarMedia();
			}
		}
		
		return soma/aluno.length;
	}
	
	
}
