import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String args[]) {
      int edadJuan,edadAlberto,edadAna,edadMama;
      
      Scanner entrada = new Scanner(System.in);
      
      edadJuan = entrada.nextInt();
      edadAlberto = edadJuan*2/3;
      edadAna = edadJuan*4/3;
      edadMama = edadJuan + edadAlberto + edadAna;
      System.out.println("Edad Juan: " + edadJuan);
      System.out.println("Edad Alberto: " + edadAlberto);
      System.out.println("Edad Ana: " + edadAna);
      System.out.println("Edad Mama: " + edadMama);
      
    }
}