package exercicio01;

public class Agenda extends Contato {
	
	private Contato[] contatos;
	
	
	public Agenda() {
		contatos = new Contato[5];
		
	}
	
	public void adicionarContato(Contato c) throws AgendaCheiaException{
		boolean cheia = true;
		for (int i=0; i<contatos.length; i++) {
			if(contatos[i] == null) {
				contatos[i] = c;
				System.out.println("Contato criado com Sucesso! \n");
				cheia = false;
				break; 
			}
		}
		if(cheia) {
			throw new AgendaCheiaException();
		}
		
	}
	
	
	public int ConsultarContatoPorNome(String nome) throws ContatoNãoExisteException {
		
		for (int i=0; i<contatos.length; i++){
			if(contatos[i] != null){
				if(contatos[i].getNome().equalsIgnoreCase(nome)){
					return i;
				}
			}
		}
		
		throw new ContatoNãoExisteException(nome);
	}
		
	
	@Override
	public String toString() {
		String s = "";
		for (Contato c : contatos) {
			if(c != null) {
				s += c.toString() + "\n";
			}
		}
		return s;
	}
	
}
