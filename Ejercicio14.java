import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String args[]) {
        
      double num,cuadrado,cubo;
      
      Scanner entrada = new Scanner(System.in);
      
      num = entrada.nextInt();
      cuadrado = num*num;
      cubo = num *num*num;
      System.out.println("Cuadrado: " + cuadrado);
      System.out.println("Cubo: " + cubo);
    }
}