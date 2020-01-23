package exercicio02;

public class Livro {
	
	public String nome;
	public String autor;
	public int qtdPaginas;
	public int anoLancamento;
	public String isbn;
	
	
	@Override
	public String toString() {
		return "Livro [ nome = " + nome + ", autor = " + autor + ", qtdPaginas = " + qtdPaginas + ", anoLancamento = "
				+ anoLancamento + ", isbn = " + isbn + " ]";
	}
	
	

}
