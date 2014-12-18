import java.util.*;
import java.io.*;

public class Ejercicio3 {

public static void main (String args[]) throws IOException{		
		
		String i, m, e, b, a, s, iz1, izb, eran;
		ArrayList<String> izenak = new ArrayList<String>();

		Scanner sc = new Scanner(System.in);

		

		do {

			System.out.println("¿Que quieres hacer? \n - Introducir dato (i) \n - Modificar dato (m) \n - Eliminar dato (e) \n - Buscar dato (b) \n - Mostrar datos (a) \n - Salir (s)");
			eran = sc.next();

		switch (eran){

			case "i":

				System.out.println("Introduce el nombre que quieras: ");
				iz1 = sc.next();
				izenak.add(iz1);
				break;

			case "m":

				System.out.println("Arraylist en estos momentos: ");

				for (int x = 0; x < izenak.size(); x++){
  				System.out.println(izenak.get(x));}

				System.out.println("¿Que nombre quieres modificar? ");
  				iz1 = sc.next();
  				System.out.println("Inserta el nombre nuevo: ");
  				izb = sc.next();

  				for  (int y = 0; y < izenak.size(); y++){
  						String pos = izenak.get(y);
  						if(pos.equals(iz1)){
  						izenak.set(y, izb);
  						}
  				}

  				break;

  			case "e":

  				System.out.println("Arraylist en estos momentos: ");

				for (int x = 0; x < izenak.size(); x++){
  				System.out.println(izenak.get(x));}

				System.out.println("¿Que nombre quieres eliminar? ");
  				String ize = sc.next();
  				
  				for  (int y = 0; y < izenak.size(); y++){
  						String pos = izenak.get(y);
  						if(pos.equals(ize)){
  						izenak.remove(pos);
  						}

  				System.out.println("El nombre se ha eliminado: ");
  				for (int x = 0; x < izenak.size(); x++){
  				System.out.println(izenak.get(x));}
  				}

  			case "b":

  				System.out.println("Arraylist en estos momentos: ");

				for (int x = 0; x < izenak.size(); x++){
  				System.out.println(izenak.get(x));}

				System.out.println("¿Que nombre quieres buscar? ");
  				String izbi = sc.next();
  				
  				for  (int y = 0; y < izenak.size(); y++){
  						String pos = izenak.get(y);
  						if(pos.equals(izbi)){
  						System.out.println("El nombre que has buscado: ");
  						System.out.println(izbi);
  						}
  				}

  			case "a":

  				System.out.println("Arraylist en estos momentos: ");

				for (int x = 0; x < izenak.size(); x++){
  				System.out.println(izenak.get(x));}
  				
			}
		}
		while (!eran.equals("s"));

		
		/*
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
		}
  		System.out.println("Arraylist ordenado: ");

		for  (int x = 0; x < numeros.size(); x++){
  		System.out.println(numeros.get(x));}*/
  	}
}