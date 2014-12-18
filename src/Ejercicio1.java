import java.util.*;
import java.io.*;

public class Ejercicio1 {

public static void main (String args[]) throws IOException{		
		Scanner sc = new Scanner(System.in);

		
		int[] numeros = new int[5];

		System.out.println("Introduce 5 numeros al azar: ");

		numeros[0]= sc.nextInt();
		numeros[1]= sc.nextInt();
		numeros[2]= sc.nextInt();
		numeros[3]= sc.nextInt();
		numeros[4]= sc.nextInt();

		System.out.println("Array en estos momentos: ");

		for  (int x = 0; x < numeros.length; x++){
  		System.out.println(numeros[x]);}

  		for(int i=0;i<(numeros.length-1);i++){
			for(int j=i+1;j<numeros.length;j++){
				if(numeros[i]>numeros[j]){
					//Intercambiamos valores
					int ordenauta = numeros[i];
					numeros[i]=numeros[j];
					numeros[j]=ordenauta;

				}
			}
		}
  		System.out.println("Array ordenado: ");

		for  (int x = 0; x < numeros.length; x++){
  		System.out.println(numeros[x]);}
  	}
}