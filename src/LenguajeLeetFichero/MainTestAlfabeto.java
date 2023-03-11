package LenguajeLeetFichero;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MainTestAlfabeto {
    public static void main(String[] args) throws IOException {

        AlfabetoHacker leet = new AlfabetoHacker();

        File file = new File("C:\\Users\\adria\\IdeaProjects\\LenguajeHacker\\Leet.txt");

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa el texto: ");

        String texto = scan.nextLine();

        leet.writeText(file, texto);

        leet.readText(file);








    }
}
