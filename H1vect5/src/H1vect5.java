/*5. Generar dos vectores de dimensi�n 10 (dar valores aleatorios entre 1 y 5 a cada elemento) y
comprobar para cada uno de los elementos del primer vector cu�ntas veces est� en el segundo,
es decir para
 vector1= {3,7,2}
 vector2= {3,3,5}
 el resultado debe ser:
 elemento 1 : 2 veces
 elemento 2 : 0 veces
 elemento 3 : 0 veces*/
import java.util.*;
public class H1vect5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int v1[]= new int[10];
int v2[]= new int[10];

int indice1,indice2,conta ;

// incializacion vector1
System.out.println("vector1");
for(indice1=0;indice1<10;indice1++){
	v1[indice1]=(int)Math.floor(Math.random()*4+1);
	System.out.print("  " + v1[indice1]);
	}
System.out.println();


//incializacion vector2
System.out.println("vector2");
for(indice1=0;indice1<10;indice1++){
	v2[indice1]=(int)Math.floor(Math.random()*4+1);
	System.out.print("  " + v2[indice1]);
	}

System.out.println();

	for(indice1=0;indice1<10;indice1++){
		conta=0;
		for(indice2=0;indice2<10;indice2++){
			// System.out.println(v1[indice1] ,v2[indice2]);
			// System.out.print("\n");
			 if(v1[indice1]==v2[indice2]){
				 conta++;
				 }
		}//f2
		System.out.println(" El elemento de  "  +v1[indice1]  + " del vector 1 aparece "  + conta + " veces en el vector 2");
}//f1
	}

}
