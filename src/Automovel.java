
public interface Automovel { // Não se implementa métodos em interfaces. Existe uma excessao.

	void virarEsquerda(); // É necessário entender que métodos dentro de uma interface, definem uma assinatura mas não são implementados.
	void virarDireita();
	void acelerar(); // Todos os métodos dentro de uma interface, por padrão, são publicos, por isso não precisa usar o modificador "public void"
	
}
