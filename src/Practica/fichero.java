package Practica;


import java.io.*;

public class fichero {
    static File file = new File("C:\\Users\\adria\\IdeaProjects\\LenguajeHacker\\Leet.txt");

    public static void main(String[] args) throws IOException {
        String contenido = "";
        try {
            FileWriter fw = new FileWriter(file);
            fw.write("I'm thinkin' maybe I should thank you\n" +
                    "Oh baby, I should buy you another round\n" +
                    "'Cause you care, and I swear that I'm here, but I'm there\n" +
                    "It's gettin' harder to hunt me down\n" +
                    "Get away to a place with a lake, such a great view\n" +
                    "Leave the bank, couple hundred thou'\n" +
                    "I made it, but hate once I build it I break it down\n" +
                    "Might just break me down");
            fw.close();

            // FileInputStream fi = new FileInputStream(file);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(reader());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


    }

    public static String reader() throws IOException {
        String contenido = "";
        FileReader fr = new FileReader(file);
        //BufferedReader br = new BufferedReader(fr);
        //contenido= br.readLine();

        int c = fr.read();
        while (c!=-1){
            contenido+=(char)c;
           //Se acualiza el nuevo valor para continuar dentro del while.
            c = fr.read();
            System.out.println(c);

        }
      return contenido;
    }
}