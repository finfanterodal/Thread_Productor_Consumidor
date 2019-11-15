package psp_ejercicio5;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dam2
 */
public class PSP_Ejercicio5 extends Thread {

    public PSP_Ejercicio5(String nome) {
        super(nome);
    }

    public void run() {
        if (getName().equals("1")) {
            PSP_Ejercicio5 h2 = new PSP_Ejercicio5("2");
            h2.start();
            try {
                h2.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(PSP_Ejercicio5.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Hilo: " + getName());

        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {

        PSP_Ejercicio5 h1 = new PSP_Ejercicio5("1");
        h1.start();

    }

}
