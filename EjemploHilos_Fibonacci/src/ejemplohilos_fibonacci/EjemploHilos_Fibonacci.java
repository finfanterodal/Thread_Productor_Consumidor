package ejemplohilos_fibonacci;

/**
 *
 * @author finfanterodal
 */
public class EjemploHilos_Fibonacci extends Thread {

    int numero;

    public EjemploHilos_Fibonacci(int num) {
        this.numero = num;
    }

    public void run() {
        int i = 1;
        int j = 1;
        int aux = 0;

        for (int k = 0; k < this.numero; k++) {
            aux = i + j;
            System.out.println(aux);
          i=j;
          j=aux;
        }
        
        System.out.println("Terminated Thread " + getName());
    }
    public static void main(String[] args) {
         new EjemploHilos_Fibonacci(10).start();
    }
    
}
