import static org.junit.Assert.*;

import org.junit.Test;

import bancoPalavras.BancoDePalavras;
import embaralhar.FabricaEmbaralhadores;
import embaralhar.PalavraEmbaralhada;
import embaralhar.PalavraInversa;

public class TesteEmbaralhador {
		
	@Test
	public void testPalavraInversa() {
		BancoDePalavras bp = new BancoDePalavras();
		PalavraInversa pi = new PalavraInversa();
		String palavra = bp.recuperarPalavraAleatoria();
		palavra = pi.embaralharPalavra(palavra);
		palavra = pi.embaralharPalavra(palavra);
		assertTrue(bp.existePalavra(palavra));
	}
	
	@Test
	public void testPalavraEmbaralhada() {
		BancoDePalavras bp = new BancoDePalavras();
		PalavraEmbaralhada pe = new PalavraEmbaralhada();
		String palavra = bp.recuperarPalavraAleatoria();
		assertEquals(palavra.length(), pe.embaralharPalavra(palavra).length());
	}
	
	

}
