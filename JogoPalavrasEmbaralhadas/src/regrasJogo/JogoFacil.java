package regrasJogo;

public class JogoFacil extends Jogo{
	
	public JogoFacil() {
		super();
	    vidas = 5;
	    rodadas = 10;
	}
	
	@Override
	public void calcularPontuacao() {
		pontuacao += 500;
	}


}
