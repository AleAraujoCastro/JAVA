package exercicio01;

public class AgendaCheiaException extends Exception {
	
	
	@Override
	public String getMessage() {
		return "Agenda j� est� cheia! \n";
	}

}
