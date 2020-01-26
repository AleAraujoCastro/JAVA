package exercicio01;

public class ContatoNãoExisteException extends Exception {
	
	private String nomeContato;

	public ContatoNãoExisteException(String nomeContato) {
		this.nomeContato = nomeContato;
	}
	

	@Override
	public String getMessage() {
		return "Contato " + nomeContato + " não existe na agenda!";
	}

}
