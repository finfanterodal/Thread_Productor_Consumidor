package psp_ejercicio6;

/**
 *
 * @author dam2
 */
public class Contenedor {

    private int dineroCuenta=0;

    public synchronized void ingresar() throws InterruptedException {
        while (dineroCuenta>400){
            wait();
        }
        int ingreso = (int) (Math.random() * 200 + 0);
        dineroCuenta = (dineroCuenta + ingreso);
        System.out.println("Dinero cuenta: " + dineroCuenta + " Ingreso: " + ingreso);
        notify();
    }

    public synchronized void retirar() throws InterruptedException {
        while (dineroCuenta <= 0) {
            wait();
        }
        int retirada = (int) (Math.random() * dineroCuenta + 0);
        dineroCuenta = (int) (dineroCuenta - retirada);
        System.out.println("Dinero cuenta: " + dineroCuenta + " Retirada: " + retirada);
        notify();
    }
}
