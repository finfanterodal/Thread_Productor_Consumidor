package ejemplo_hilos2;
/**
 *
 * @author dam2
 */
public class Ejemplo_Hilos2 extends Thread {

    public Ejemplo_Hilos2(String str) {
        super(str);
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + getName());
        }
        System.out.println("Terminated Thread " + getName());
    }

    public static void main(String[] args) throws InterruptedException {
        
        Ejemplo_Hilos2 h1 = new Ejemplo_Hilos2("Fran");
        h1.start();
        Ejemplo_Hilos2 h2 = new Ejemplo_Hilos2("Lucas");
        h2.start();
        
        h1.join();
        h2.join();
        System.out.println("Termina Thread Main");
    }

}
