import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String args[]) {
      
      Scanner entrada = new Scanner(System.in);
      
      double radio,area,longitud;
      radio = entrada.nextDouble();
      area = Math.PI *(radio*radio);
      longitud = 2*Math.PI*radio;
      
      System.out.println("Radio: " +radio);
      System.out.println("Area: " +area);
      System.out.println("Longitud circuferencia: " + longitud);
    }
}