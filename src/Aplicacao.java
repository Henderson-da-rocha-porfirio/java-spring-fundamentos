
public class Aplicacao {

	public static void main(String[] args) {
	
		Ferrari f = new Ferrari();
		Porsche p = new Porsche(); //esses métodos têm acesso por "herdar"(um tipo de herança mas não é a mesma) os métodos da interface Automovel.
		
		f.derrapar();
		p.derrapar();
		
		int vm = Automovel.getVelocidadeMaxima();
													// Estou chamando apenas o método estático getVelocidadeMaxima de dentro da interface automovel. E não é preciso instanciar nenhum objeto.
														//Conceito similar de quando está chamando um método estático dentro de uma classe.
		System.out.println(vm);
	}
}
