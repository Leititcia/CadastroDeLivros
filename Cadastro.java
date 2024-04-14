package CadastroDeLivros;

public class Cadastro {

	public static void main(String[] args) {
		
		Livro livro1 = new Livro ("Java 8 Prático",
									"Novos recursos da linguagem",
									59.90,
									"978-85-66250-46-6");

		Autor autor1 = new Autor ("Rodrigo Turini",
									"rodrigo.turini@caelum.com.br",
									"123.456.789-10");
		livro1.autor = autor1;
		
		Livro livro2 = new Livro ("Lógica de Programação",
								"Crie seus primeiros programas",
								59.90,
								"978-85-66250-22-0");
		
		Autor autor2 = new Autor ("Paulo Silveira",
								"paulo.silveira@caelum.com.br",
								"123.456.789-10");
		livro2.autor = autor2;
				
		livro1.mostrarDetalhes();
		livro2.mostrarDetalhes();
	}

}
