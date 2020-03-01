package embaralhar;
public class PalavraInversa implements Embaralhador {

	@Override
	public String embaralharPalavra(String palavra) {
		String novaPalavra = "";
		for(int i = palavra.length(); i > 0; i--) {
				novaPalavra += palavra.subSequence(i - 1, i);
		}
		return novaPalavra;
	}

}
