package exemplo12;

import javax.swing.JOptionPane;

public class OpcaoDeConfirmacao {

	public static void main(String[] args) {
		
		
		String carros = JOptionPane.showInputDialog("Informe a quantidade de Carros");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de Pessoas");
		
		double carroNumero = Double.parseDouble(carros);
		double pessoasNumero = Double.parseDouble(pessoas);
		
		int divisao = (int)(carroNumero / pessoasNumero);
		int resto = (int)(carroNumero % pessoasNumero);
		
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão?");
		
		if(resposta == 0) {
			JOptionPane.showMessageDialog(null, "Carros: " + carros + "\n" + "Pessoas: " + pessoas + "\n" 
					+ "Resultado da Divisão: " + divisao);
			
			resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o RESTO da divisão?");
			
			if(resposta == 0) {
				JOptionPane.showMessageDialog(null, "Resto da Divisão: " + resto);
			}else if(resposta == 1) {
				JOptionPane.showMessageDialog(null, "Sem resultados do RESTO. Fim de execução!");
			}else {
				JOptionPane.showMessageDialog(null, "Operação Cancelada!");
			}
		}else if(resposta == 1) {
			JOptionPane.showMessageDialog(null, "Sem resultado da Divisão. Fim de execução!");
		}else {
			JOptionPane.showMessageDialog(null, "Operação Cancelada!");
		}
		
	}
}
