package ExerciciosPOO;

public class Cliente {
	 
	private String nome;
	private String idade;
	private String endereço;
	private String peso;
	private String telefone;

	 public Cliente(String nome, String idade, String endereço, String peso, String telefone) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.endereço = endereço;
		this.peso = peso;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void visualizar() {
		System.out.println("||****************************************||");
		System.out.println("||           DADOS DO CLIENTE             ||");
		System.out.println("||****************************************||");
		System.out.println("Nome: "+this.nome);
		System.out.println("Idade: "+this.idade);
		System.out.println("Endereço: "+this.endereço);
		System.out.println("Peso: "+this.peso);
		System.out.println("Telefone: "+this.telefone);
	}

}