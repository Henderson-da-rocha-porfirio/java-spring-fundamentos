
public class Aplicacao {

	public static void main(String[] args) {
		
		Diamante d = new Diamante(); // Variavel d do tipo Diamante
		d.pegar();
		
		Cogumelo c = new Cogumelo(); // Variavel c do tipo Cogumelo
		c.pegar();
		
		Moeda m = new Moeda(); // Variavel m do tipo Moeda
		m.pegar();
		
		Item maca = new Maca(); // Variavel maca do tipo Item. Poderia também ser: Maca maca = new Maca() ... essa situacao acontece devido ao casting implicito.
		maca.pegar(); //testando commit
	}
}
