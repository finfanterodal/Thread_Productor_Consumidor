package psp_ejercicio6;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dam2
 */
public class PSP_Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contenedor recursos = new Contenedor();
        Consumer c = new Consumer(recursos);
        Producer p = new Producer(recursos);
        p.start();
        c.start();
    }

}
