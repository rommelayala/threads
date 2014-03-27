package opcion2;


//Ejemplo en que vemos como se intercalan los
//contadores de los objetos a y b
public class Probar2Thread {
public static void main(String args[] ) {

     // Creamos obj. de la clase AThread.
// El constructor arranca el hilo.
 AThread a = new AThread(); 

    // Creamos obj. de la clase BThread.
// El constructor arranca el hilo.
 BThread b = new BThread(); 

}
}