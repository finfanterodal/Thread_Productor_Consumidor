package ejemplo_hilos;

/**
 *
 * @author dam2
 */
public class Ejemplo_Hilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new HelloThread();
        System.out.println("Hola desde hilo principal.");
        System.out.println("Hola proceso acabado.");
        
    }

}
