package Fundamentos;

import java.util.Scanner;

/*
Celsius para Fahrenheit: (Celsius×9/5)+32=Fahrenheit
Fahrenheit para Celsius: (Fahrenheit-32)*5/9=Celcius
 */

public class ConversaoCelsius {
	
	static double celcius;
	static double fahrenheit;
		
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); // aqui instanciei a classe
	
	System.out.println("Entre com a Temperatura em Celcius: ");
	double celcius = teclado.nextDouble();
		
	celcius = (celcius*9/5)+32;
	//System.out.println();
	System.out.println("Temperatura em Farenheit: " + celcius + "°");
	System.out.println();
	}
}