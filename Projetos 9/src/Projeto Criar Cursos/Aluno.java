package exercicio02;

public class Aluno {
	
	private String nome;
	private String matricula;
	private double[] notas;
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public double[] getNotas() {
		return notas;
	}


	public void setNotas(double[] notas) {
		this.notas = notas;
	}


	public String mostrarInfo() {
		 		String info = "Nome do Aluno: " + this.nome;
				info += " Matricula: " + this.matricula;
				info += " Notas: ";
				
				double soma = 0;
				for(double nota : notas) {
					soma += nota;
					info += nota + "   ";
				}
				
				double media = soma/4;
				info += "\n" + "Média = " + media + " - ";
				if(media >= 7) {
					System.out.println("Aluno APROVADO!" + "\n");
				}else {
					System.out.println("Aluno REPROVADO!" + "\n");
				}
				
				return info;
	}
				
	
				public double mostrarMedia() {
					double soma = 0;
					for(double nota : notas) {
						soma += nota;
					}
					return soma/4;
				}
				

}
