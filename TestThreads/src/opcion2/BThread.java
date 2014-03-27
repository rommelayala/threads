package opcion2;

//Creamos la clase BThread que implementa 
//la interfaz Runnable
public class BThread implements Runnable {
Thread t; // Creamos un obj. de la clase Thread
public BThread() {
 // Al nuevo obj. le pasamos como argumento el
 // obj. de la clase que estamos creando.
 t = new Thread(this); 
 t.start();
}
public void run() { // Implementamos el método run()
 int i;
 for (i=1;i<=20; i++)
 	System.out.print(" B"+i);
}
}