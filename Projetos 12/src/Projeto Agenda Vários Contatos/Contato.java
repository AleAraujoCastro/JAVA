package exercicio01;

public class Contato {
	
	private static int contador = 0;
	
	private int id;
	private String nome;
	private String telefone;
	private String email;
	
	
	public Contato() {
		id = contador;
		contador++;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	@Override
	public String toString() {
		String s = "[" ; 
		s+= "ID: " + id + "\n";
		s+= "Nome: " + nome + "\n";
		s+= "Telefone: " + telefone + "\n";
		s+= "Email: " + email;
		s+= "] \n";
		
		return s;
	}
	

}
