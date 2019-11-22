/*
PROBLEMA 1
1.A. Programa en java que crea tres hilos y los ejecuta. Los hilos escriben 8 veces el número de iteración
del bucle y su nombre. En cada iteración, después de escribir su nombre, se bloquean durante un tiempo
aleatorio de segundos y después vuelven a estar disponibles para su ejecución. El programa principal no
terminará hasta que hayan terminado los tres hilos. (1,5 puntos)
1.B. Modifica el programa del apartado A para que los hilos se comporten de forma secuencial, (espera a
que el tercer hilo acabe para que se ejecute el segundo y a su vez, que el segundo acabe para que se
ejecute el primero) y termina por último el programa principal. (1 punto)
1.C. Modifica el programa del apartado A para que después de cada iteración, después de escribir su
nombre, dejen paso al otro hilo. (0,5 puntos)
*/


package psp_repasoexamen;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dam2
 */
public class PSP_RepasoExamen extends Thread {

    String nome;
    boolean ocupado1=true;
    boolean ocupado2=false;
    boolean ocupado3=false;

    public PSP_RepasoExamen(String nome) {
        super(nome);
    }

    @Override
    public void run() {
        //APARTADO A) y B)
        for (int i = 1; i <= 8; i++) {
            System.out.println(i + ": " + getName());
            int tiempo = (int) (Math.random() * 100 + 1);
            try {
                Thread.sleep(tiempo);
            } catch (InterruptedException ex) {
                Logger.getLogger(PSP_RepasoExamen.class.getName()).log(Level.SEVERE, null, ex);
            }
               yield();
        }
     

    }

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        PSP_RepasoExamen h1 = new PSP_RepasoExamen("hilo1");
        PSP_RepasoExamen h2 = new PSP_RepasoExamen("hilo2");
        PSP_RepasoExamen h3 = new PSP_RepasoExamen("hilo3");

        /*// APARTADO A)
        h1.start();
        h2.start();
        h3.start();
        h1.join();
        h2.join();
        h3.join();*/
 /*
        // ABARTADO B)
        h3.start();
        h3.join();
        h2.start();
        h2.join();
        h1.start();
        h1.join();
         */
        // APARTADO C)
        h1.start();
        h2.start();
        h3.start();

        System.out.println("Thread main terminated");
    }

}
