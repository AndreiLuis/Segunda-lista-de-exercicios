package exercicios;

import java.util.Scanner;

public class Senha {
	
    /*
     *Código que permite o acesso da senha: BatataFrita.
     *
     * @author Andrei Luís Amancio
     */
      
	public static void main(String[] args) {
		Scanner tipo = new Scanner(System.in);
		
		String senha = "BatataFrita";
		
		System.out.println("Digiter a senha: ");
		String senha1 = tipo.next();

	    
		if ("BatataFrita".equals(senha1)){
			System.out.println("Acesso permitindo ^_^ ");
			
		}else{
			
			System.out.println("Acesso negado :(");
		}
		
		
	}
}
