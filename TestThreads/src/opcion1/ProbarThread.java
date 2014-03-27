package opcion1;
// Ejemplo en que vemos como se intercalan los
// contadores de los objetos a y b
public class ProbarThread {
	public static void main(String args[]) throws InterruptedException {
		AThread a = new AThread(); // Creamos obj. de la clase AThread
		BThread b = new BThread(); // Creamos obj. de la clase BThread
		// Arrancamos ambos hilos
		a.start(); // start() llama al método run() y vuelve aquí.
		b.start();
		// quedate aqui hasta q acaben los trheads a y b
		a.join();
		b.join();
		// muestra main finalizado
		System.out.println("\n Main finalizado!!");
	}
}