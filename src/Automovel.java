
public interface Automovel {

	void acelerar();
	void frear();
	
	default void derrapar() { //utilizando o modificador default para ter autorização para implementar o método dentro da interface.
		acelerar();
		acelerar();
		frear();
	}

	static int getVelocidadeMaxima() {
		return 300;
	}
}
