/*
 * 
 */
package prueba_productor_consumidor;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dam2
 */
public class Consumidor {

    private Cola buffer;

    public Consumidor(Cola buffer) {
        this.buffer = buffer;
    }

    public void run() {
        int dato;
        while (true) {
            try {
                dato = buffer.extraer();
                System.out.println(dato);
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
