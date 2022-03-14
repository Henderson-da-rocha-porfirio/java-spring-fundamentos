
public class Aplicacao {

	public static void main(String[] args) {
		
		Handler h = new Handler();

		//Exemplo com java 4 com valueOf e sem autoboxing:
		//Integer i = Integer.valueOf(10);
		//h.setObj(i);
		
		//Integer i2 = (Integer) h.getObj();
		//int i3 = i2.intValue();
		//System.out.println(i3);

		// Exemplo com Java 11 (já funciona a partir do java 9):
		//int i = 10; 						-> Aqui tenho um int
		//h.setObj(i);						-> Dentro do parâmetro recebe um Integer.
		//									-> Imboxing
		
		//int i2 = (int) h.getObj();
		//System.out.println(i2);

		//Exemplo com java 4 com valueOf e sem autoboxing:
		//Double d1 = Double.valueOf(5);
		//Double d2 = Double.valueOf(4);

		// Exemplo com Java 11:
		//Double d1 = 5.0; 					-> Atribuindo um double (tipo primitivo) à um objeto Double (classe Wrapper). Só é possível pelo autoboxing.
		//Double d2 = 4.0;
		
		//double d = somar(d1.doubleValue(), d2.doubleValue());   -> Também funciona.
		//Double d = somar(d1, d2);
		//System.out.println(d);

		//Exemplo com java 4 com valueOf e sem autoboxing:
		//Integer i = Integer.valueOf(5);
		//int i2 = i.intValue();
		//i2++;
		//i = Integer.valueOf(i2);
		//System.out.println(i);

		// Exemplo com Java 11:
		Integer i = 5;
		i++;
		System.out.println(i);
	}
	
	private static double somar(double d1, double d2) {
		return d1 + d2;
	}
 }
