package ejemplo_hilos;

/**
 *
 * @author dam2
 */
public class HelloThread implements Runnable {

    Thread t;

    HelloThread() {
        t = new Thread(this, "Nuevo Hilo");
    }

    @Override
    public void run() {
        System.out.println("Hola desde hilo creado.");
        System.out.println("Hilo Finalizado.");
    }

}
