package psp_ejercicio6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dam2
 */
public class Producer extends Thread {

    private Contenedor contenedor1;

    Producer(Contenedor cont) {
        super("Productor");
        contenedor1 = cont;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(getName());
                contenedor1.ingresar();
            } catch (InterruptedException ex) {
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
            }

        }
    }
}
