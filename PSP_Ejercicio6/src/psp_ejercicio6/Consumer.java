package psp_ejercicio6;

/**
 *
 * @author dam2
 */
public class Consumer extends Thread{

    private Contenedor contenedor1;

    Consumer(Contenedor cont) {
        super("Consumidor");
        contenedor1 = cont;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName());
            try {
                contenedor1.retirar();
            } catch (InterruptedException ex) {
            }
        }

    }
}
