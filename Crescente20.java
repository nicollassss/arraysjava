package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Crescente20 {

	
	public class Main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        //array para armazenar os 20 nomes
	        String[] nomes = new String[20];

	        // solicita ao usuario a digitação dos 20 nomes
	        System.out.println("Digite 20 nomes:");
	        for (int i = 0; i < 20; i++) {
	            System.out.print("Nome " + (i + 1) + ": ");
	            nomes[i] = scanner.nextLine();
	        }

	        //ordena a array para que sejam mostrados os nomes em ordem descrescente utilizando .reverseOrder
	        Arrays.sort(nomes, Collections.reverseOrder());

	        //exibe os nomes
	        System.out.println("\nNomes em ordem decrescente:");
	        for (int i = 0; i < nomes.length; i++) {
	            System.out.println(" " + i + ": " + nomes[i]);
	        }

	        scanner.close();
	    }
	}
}
