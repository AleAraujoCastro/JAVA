package exercicio01;

public class Agenda {
	
	private String nomeAgenda;
	private Contato[] contatos;
	
	
	public Agenda() {
		
	}


	public String getNomeAgenda() {
		return nomeAgenda;
	}


	public void setNomeAgenda(String nomeAgenda) {
		this.nomeAgenda = nomeAgenda;
	}


	public Contato[] getContato() {
		return contatos;
	}


	public void setContato(Contato[] contato) {
		this.contatos = contato;
	}

	public String obterInfor() {
		String info = "Nome da Agenda: " + this.nomeAgenda + "\n" ;
		
		if(contatos != null) {
			for(Contato contatos : contatos) {
				info += contatos.mostrarInfo() + "\n";
			}
		}
		
		return info;
	}
	

}
