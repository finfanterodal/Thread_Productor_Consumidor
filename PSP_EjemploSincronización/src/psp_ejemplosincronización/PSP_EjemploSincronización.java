package psp_ejemplosincronización;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dam2
 */
public class PSP_EjemploSincronización extends Thread {

    private static Integer contador = 0;
    private String nome;

    public PSP_EjemploSincronización(String nome) {
        super(nome);
    }

    @Override
    public void run() {

        //for (int i = 1; i <= 3; i++) {
        //System.out.println(": " + getName());
        synchronized (contador) {
            contador++;
            contador++;
            contador++;
        }

        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(PSP_EjemploSincronización.class.getName()).log(Level.SEVERE, null, ex);
        }
        // }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {

        PSP_EjemploSincronización h1 = new PSP_EjemploSincronización("A");
        PSP_EjemploSincronización h2 = new PSP_EjemploSincronización("B");
        PSP_EjemploSincronización h3 = new PSP_EjemploSincronización("C");
        PSP_EjemploSincronización h4 = new PSP_EjemploSincronización("D");

        h1.start();
        h2.start();
        h3.start();
        h4.start();

        h1.join();
        h2.join();
        h3.join();
        h4.join();

        System.out.println(contador);
    }

}
