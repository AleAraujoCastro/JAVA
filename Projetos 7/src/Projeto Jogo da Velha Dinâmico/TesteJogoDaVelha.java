package exercicio04;

import java.util.Scanner;

public class TesteJogoDaVelha {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		JogoDaVelha jogo = new JogoDaVelha();
		
		System.out.println("Jogador 1 = X ");
		System.out.println("Jogador 1 = O ");
		
		boolean ganhou = false;
		char sinal;
		int linha = 0, coluna = 0;
		
		
			while(!ganhou) {
			
			if(jogo.vezJogador1()) { //Jogador 1
				System.out.println("Vez do Jogador 1. Escolha a linha e coluna (1-3): " );
				sinal = 'X';
			}else {
				System.out.println("Vez do Jogador 2. Escolha a linha e coluna (1-3): " );
				sinal = 'O';
				}
			
			linha = valor("Linha", teclado);
			coluna = valor("Coluna", teclado);
			
			if(!jogo.verificarJogadaValida(linha, coluna, sinal)) {
				System.out.println("Posição já usada, tente novamente!");
			}
			
			jogo.imprimirTabuleiro();
			
			if(jogo.verificarGanhador('X')) {
				ganhou = true;
				System.out.println("Parabéns... Jogador 1 Ganhou! ");
			}else if(jogo.verificarGanhador('O')) {
				ganhou = true;
				System.out.println("Parabéns... Jogador 2 Ganhou! ");
			} else if (jogo.jogada > 9) {
				ganhou = true;
				System.out.println("Ninguém Ganhou essa Partida, deu EMPATE!");
			}
			
			}
		}
			
		static int valor(String tipoValor, Scanner teclado) {
			int valores = 0;
			boolean valorValido = false;
			while(!valorValido) {
				System.out.println("Entre com a " + tipoValor + "  (linha 1, 2 ou 3): ");
				valores = teclado.nextInt();
				if(valores >= 1 && valores <= 3) {
					valorValido = true;
				}else {
					System.out.println("Entrada Inválida, tente novamente!");
				}
			} valores--;
			return valores;

	}

}
