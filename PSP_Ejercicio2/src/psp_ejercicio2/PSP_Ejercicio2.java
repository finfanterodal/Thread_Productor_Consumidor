package psp_ejercicio2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dam2
 */
public class PSP_Ejercicio2 extends Thread{

    
    
    String nome;

    public PSP_Ejercicio2(String nome) {
        super(nome);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ": " + getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(PSP_Ejercicio2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Hilo "+getName()+" Terminated");

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {

        PSP_Ejercicio2 h1 = new PSP_Ejercicio2("A");
        PSP_Ejercicio2 h2 = new PSP_Ejercicio2("B");
        PSP_Ejercicio2 h3 = new PSP_Ejercicio2("C");
        PSP_Ejercicio2 h4 = new PSP_Ejercicio2("D");

        h1.start();
                h1.join();
        h2.start();
            h2.join();
        
        h3.start();
                     h3.join();
        h4.start();
   
        h4.join();

        System.out.println("Thread main terminated");
         
        
    }
    
}
