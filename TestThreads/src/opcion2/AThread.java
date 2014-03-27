package opcion2;

//Creamos la clase AThread que implementa 
//la interfaz Runnable
public class AThread implements Runnable {
	Thread t; // Atributo que es un obj. de la clase Thread

	public AThread() {
		// Al atributo le pasamos como argumento el
		// obj. de la clase que estamos creando.
		t = new Thread(this);
		t.start(); // Arrancamos el hilo
	}

	public void run() { // Implementamos el método run()
		int i;
		for (i = 1; i <= 20; i++)
			System.out.print(" A" + i);
	}
}