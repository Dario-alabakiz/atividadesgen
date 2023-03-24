package ExerciciosPOO;

public class LojaDeGames {
	
	private String Jogos;
	private String Notebooks;
	private String Controles;
	private String VideoGame;
	private String Fones;
	
	public LojaDeGames(String jogos, String notebooks, String controles, String videoGame, String fones) {
		super();
		Jogos = jogos;
		Notebooks = notebooks;
		Controles = controles;
		VideoGame = videoGame;
		Fones = fones;
	}

	public String getJogos() {
		return Jogos;
	}

	public void setJogos(String jogos) {
		Jogos = jogos;
	}

	public String getNotebooks() {
		return Notebooks;
	}

	public void setNotebooks(String notebooks) {
		Notebooks = notebooks;
	}

	public String getControles() {
		return Controles;
	}

	public void setControles(String controles) {
		Controles = controles;
	}

	public String getVideoGame() {
		return VideoGame;
	}

	public void setVideoGame(String videoGame) {
		VideoGame = videoGame;
	}

	public String getFones() {
		return Fones;
	}

	public void setFones(String fones) {
		Fones = fones;
	}
	 public void imprimirInfo() {
     	System.out.println("O cliente pegou o jogo "+Jogos+", comprou um notebook da "+Notebooks+", um controle "
	 +Controles+", pegou tambem o video game "+VideoGame+" para jogar o jogo "+Jogos+" e um fone "+Fones+" para usar no Notebook e no video Game que ele comprou");
	
	
	
}
}