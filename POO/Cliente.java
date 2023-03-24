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

	public void imprimirInfo() {
     	System.out.println("O cliente chegou na academia e teve que passar seus dados, o seu nome é:"+nome+", tem a idade de: "+idade
     			+" mora no: "+endereço+" seu peso é de: "+peso+" e o seu telefone de contato é: "+telefone);
	 }

}