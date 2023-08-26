import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String args[]) {
        
      double salBruto,ret,salNeto;
      salBruto = 5000*48;
      ret = salBruto *0.125;
      salNeto = salBruto - ret;
      System.out.println("Salario bruto: " + salBruto);
      System.out.println("Retencion en la fuente: " + ret);
      System.out.println("Salario neto: " + salNeto);
    }
}