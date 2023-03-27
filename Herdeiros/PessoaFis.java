package ExerciciosPOO;

public class PessoaFis extends Cliente {
	
	private String rg;
	private String cpf;
	public PessoaFis(String nome, String idade, String endereço, String peso, String telefone, String rg, String cpf) {
		super(nome, idade, endereço, peso, telefone);
		this.rg = rg;
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("CPF: "+this.cpf);
		System.out.println("RG: "+this.rg);
	}
	
	
}
