/*6. Generar una matriz de 10x10, asignarles n�mero reales aleatorios a cada elemento entre -5 y 5.
Calcular e imprimir la suma de cada una de sus filas y de cada una de sus columnas junto con la
matriz.*/
import java.util.*;
public class H1vect6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double matriz[][]=new double[10][10];
		int f, col=0 ;
		for(f=0;f<10;f++) {
			double	sumafila=0;
			for (col=0;col<10;col++) {
				matriz[f][col]=Math.random()*11-5;
				sumafila=sumafila+matriz[f][col];
				System.out.printf( "%2.3f ", matriz[f][col]);
				
			}//for2
			System.out.printf( " sumafila="+" %5.3f" ,sumafila);
			System.out.print("\n");//retorno o bien  System.out.println("") para que salgan en lineas
		}//for1s
		
			for(col=0;col<10;col++) {
			double	sumacol=0;
			for (f=0;f<10;f++) {
				sumacol=sumacol+matriz[f][col];
				
			}//f2
			System.out.printf( " sumacol="+" %5.3f" ,sumacol);
			
		}//fo1
	}//main

}//class
