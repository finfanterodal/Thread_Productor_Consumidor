package psp_ejercicio3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dam2
 */
public class PSP_Ejercicio3 extends Thread {

    int contador;

    public PSP_Ejercicio3(String nome) {
        super(nome);
    }

    public void run() {
        for (int j = 0; j < 5; j++) {
            PSP_Ejercicio3 hilo = new PSP_Ejercicio3("Hilo" + String.valueOf(j+2));
            System.out.println("Empieza " + getName());
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + ": " + getName());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(PSP_Ejercicio3.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println("Acaba " + getName());
            hilo.start();
            try {
                hilo.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(PSP_Ejercicio3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        PSP_Ejercicio3 h1 = new PSP_Ejercicio3("Hilo 1");
        h1.start();
        System.out.println("Acaba Thread Main");
    }

}
