package CadastroDeLivros;

public class Autor {

	String nome;
	String email;
	String cpf;
		
	Autor(){		
	}
		
	Autor(String nome, String email, String cpf) {
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
	}
		
	//metodo
	void mostrarDetalhes() {
		System.out.println("--> Detalhes do autor");
		System.out.println("Nome: " + nome);
		System.out.println("Email: " + email);
		System.out.println("CPF: " + cpf);
	
	}
}
