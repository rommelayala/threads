// Creamos la clase BThread, la cual deriva de Thread
public class BThread extends Thread {
  public void run() { // Implementamos el m�todo run()
    int i;
    for (i=1;i<=200; i++)
      System.out.print(" B"+i);
  }
}