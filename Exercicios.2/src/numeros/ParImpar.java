package numeros;

import java.util.Scanner;

public class ParImpar {
	
	/*
	 * Código que le o numero é informa se o numero é par ou impar.
	 * 
	 * @author Andrei Luís Amancio
	 */
	 
	
	public static void main(String[] args) {

	
		double num;
	    
	    
		Scanner valor = new Scanner (System.in);
		
		System.out.println("Digite um numero de 1 a 10: ");
		num = valor.nextInt();
		
		
		if (num == 2){
			System.out.println("O numero digitado é par");
		}
		if(num == 4){
			System.out.println("O numero digitado é par");
		}
		if(num == 6){
			System.out.println("O numero digitado é par");
		}
		if(num == 8){
			System.out.println("O numero digitado é par");
		}
		if(num == 10){
			System.out.println("O numero digitado é par");
		}else{
			System.out.println("O numero digitado é ímpar");
		}
}

}