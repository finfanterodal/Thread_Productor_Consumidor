package psp_ejercicio1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dam2
 */
public class PSP_Ejercicio1 extends Thread {

    String nome;

    public PSP_Ejercicio1(String nome) {
        super(nome);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + ": " + getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(PSP_Ejercicio1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PSP_Ejercicio1 h1 = new PSP_Ejercicio1("A");
        PSP_Ejercicio1 h2 = new PSP_Ejercicio1("B");

        h1.start();
        h2.start();

    }

}
