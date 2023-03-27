package ExerciciosPOO;

public class TesteCliente {
extends
	public static void main(String[] args) {
		
		PessoaFis pf = new PessoaFis("Dario","18","Juscelino Kubtchek,3000","80","11993456403","96385274118","25.965.805-8");
		PessoaJur pj = new PessoaJur("Gabriely","17","Fortaleza","65","1193564578","09.562.487/0001-65");
		
		pf.visualizar();
		pj.visualizar();
	}

}
