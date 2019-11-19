/*
 * 
 */
package prueba_productor_consumidor;

/**
 *
 * @author dam2
 */
public class Cola {

    private int[] datos;
    private int sigEnt, sigSal, ocupados, tamano;

    public Cola(int tam) {
        this.datos = new int[tam];
        this.tamano = tam;
        this.ocupados = 0;
        this.sigEnt = 1;
        this.sigSal = 1;
    }

    public synchronized void almacenar(int x) throws InterruptedException {
        while(ocupados == tamano)wait();
        datos[sigEnt]=x;
        sigEnt=(sigEnt+1)%tamano;
        ocupados++;
        notify();
    }

    public synchronized int extraer() throws InterruptedException {
        int x=0;
        while(ocupados==0) wait();
        x=datos[sigSal];
        sigSal=(sigSal+1)%tamano;
        ocupados--;
        notify();
        return x;
    }
    
}
