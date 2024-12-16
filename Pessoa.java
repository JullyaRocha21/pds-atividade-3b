package atividade;

public class Pessoa {
	private String nome;
	private int idade;
	
	// Construtor 
	
	//Gett
	public String getNome() {
		return nome;
	}
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public int getIdade() {
	return idade;
	}
	
	// Método info
	public void exibirInfo() {
	System.out.println("nome:" + nome + "| idade:" + idade);
	}
}
