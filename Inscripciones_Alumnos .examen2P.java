import java.util.Scanner;

public class Inscripciones_Alumnos {
	private static Scanner teclado =new Scanner(System.in);
	

	public static void main(String[] args) {

		String nombre;
		int ID;
		String Materia;
		double parcial1;
		double parcial2;
		double parcial3;
		
		
		Notas notas [] = new Notas [5] ;
		
		
		for ( int i = 0; i <5; i++) {
			
			System.out.print("Introduce Nombre \n");
				nombre = teclado.nextLine();

			System.out.print("Introduce ID \n");
				ID = teclado.nextInt();

			System.out.print("Introduce Materia \n");
				Materia = teclado.nextLine();

			System.out.print("Introduce nota 1er Parcial \n");
				parcial1 = Double.parseDouble(teclado.nextLine());

			System.out.print("Introduce nota 2do Parcial \n");
				parcial2 = teclado.nextDouble();

			System.out.print("Introduce nota 3er Parcial \n");
				parcial3 = teclado.nextDouble();
				
				
				Notas miNotas = new Notas(nombre,ID,Materia,parcial1,parcial2,parcial3);
				notas [i]= miNotas;
			
		}
		
		for (int i = 0; i <5;i++) {
				System.out.print("Nombre: " + notas[i].getNombre()+"/n");
				System.out.print("ID: " + notas[i].getID()+"/n");
				System.out.print("Promedio de: " + notas[i].getMateria() + " es " + 
								(notas[i].getParcial1()+notas[i].getParcial2()+
								notas[i].getParcial3()/3));
				
				System.out.print("********************");
			
		}
	}

}



  
