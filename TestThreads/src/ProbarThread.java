// Ejemplo en que vemos como se intercalan los
// contadores de los objetos a y b
public class ProbarThread {
  public static void main(String args[] ) {
    AThread a = new AThread(); // Creamos obj. de la clase AThread
    BThread b = new BThread(); // Creamos obj. de la clase BThread
    // Arrancamos ambos hilos
    a.start(); // start() llama al m�todo run() y vuelve aqu�.
    b.start();
  }
}