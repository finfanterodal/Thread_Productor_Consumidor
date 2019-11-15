package psp_ejercicio4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dam2
 */
public class PSP_Ejercicio4 extends Thread {

    private String nome;
    private int n = 0;
    private int pares = 0;
    private int impares = 0;
    private int f23 = 0;

    public PSP_Ejercicio4(String nome) {
        super(nome);
    }

    @Override
    public void run() {

        if (getName().equals("Pares")) {
            for (int i = 0; i <= 1000; i++) {
                if (i % 2 == 0) {
                    pares = i + pares;
                    System.out.println(getName() + ": " + pares);
                }
            }
        } else if (getName().equals("Impares")) {
            for (int i = 0; i <= 1000; i++) {
                if (i % 2 != 0) {
                    impares = i + impares;
                    System.out.println(getName() + ": " + impares);
                }
            }
        } else if (getName().equals("end23")) {
            for (int i = 0; i < 1000; i++) {
                String palabra = String.valueOf(i);
                String[] cadena = palabra.split("");
                if (cadena[cadena.length - 1].equals("2") || cadena[cadena.length - 1].equals("3")) {
                    f23 = i + f23;
                    System.out.println(getName() + ": " + f23);
                }
            }

        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PSP_Ejercicio4 h1 = new PSP_Ejercicio4("Pares");
        PSP_Ejercicio4 h2 = new PSP_Ejercicio4("Impares");
        PSP_Ejercicio4 h3 = new PSP_Ejercicio4("end23");

        h1.start();
        h2.start();
        h3.start();

    }

}
