
public enum DiaDaSemana { // Enum para referenciar os dias da semana.

	DOMINGO(1), // Lista de valores possíveis dentro dessa enumeração.
	SEGUNDA(2),
	TERCA(3),
	QUARTA(4), // Enxergar cada elemento que faz parte do Enum como uma espécie de objeto do tipo DiaDaSemana. Por isso eles poderão ter acesso aos atributos, construtores e métodos.
	QUINTA(5),
	SEXTA(6),
	SABADO(7); // Adicionando ";" o java sabe onde exatamente termina essa listagem de elementos do enum e onde começa a inserção de outros elementos como abaixo:
	
	private int num; // Atributo - para cada elemento acima. Ele pertence a cada dia da semana.
						// Ou seja, cada dia da semana vai ter um número.
	
	DiaDaSemana(int num) {
		this.num = num;
	} // Construtor = que vai receber um número como parâmetro.
												// O modificador não precisa ser colocado. Porque "private" já é assumido como padrão.
													// É private porque apenas os elementos acima (DOMINGO e etc, que poderão chamar o construtor).
	public int getNum() {
		return num;
	} // Método getNum para retornar o número associado para quem fizer o chamado.
}
