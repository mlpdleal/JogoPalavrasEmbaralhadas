package regrasJogo;

public class JogoNormal extends Jogo{

	public JogoNormal() {
		super();
		vidas = 3;
		rodadas = 12;
	}

	@Override
	public void calcularPontuacao() {
		pontuacao += 700;
	}

}
