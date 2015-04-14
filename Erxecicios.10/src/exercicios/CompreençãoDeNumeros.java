package exercicios;

import java.util.Scanner;

public class CompreençãoDeNumeros {
	
	/*
	 * Classe que informa se o numero digitado pelo usuário está crompreendido entre
	 * 20 e 90 ou não.
	 * 
	 * @author Andrei Luís Amancio
	 */
	
	
	public static void main(String[] args) {
		
		int num;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("entre com um valor: ");
		int num1 = s.nextInt();
		
		if(num1 > 20 & num1 < 90){
			System.out.println("O numero digitado esta compreendido entre os dois valores");
		}else{
			System.out.println("O numero digitado não esta compreendido entreo os dois valores");
			System.out.println("Valores compreendidos somente entre 20 e 90");
		}
	}
}
