package exemplo13;

import javax.swing.JOptionPane;

public class CalcularMediaNota {

	public static void main(String[] args) {
		
		
		String[] nota = new String[4];
		double[] dNotas = new double[4];
		double media = 0;
		
		for(int i=0; i<nota.length;i++) {
			nota[i] = JOptionPane.showInputDialog(null, "Informe a nota " + (i+1));
			dNotas[i] = Double.parseDouble(nota[i]);
			System.out.println(dNotas[i]);
			media += dNotas[i]/4; 
		}
		
		if(media >= 70) {
			JOptionPane.showMessageDialog(null, "Aluno Aprovado! Média: " + media);
		}else if(media < 70 && media >= 40){
			JOptionPane.showMessageDialog(null, "Aluno de Recuperação! Média: " + media);
		}else {
			JOptionPane.showMessageDialog(null, "Aluno Reprovado! Média: " + media);
		}

	}

}
