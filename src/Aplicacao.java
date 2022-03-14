
public class Aplicacao {

	public static void main(String[] args) {

		// Exemplo do tipo primitivo: int i = 20;
		Integer i = Integer.valueOf(20); // Usando o representante de "int" no mundo dos objetos: Integer. Integer é uma classe.
		imprimir(i);						// Para isso tem que criar uma instância de Integer: Integer.valueOf(). Usar new Integer() está deprecated desde o java 9.
												// O número inteiro 20 está sendo colocado dentro desse objeto i. Esse objeto vai embrulhar o número 20.
													// Agora, sendo i um objeto do java, é possível passá-lo como parâmetro dentro do método imprimir.

		Double d = Double.valueOf(23.5);
		imprimir(d);
		
		int i2 = i.intValue();  // Exemplo inverso: pegar o valor do tipo primitivo para a classe wrapper. (desembrulhar)
		double d2 = d.doubleValue();
		
		Integer i3 = Integer.valueOf("20"); // Também passa String. Transforma esse texto em um número inteiro. Retorna objeto da classe wrapper.
		Double d3 = Double.valueOf("23.5");
		
		int i4 = Integer.parseInt("20"); // Uso de método parse aqui ele já retorna o tipo primitivo. Transforma String já diretamente para o tipo primitivo.
		double d4 = Double.parseDouble("23.5");
		
		String bin = "0111";
		int i5 = Integer.parseInt(bin, 2); // Tranformando número binário para número inteiro.
		System.out.println(i5);
		
		String bin2 = Integer.toBinaryString(7); // Caminho inverso para retornar binário.
		System.out.println(bin2);
		
		imprimir(100); // Como isso funciona? POr causa do autoboxing que permita embrulhar e desembrulhar um tipo primitivo.
	}
	
	private static void imprimir(Object obj) {  // Passando obj como parâmetro, isso faz com que o método toString vai fazer imprimir o número do objeto na tela.
		System.out.println(obj);
	}
}
