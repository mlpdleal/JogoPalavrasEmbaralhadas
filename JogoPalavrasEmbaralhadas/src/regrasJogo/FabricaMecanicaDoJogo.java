package regrasJogo;

public class FabricaMecanicaDoJogo {
	
	private MecanicaDoJogo jogo;
	
	public MecanicaDoJogo selecionarDificuldade(int opcao) {
		switch (opcao) {
		case 1:
			jogo = new JogoFacil();
			return jogo;
		case 3:
			jogo = new JogoDificil();
			return jogo;
		default:
			jogo = new JogoNormal();
			return jogo;
		}
	}

	
}
