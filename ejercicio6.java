import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio6 {

   public static void main(String[] args) {
     
      ArrayList<Double> altura = new ArrayList();
      int N;
      double media;
      
      N = numeroAlumnos();
     
      leerAlturas(altura, N);
   
      media = calcularMedia(altura);
     
      mostrarResultados(altura, media);
   }
  public static int numeroAlumnos() {
      Scanner sc = new Scanner(System.in);
      int n;
      do {
            System.out.print("Introduce número de alumnos: ");
            n = sc.nextInt();
      } while (n < 1);
      return n;
   }

   
   public static void leerAlturas(ArrayList<Double> a, int n) {
      Scanner sc = new Scanner(System.in);
      int i;
      double alto;
      for (i = 1; i <= n; i++) {
           do {
                 System.out.print("Alumno " + i + " altura: ");
                 alto = sc.nextDouble();
           } while (alto <= 0);
           a.add(alto); 
      }
  }

  
   public static double calcularMedia(ArrayList<Double> a) {
      double media = 0;
      for (Double d : a) {
            media = media + d;
      }
      return media / a.size();
   }

  
   public static void mostrarResultados(ArrayList<Double> a, double media) {                                
      int superior = 0, inferior = 0;
  
      for (Double d : a) {
            if (d > media)
                superior++;
            else if (d < media)
                       inferior++;
      }
      
      System.out.println("Hay " + superior + " alumnos más altos que la media");
      System.out.println("Hay " + inferior + " alumnos más bajos que la media");
   }
}
