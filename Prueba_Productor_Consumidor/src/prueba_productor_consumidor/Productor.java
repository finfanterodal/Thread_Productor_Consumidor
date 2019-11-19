/*Clase que genera datos enteros y los almacena en un buffer*/
package prueba_productor_consumidor;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dam2
 */
public class Productor extends Thread {

    private Cola buffer;

    public Productor(Cola buffer) {
        this.buffer = buffer;
    }

    public void run() {
        int valor = 0;
        while (true) {
            try {
                buffer.almacenar(valor);
            } catch (InterruptedException ex) {
                Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
            }
            valor++;
        }
    }

}
