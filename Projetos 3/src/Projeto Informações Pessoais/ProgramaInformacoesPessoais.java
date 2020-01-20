package exercicio03;

import java.util.Scanner;

public class ProgramaInformacoesPessoais {

	public static void main(String[] args) {


		Scanner teclado = new Scanner(System.in);
		
		boolean infoValida = false;
		String nome ="";
		int idade = 0;
		double salario = 0;
		String sexo = "";
		String estadoCivil = "";
		
		do {
			System.out.println("Entre com seu nome: ");
			nome = teclado.nextLine();
		
		if(nome.length() >= 3) {
			infoValida = true;
		}else {
			System.out.println("Nome precisa no mínimo de 3 caracteres!");
		}		
		}while (!infoValida);
		
		infoValida = false;
		
		do {
			System.out.println("Entre com sua idade: ");
			idade = teclado.nextInt();
		
		if(idade >= 0 && idade <= 150) {
			infoValida = true;
		}else {
			System.out.println("Idade deve ser entre 0 e 150!");
		}
		
		}while(!infoValida);
		
		
		infoValida = false;
		
		do {
			System.out.println("Entre com seu salário: ");
			salario = teclado.nextDouble();
		
		if(salario > 0) {
			infoValida = true;
		}else {
			System.out.println("Salário deve ser maior que 0!");
		}
		
		}while(!infoValida);
		
		infoValida = false;
		
		do {			
			System.out.println("Entre com o gênero: ");
			sexo = teclado.nextLine();
		
		if(sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")) {
			infoValida = true;
		}else {
			System.out.println("O sexo deve ser masculino(m) ou feminino(f)!");
		}
		
		}while(!infoValida);
		

		infoValida = false;
		
		do {			
			System.out.println("Entre com seu Estado Civil: ");
			estadoCivil = teclado.nextLine();
		
		if(estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {
			infoValida = true;
			
		}else {
			System.out.println("O Estado Civil deve ser casado(c), solteiro(s), viúvo(v) ou divorciado(d))!");
		}
		
		}while(!infoValida);
		
		System.out.println("NOME: " + nome);
		System.out.println("IDADE: " + idade);
		System.out.println("SALÁRIO: " + salario);
		System.out.println("SEXO: " + sexo);
		System.out.println("ESTADO CIVIL: " + estadoCivil);

	}

}
