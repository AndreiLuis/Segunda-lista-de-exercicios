package exercicios;

import java.util.Scanner;
/*
 * Classe que le três numeros e e organiza em ordem cresente.
 * 
 *@author Andrei Luís Amancio
 */
public class ordemCresente {
	
	public static void main(String[] args) {
	      int num1 = 0;
	      int num2 = 0;
	      int num3 = 0;
	      
	      Scanner nx = new Scanner(System.in);
	      System.out.println("Entre com o primeiro numero: "); 
	      int num11 = nx.nextInt();
	      System.out.println("Entre com o segundo numero: ");
	      int num21 = nx.nextInt();
	      System.out.println("Entre com o terceiro numero: ");
	      int num31 = nx.nextInt();
	     if (num11 < num21 < num31){
	    	  System.out.println("A ordem é primeiro o numero "+num11+" , "+num21+" e "+num31 );
	      }else{
	    	  System.out.println("Ordem incorreta");
	      }
		}	

}
