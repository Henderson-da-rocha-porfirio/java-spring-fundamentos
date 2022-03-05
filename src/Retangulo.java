public class Retangulo {

	private double largura; // atributos
	private double altura; // atributos
	
	public Retangulo() {
		this(4, 3); // O construtor parece um método mas não é um método. Ele é chamado no momento em que o objeto é instanciado, ou seja o código será executado pelo objeto.
		largura = 4;           // Ele não retorna ou define nada nele. Isso só acontece dentro do método.
		altura = 3;
	}
	
	public Retangulo(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
	}
	
	public double calcularArea() { // método se diferencia de um construtor porque esse tem retorno (return)
		return largura * altura;
	}
}
