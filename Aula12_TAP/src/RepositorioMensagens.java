import java.util.ArrayList;

public class RepositorioMensagens {
	private static ArrayList<String> colecao = new ArrayList<String>();
	
	//Metodo construtor da classe
	public RepositorioMensagens() {
		colecao.add("Oi, tudo bem?");
		colecao.add("tudo e você");
		colecao.add("To bem");
		colecao.add("Manda nudes");
	}
	
	//Metodo da classe
	public static String getMensagem() {
		return colecao.get((int) (colecao.size()*Math.random())); 
	}
}
