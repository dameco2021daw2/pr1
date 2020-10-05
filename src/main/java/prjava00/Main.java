/**
 *
 * @author dameco2021daw2 (a on xxyyzz és el teu nom d'usuari Github)
 */
import java.io.*;
public class Main {
 /**
 * @param args the command line arguments
 */
 public static void main(String[] args) {
 File f = new File("fitxer.html");
 try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
 bw.write("<html>");bw.newLine();
 bw.write(" <head>");bw.newLine();
 bw.write(" <title>");bw.newLine();
 bw.write(" Nova p&agrave;gina web");bw.newLine();
 bw.write(" </title>");bw.newLine();
 bw.write(" </head>");bw.newLine();
 bw.write(" <body>");bw.newLine();
 bw.write(" Nova p&agrave;gina web");bw.newLine();
 bw.write(" </body>");bw.newLine();
 bw.write("</html>");bw.newLine();
 bw.close();
    }
 }
}