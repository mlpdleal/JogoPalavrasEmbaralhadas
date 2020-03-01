package embaralhar;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FabricaEmbaralhadores {
	
	private List<Embaralhador> listaEmbaralhar = new ArrayList<Embaralhador>();
	
	public Embaralhador retornaEmbaralhamento() {
		Random r = new Random();
		listaEmbaralhar.add(new PalavraInversa());
		listaEmbaralhar.add(new PalavraEmbaralhada());
	
		return listaEmbaralhar.get(r.nextInt(listaEmbaralhar.size()));
	}
	

}
