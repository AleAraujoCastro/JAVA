package exercicio02;

public class TesteLivro {

	public static void main(String[] args) {
		
		Livro livro = new Livro();
		
		livro.nome = "S�tio do Pica Pau Amarelo";
		livro.autor = "Monteiro Lobato";
		livro.qtdPaginas = 320;
		livro.anoLancamento = 2019;
		livro.isbn = "S�o Paulo 237";
		
		System.out.println(livro.toString());

	}

}
