package Practica;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {

        String[] alfabetoLeet = {"4", "8", "(", ")", "3", "|=", "6", "#", "1", "_|", ">|", "|_", "|V|", "/V", "0", "|D", "(,)", "|2"
                , "5", "7", "(_)", "|/", "VV", "><", "'/,", "2", " "};

        String[] numerosLeet = { "o","L", "R", "E", "A", "S", "b", "T", "B", "g"};
        char[] key = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        Map<Character, String> mapa = new HashMap<>();
        Map<Character, String> mapaNumeros = new HashMap<>();

        //Rellenado de abecedario
        int aux = 0;
        for (char i = 'a'; i <='z'; i++) {
            mapa.put(i, alfabetoLeet[aux]);
            aux++;
        }

        for (int i = 0; i < numerosLeet.length; i++) {
            mapaNumeros.put(key[i],numerosLeet[i]);
        }
        //Extras que no entran en abecedario: ñ y espacio.
        mapa.put('ñ', "~");
        mapa.put(' ', " ");

        System.out.println(mapa);
        System.out.println(mapaNumeros);

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa el texto: ");
        String texto = scan.nextLine();


       // mapa.forEach((x,y)-> System.out.println(x+" = "+y));

        /*int aux2 =0;
        boolean entra= true;
        while (entra) {
        for (Map.Entry<Character,String> ma: mapa.entrySet()) {

            if (texto.charAt(aux2)) {
                if (ma.getKey().equals(texto.charAt(aux2))) {
                    System.out.println("ma = " + ma);

                }
             }
            }
            aux2++;
        }*/

       char cTexto = 0;
       char cMapa = 0;
       int definida;

        for (int i = 0; i <texto.length() ; i++) {
            definida=0;
            cTexto=texto.charAt(i);

            for (Map.Entry<Character,String> ma: mapa.entrySet()) {
                cMapa=ma.getKey();

                if (cTexto == cMapa){
                    System.out.println("ma = " + ma);
                    definida=1;
                }
            }

            if (definida==0){
                System.out.println("El caracter: " + cTexto + " no esta definido...");
            }






        }





        /*for (int i = 0; i < mapa.size(); i++) {
            for (char j = 'a'; j < 'z'; j++) {
                //if (texto.charAt(i)== mapa.get(i)){

                }

            }*/


        }



    }
