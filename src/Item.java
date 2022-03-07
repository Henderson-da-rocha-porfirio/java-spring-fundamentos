
public abstract class Item { //Classe de Item generico e abstrata (abstract). Ou seja, não contem objetos nela. Item pode ser várias coisas.

	private int posX;
	private int posY;
	
	public abstract void pegar(); // Método abstrato. É feito dentro, apenas, de uma classe abstrata. E não tem implementação. As sub-classes que o implementam.

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	} // A classe pode ter métodos não-abstratos.

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	
}
