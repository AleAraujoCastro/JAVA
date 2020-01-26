package exercicio01;

public class ContatoN�oExisteException extends Exception {
	
	private String nomeContato;

	public ContatoN�oExisteException(String nomeContato) {
		this.nomeContato = nomeContato;
	}
	

	@Override
	public String getMessage() {
		return "Contato " + nomeContato + " n�o existe na agenda!";
	}

}
