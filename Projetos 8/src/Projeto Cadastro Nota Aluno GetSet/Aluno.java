package exercicio03;

public class Aluno {

	private String nome;
	private int matricula;
	private String curso;
	
	private String [] disciplinas;
	private double[] notas;

	
	public Aluno() {
		disciplinas = new String[3];
		notas = new double[3];
	}
	

	public Aluno(String nome, int matricula, String curso, String[] disciplinas, double[] notas) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.disciplinas = disciplinas;
		this.notas = notas;
	}
	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getMatricula() {
		return matricula;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	public String[] getDisciplinas() {
		return disciplinas;
	}


	public void setDisciplinas(String[] disciplinas) {
		this.disciplinas = disciplinas;
	}


	public double[] getNotas() {
		return notas;
	}


	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	
	public void  setNomeDisciplinaPos(String nomeDisciplina) {
		for(int i = 0; i<getNotas().length; i++) {
		this.disciplinas[i] = nomeDisciplina;
		
		}
	}
	
	public void  setNotasPos(double notasDisciplinas) {
		for(int i = 0; i<getNotas().length; i++) {
		this.notas[i] = notasDisciplinas;
		}
	}


	public void mostrarDados() {
		System.out.println("----- Aluno ------");
		System.out.println("Nome: " + getNome());
		System.out.println("Matricula: " + getMatricula());
		System.out.println("Curso: " + getCurso());
		System.out.println("Disciplina 1 : " + this.disciplinas[0] + " --- Nota = " + this.notas[0]);
		System.out.println("Disciplina 2 : " + this.disciplinas[1] + " --- Nota = " + this.notas[1]);
		System.out.println("Disciplina 3 : " + this.disciplinas[2] + " --- Nota = " + this.notas[2]);
			
	}

	public void verificarAprovado () {
		for(int i = 0; i<getNotas().length; i++) {
				if(getNotas()[i] >= 7) {
					System.out.println("Aluno APROVADO na Disciplina " + getDisciplinas()[i]);
					System.out.println("Nota: " + getNotas()[i]);
				}else {
					System.out.println("Aluno REPROVADO na Disciplina " + getDisciplinas()[i]);
					System.out.println("Nota: " + getNotas()[i]);
				}
		}
	}
	
	
	
}
