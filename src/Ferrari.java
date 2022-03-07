
public class Ferrari implements Carro, ItemCaro { // Para que Ferrari tenha o comportamento de Automóvel,
													// ou seja, implemente os métodos definidos na Interface Automóvel,
														// é utilizado implements Automovel.
															// Extends vs Implements =>
																// Extends = herdando de uma super classe.
																	// Implements = Implementando uma interface.
													// Contudo, como o método abrirPorta() foi implementado na interface carro, eu faço implements Carro.
														// Porque a interface Carro é uma sub-interface da super-interface Automovel.
															// OU seja, ao implementar de Carro, o seu método abrirPorta() eu também herdo os métodos da super-interface Automovel
													// Ferrari tanto é um carro(interface) quanto é um itemCaro(interface). Nesse caso, você pode implementar quantas interfaces quiser.

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
	} 															// A classe sempre tem que implementar todos os métodos da interface que ela implementa.
																	// Ou da hierarquia de interfaces que ela implementa. Métodos abrir porta também precisa ser aberto

	@Override
	public double getPreco() { 									// A classe implementa o método getPreco() da interface ItemCaro.
		return 1000000;
	}
}
