
public class Aplicacao {

	public static void main(String[] args) {
	
		Ferrari f = new Ferrari(); // Instanciar uma Ferrari
		Rota rota = new Rota(); // Instanciar um objeto Rota
		rota.ir(f); // Pedir para a Ferrari fazer a rota
						// O parametro passado é um automóvel, "a" herdado de Automovel a que está em Rota.
							// Se uma classe implementa uma interface, essa classe é do tipo da interface. Então, Ferrari além de ser uma Ferrari, é um automóvel.
								// Para fixar:
									// Herança => A sub-classe que herda da super-classe, ela é do tipo da super-classe.
									// Interface =>  A classe que implementa uma interface, ela é do tipo da Interface.
										//por isso que o objeto "f" é passado como parametro. Este "f" referencia a variável "f" definida acima.
											// Não houve necessidade de mexer no método "ir" da classe Rota. Ele continua interagindo com o Automovel genérico.
												// O que vai ser executado é o que foi passado para esse método "ir" instanciado na Ferrari.
		
		AnelBrilhante a = new AnelBrilhante(); // Instanciar um AnelBrilhante
		
		Vendedor v = new Vendedor(); // Instanciar um Vendedor
		v.mostrarPreco(f);
		v.mostrarPreco(a);
	}
}
