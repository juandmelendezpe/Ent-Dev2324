package UT3.Entorno_Git;

import java.util.Random;
import java.util.Scanner;

public class array_String {

	private static final Persona[] CLIENTES = new Persona[2];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona persona = new Persona("Juan","melendez","z1234567",31); 
		
		Persona[]Lista1 =  new Persona[3];
		
	//	Random r = new Random()	;
		int contador =0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese Nombre");
		String nombre = sc.next();
		System.out.println("Ingrese apellidos :");
		String apellido = sc.next();
		System.out.println("Ingrese dni:");
		String dni = sc.next();
		System.out.println("Ingrese edad :");
		int edad = Integer.valueOf(sc.next());
		
		Persona lista_general = new Persona(nombre,apellido,dni,edad);
		if(contador !=Lista1.length) {
	
		for(int i = 0; i < Lista1.length;i++) {
			Lista1[i]= new Persona(nombre,apellido,dni,edad);
						contador++;
						
						System.out.println(Lista1[i]+ " ");	
					}
					
		}

	}

}
