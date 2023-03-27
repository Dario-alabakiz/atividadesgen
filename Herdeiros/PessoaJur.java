package ExerciciosPOO;

public class PessoaJur extends Cliente{
	
	private String cnpj;

	public PessoaJur(String nome, String idade, String endereço, String peso, String telefone, String cnpj) {
		super(nome, idade, endereço, peso, telefone);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("CNPJ: "+this.cnpj);
	}
	

}
