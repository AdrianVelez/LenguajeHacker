package LenguajeLeetFichero;

import java.io.*;

public class AlfabetoHacker {

        String[] alfabetoLeet = {"4","8","(",")","3","|=","6","#","1","_|",">|","|_","|V|","/V","~","0","|D","(,)","|2"
                ,"5","7","(_)","|/","VV","><","'/,","2","L","R","E","A","S","b","T","B","g","o"," ",",",".","-","@"};

        char[] alfabeto = {'a', 'b', 'c', 'd', 'e','f', 'g', 'h','i','j','k','l','m','n','ñ','o','p','q','r'
                ,'s','t','u','v','w','x','y','z','1','2','3','4','5','6','7','8','9','0',' ',',','.','-','@'};


        public void writeText(File file, String texto) throws IOException {
            FileWriter fw = new FileWriter(file);
            fw.write(texto);
            fw.close();
        }

        public void readText(File file) throws FileNotFoundException {
            String contenido =" ";
            String conversion=" ";

            try {
                FileReader fr = new FileReader(file);

                int aux=0;
                int lee = fr.read();
                while (lee != -1){

                    for (int i = 0; i < alfabeto.length; i++) {

                        if (Character.toLowerCase((char) lee) ==alfabeto[i]){
                            contenido += ((char)lee);
                            conversion+= alfabetoLeet[i];
                        }
                    }
                    lee = fr.read();
                }

            }catch (FileNotFoundException e){
                System.out.println("Error en lectura de fichero: "+e.getMessage());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Lenguaje natural: "+contenido);
            System.out.println("Lenguaje Leet -> " + conversion);

        }

}
