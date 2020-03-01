package regrasJogo;

import bancoPalavras.BancoDePalavras;
import embaralhar.FabricaEmbaralhadores;

public class Jogo implements MecanicaDoJogo {

	protected BancoDePalavras bp;
	protected FabricaEmbaralhadores fb;
	protected int pontuacao;
	protected int vidas;
	protected int rodadas;
	
	public Jogo() {
		bp = new BancoDePalavras();
	    fb = new FabricaEmbaralhadores();
	}
	
	@Override
	public String mostraPalavra() {
		return fb.retornaEmbaralhamento().embaralharPalavra(bp.recuperarPalavraAleatoria());
	}
	
	@Override
	public void calcularPontuacao() {}

	@Override
	public void decrementarVida() {
		vidas -= 1;
	}

	@Override
	public void verificaResposta(String palavra) {
		if(!bp.existePalavra(palavra)) {
			decrementarVida();
		}else {
			calcularPontuacao();
		}
		decrementarRodada();

	}

	@Override
	public boolean encerraJogo() {
		if(vidas == 0) {
			return false;
		}else if(rodadas == 0){
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public int getPontuacao() {
		int pontuacao = this.pontuacao;
		return pontuacao;
	}

	@Override
	public int getVidas() {
		int vidas = this.vidas;
		return vidas;
	}
	
	@Override
	public int getRodadas() {
		int rodadas = this.rodadas;
		return rodadas;
	}

	@Override
	public void decrementarRodada() {
		rodadas -= 1;
	}

}
