
public class Aplicacao {
	
	private enum Sexo { 					// Exemplo de criação de um Enum dentro de uma classe sem que exista um arquivo do tipo enum como DiaDaSemana.
		MASCULINO, FEMININO						// private por acessar dentro da própria classe.
	}

	public static void main(String[] args) {
		
		DiaDaSemana hoje = DiaDaSemana.SEXTA; // Variável do tipo de enum. Só é possível atribuir valor para essa variável, elementos que fazem parte deste Enum.
		
		int num = DiaDaSemana.QUARTA.getNum(); // Imprimir na tela o número associado a QUARTA.
		System.out.println(num);
		
		String s = "TERCA"; // Converter uma string para um elemento enum, no exemplo é a conversão da string "s" para o valor "TERCA". E o valor tem que ser igual a declarada no enum: TERCA e não terca ou outra coisa:
		
		DiaDaSemana d = DiaDaSemana.valueOf(s); //Utilizando a chamada DiaDaSemana.valueOf passando a string "s" como parâmetro. A variável " d " é para efeitos de armazenar.
		System.out.println(d.getNum());
		
		Sexo sexo = Sexo.MASCULINO; // Se o enum acima tivesse sido declarado como public para ser usado aqui ou por outra classe, teria que por: Sexo sexo = Aplicacao.Sexo.MASCULINO;
	}
}
