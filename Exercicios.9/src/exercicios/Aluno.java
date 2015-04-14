package exercicios;

import java.util.Scanner;

public class Aluno {
	
	/*
	 * Código que calcula a media do aluno.
	 * 
	 * @author Andrei Luís Amancio
	 */
	public static void main(String[] args) {  
	
		
		float media = 0;
        float faltas = 0;
	    String nome;
	    int idade;
	    int RA;
        Scanner calculo = new Scanner (System.in);
	    
        System.out.println("Entre com o seu nome");
       String nome1 = calculo.next();
        System.out.println("Entre com sua idade");
        int idade1 = calculo.nextInt();
        System.out.println("Entre com o seu RA");
        int RA1 = calculo.nextInt();
        System.out.println("Coloque as suas faltas");
        float faltas1 = calculo.nextFloat();
        System.out.println("Coloque sua nota tirada do curso");
        float media1 = calculo.nextFloat();
        
        System.out.println("Aluno com o nome "+nome1 );
    	System.out.println("Idade: "+idade1);
    	System.out.println("e RA: "+RA1);
	    if  (media1 >= 7){
	    	System.out.println("O seu resultado é: aprovado (y)");
	    		
	    }else{
	    	if (faltas1 > 20 ){
	    		System.out.println("Aluno reprovado por mais de 25% do limite de faltas permitido");
	    	}else{
	    		if (media < 7){
	    			System.out.println("Aluno reprovado por esta com notas abaixo da média");
	    		}
	    	}
	    }
	    
	    
	}

	private static void next() {
		// TODO Auto-generated method stub
		
	}
}
