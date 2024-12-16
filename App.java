package atividade;
public class App {
    public static void main(String[] args) {
        // Criando uma instância de Pessoa para cada estuantes
        Pessoa pessoa = new Pessoa("Jullya Rocha da Costa Lima", 17);
        Pessoa pessoa1 = new Pessoa("Alice Dumaresq dos Santos", 19);

        // Exibindo as informações dos estudantes
        pessoa.exibirInfo();
        pessoa1.exibirInfo();
    }
}
