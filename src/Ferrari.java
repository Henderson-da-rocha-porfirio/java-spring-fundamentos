
public class Ferrari implements Carro, ItemCaro { // Para que Ferrari tenha o comportamento de Automóvel,
													// ou seja, implemente os métodos definidos na Interface Automóvel,
														// é utilizado implements Automovel.
															// Extends vs Implements =>
																// Extends = herdando de uma super classe.
																	// Implements = Implementando uma interface.

	@Override
	public void virarEsquerda() {
		System.out.println("Ferrari virou à esquerda");
	} 													// A implementação está dando vida aos métodos da Interface.

	@Override
	public void virarDireita() {
		System.out.println("Ferrari virou à direita");
	} 													// Como a interface só define apenas o que é possível fazer.
															// E é aqui na implementação da interface que você vai definir o "como".
																// Ou seja, vai definir o "como" pode ser feito os métodos definidos na interface.

	@Override
	public void acelerar() {
		System.out.println("Ferrari acelerou");
	}

	@Override
	public void abrirPorta() {
		System.out.println("Ferrari abriu a porta");
	}

	@Override
	public double getPreco() {
		return 1000000;
	}
}
