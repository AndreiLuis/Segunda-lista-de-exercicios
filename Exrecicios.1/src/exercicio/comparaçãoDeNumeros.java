package exercicio;

import java.util.Scanner;

public class comparaçãoDeNumeros {
	
	/*Código que compara dois numeros e informa quem é o maior.
	 * 
	 * @author Andrei Luís Amancio
	 */
	
	public static void main (String[] arg){
		
		int num1;
		int num2;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int num11 = s.nextInt();
		
		System.out.println("Digte o segundo numero");
		int num21 = s.nextInt();
		
		
		if ( num11 > num21 ){
			System.out.println("O nomero "+ num11 +" é o maior");
		}else{
		System.out.println("O numero "+ num21 +" é o maior");
		}
		
	}

}
