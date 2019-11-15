package psp_example_productor_consumidor;

import java.util.ArrayList;

/**
 *
 * @author dam2
 */
public class PSP_Example_Productor_Consumidor {

    private static ArrayList<Integer> recursos = new ArrayList<Integer>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contenedor recursos=new Contenedor();
        Consumer c = new Consumer();
        Producer p = new Producer();
        p.start();
        c.start();
    }

    public static class Contenedor {

    }

    public static class Consumer extends Thread {

        Consumer() {
            super("Consumidor");
        }

        public void run() {
            System.out.println(getName());
            synchronized (recursos) {

            }
        }

    }

    public static class Producer extends Thread {

        Producer() {
            super("Productor");
        }


        public void run() {
            System.out.println(getName());
            synchronized (recursos) {

            }
        }
    }

}
