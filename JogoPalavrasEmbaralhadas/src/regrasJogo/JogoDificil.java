package regrasJogo;

public class JogoDificil extends Jogo {

	public JogoDificil() {
		super();
		vidas = 1;
		rodadas = 15;
	}
	
	@Override
	public void calcularPontuacao() {
		pontuacao += 1000;
	}


}
