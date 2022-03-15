
public class Contador extends Thread { // Herdando de thread

	@Override
	public void run() { // corpo da thread
		for (int i = 0; i < 10; i++) {
			System.out.println("=> " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
