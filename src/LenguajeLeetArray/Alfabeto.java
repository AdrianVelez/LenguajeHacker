package LenguajeLeetArray;

import java.util.Scanner;

public class Alfabeto {


    public static void main(String[] args) {

        String[] alfabetoLeet = {"4","8","(",")","3","|=","6","#","1","_|",">|","|_","|V|","/V","~","0","|D","(,)","|2"
                                 ,"5","7","(_)","|/","VV","><","'/,","2","L","R","E","A","S","b","T","B","g","o"," ",",",".","-","@"};

        char[] alfabeto = {'a', 'b', 'c', 'd', 'e','f', 'g', 'h','i','j','k','l','m','n','ñ','o','p','q','r'
                          ,'s','t','u','v','w','x','y','z','1','2','3','4','5','6','7','8','9','0',' ',',','.','-','@'};


        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa el texto: ");
        String texto = scan.nextLine();

        String[] textoLeet= new String[texto.length()];
        int aux=0;

        for (int i = 0; i < texto.length(); i++) {
            //System.out.println("cadena ->"+ texto.charAt(i));
            for (int j = 0; j < alfabeto.length; j++) {
                if (texto.charAt(i)== alfabeto[j]){
                    //System.out.println("igual= " + texto.charAt(i)+ " posicion: "+j);
                    textoLeet[aux] = alfabetoLeet[j];
                    aux++;
                }
                //System.out.println(alfabeto[j]);
            }

        }
        String salida = String.join("", textoLeet);
        System.out.println( " conversion a Leet: --->   " + salida);



    }



}
