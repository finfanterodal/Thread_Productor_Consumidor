package psp_repasoexamen;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author dam2
 */
public class PSP_RepasoExamen extends Thread {

    String nome;

    public PSP_RepasoExamen(String nome) {
        super(nome);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 8; i++) {
            System.out.println(i + ": " + getName());
            int tiempo=(int)(Math.random() * 1000 + 1);
            try {
                Thread.sleep(tiempo);
            } catch (InterruptedException ex) {
                Logger.getLogger(PSP_RepasoExamen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        PSP_RepasoExamen h1 = new PSP_RepasoExamen("A");
        PSP_RepasoExamen h2 = new PSP_RepasoExamen("B");
        PSP_RepasoExamen h3 = new PSP_RepasoExamen("C");
        h1.start();
        h1.join();
        h2.start();
        h2.join();
        h3.start();
        h3.join();

        System.out.println("Thread main terminated");
    }

}
