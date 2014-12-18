import java.util.*;
import java.io.*;

public class Ejercicio2 {

public static void main (String args[]) throws IOException{		
		
		int num1, num2, num3, num4, num5;

		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		System.out.println("Introduce 5 numeros al azar: ");

		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		num5 = sc.nextInt();

		numeros.add(num1);
		numeros.add(num2);
		numeros.add(num3);
		numeros.add(num4);
		numeros.add(num5);

		System.out.println("Arraylist en estos momentos: ");

		for  (int x = 0; x < numeros.size(); x++){
  		System.out.println(numeros.get(x));}

  		Collections.sort(numeros);

  		/*for(int i=0;i<(numeros.size()-1);i++){
			for(int j=i+1;j<numeros.size();j++){
				if(numeros.get(i)>numeros.get(j)){
					//Intercambiamos valores
					int ordenauta = numeros.get(i);
					numeros.get(i)=numeros.get(j);
					numeros.get(j)=ordenauta;

				}
			}
		}*/
  		System.out.println("Arraylist ordenado: ");

		for  (int x = 0; x < numeros.size(); x++){
  		System.out.println(numeros.get(x));}
  	}
}