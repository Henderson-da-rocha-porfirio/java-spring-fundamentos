
public class Aplicacao {

	public static void main(String[] args) {

		// int x = 10;  Aqui não ocorre Casting. Porque estou armazenando um número inteiro (10) numa variável inteira (int x).
		
		//long x = 10; Casting Implícito = Aqui ocorre o casting porque está sendo armazenado um valor inteiro (10) dentro de uma varíável de tipo long.

		// long x = 10l; Aqui não ocorre o casting. 10l é um long.
		
		//double x = 35; Aqui ocorre um casting implícito.
		//System.out.println(x);
		
		//float x = 40.0F; Aqui também não tem casting. 40.0F é float. Sem o "F" seria um double. E não funcionaria nesse caso.
		
		//float x = (float) 40.0; Aqui é um exemplo de Casting Explícito.
		
		//short x = (short) 100000; Aqui não compila.
		//System.out.println(x);
														// O casting explícito só funciona quando o valor da variável cabe no armazenamento de destino.
		//byte x = (byte) 130; Aqui não compila também.
		//System.out.println(x);
	}
}
