package NumerosAleatorios;

import java.util.Random;

public class NumerosAleatorios {

    public static void main(String[] args) {
    Threads hilo1 = new Threads("Hilo 1");
    Threads hilo2 = new Threads("Hilo 2");

    hilo1.start();
    hilo2.start();

        /*for (int i = 0; i <100 ; i++) {
            System.out.println("i: "+i);
        }*/


    }
}
