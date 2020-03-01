package bancoPalavras;
import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.util.Random;

public class BancoDePalavras {
	
	private String palavra;

	private String recuperarConteudoArquivo() {
		String conteudo = "";
		String filePath = new File("bancoPalavras/bancoPalavras.txt").getAbsolutePath();
		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
	        conteudo = br.readLine();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conteudo;
	}
	
	private String[] separarPalavras() {
		return recuperarConteudoArquivo().split(";");
	}
	
	public String recuperarPalavraAleatoria() {
		Random rand = new Random();
		int indice = rand.nextInt(separarPalavras().length);
		palavra = separarPalavras()[indice];
		return palavra;
	}
	
	public boolean existePalavra(String palavra) {
		if(this.palavra.equals(palavra)) {
			return true;
		}else {
			return false;
		}
	}

}
