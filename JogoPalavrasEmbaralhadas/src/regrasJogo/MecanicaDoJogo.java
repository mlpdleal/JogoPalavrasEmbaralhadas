package regrasJogo;

public interface MecanicaDoJogo {
	
	public String mostraPalavra();
	public void calcularPontuacao();
	public void decrementarVida();
	public void verificaResposta(String palavra);
	public boolean encerraJogo();
	public int getPontuacao();
	public void decrementarRodada();
	public int getVidas();
	public int getRodadas();

}
