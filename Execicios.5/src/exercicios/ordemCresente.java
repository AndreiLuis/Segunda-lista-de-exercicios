package exercicios;

import java.util.Scanner;

public class ordemCresente {
	/*
	 * Código que le dois numeros (A e B) e organiza na ordem
	 *  cresente aonde o numero A é o primeiro.
	 *  
	 *  @author Andrei Luís Amancio
	 */
	
	public static void main(String[] args) {
      int A = 0;
      int B = 0;
      Scanner nx = new Scanner(System.in);
      System.out.println("Entre com o primeiro numero: "); 
      int A1 = nx.nextInt();
      System.out.println("Entre com o segundo numero: ");
      int B1 = nx.nextInt();
      
     if (A1 < B1){
    	  System.out.println("A ordem é primeiro o numero "+A1+" e "+B);
      }else{
    	  System.out.println("Ordem incorreta");
      }
	}	

}