package view;

import java.util.Scanner;

import controller.RepeteDois;

public class Principal {

	public static void main(String[] args) {
		RepeteDois repete = new RepeteDois();		
		Scanner entrada = new Scanner(System.in);
		int n = 0;
		while(n < 10 || n > 999999) {
			System.out.println("Digite um valor de 10 a 999999:" );
			n = entrada.nextInt();
		}
		String dois = Integer.toString(n);
		dois = dois.substring(1,2);
		int two = Integer.parseInt(dois);
		int resposta = repete.repeteDois(n, two);
		System.out.println("O número " + two + " aparece " + resposta + " vezes no número digitado.");
		entrada.close();
	}

}
