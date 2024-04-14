package CadastroDeLivros;

public class Livro {
	//atributos
	String nome;
	String descricao;
	double valor;
	String isbn;
	Autor autor;
	
	//construtores
	Livro(){
		
	}
	
	Livro(String nome, String descricao, double valor, String isbn) {
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.isbn = isbn;
	}
	
	boolean temAutor() {
		return this.autor != null;
	}
	
	//metodo
	void mostrarDetalhes() {
		System.out.println("--> Detalhes do livro");
		System.out.println("Nome: " + nome);
		System.out.println("Descrição: " + descricao);
		System.out.println("Valor: " + valor);
		System.out.println("ISBN: " + isbn);
		
		if(this.temAutor()) {
			autor.mostrarDetalhes();
		}
		
		System.out.println("***");
	}
	
	public void aplicaDesconto(double porcentagem) {
		this.valor -= this.valor * porcentagem;
	}
}
