package exercicio;
import java.util.Scanner;

public class numeroMaior {
	/*
	 * Código que le dois numeros é informa qual é o maior.
	 * 
	 * @author Andrei Luís Amancio
	 */
	 public static void main(String[] args) {
		 
		 
		 int x;
		 int y;
		 Scanner digitando = new Scanner(System.in);
		 System.out.println("entre com o primeiro numero:");
		 int x1 = digitando.nextInt();
		 
		 System.out.println("entre com o segundo nunmero: ");
		 int y1 = digitando.nextInt();
		 
		 
		 if (x1 > y1){
			 System.out.println("o numero "+x1+" é maior" );
		 }else{
			 System.out.println("o numero "+y1+ "é maior");
		 }
	 }
	 

}
