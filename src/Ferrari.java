
public class Ferrari implements Carro, ItemCaro { // Para que Ferrari tenha o comportamento de Automóvel,
													// ou seja, implemente os métodos definidos na Interface Automóvel,
														// é utilizado implements Automovel.
															// Extends vs Implements =>
																// Extends = herdando de uma super classe.
																	// Implements = Implementando uma interface.

	@Override
	public void virarEsquerda() {
		System.out.println("Ferrari virou à esquerda");
	}

	@Override
	public void virarDireita() {
		System.out.println("Ferrari virou à direita");
	}

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
