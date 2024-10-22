package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Crescente50 {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		        // Criando um array para armazenar 50 números
		        int[] numeros = new int[50];

		        // Solicitando que o usuário insira os números
		        System.out.println("Digite 50 números:");
		        for (int i = 0; i < 50; i++) {
		            System.out.print("Número " + (i + 1) + ": ");
		            numeros[i] = scanner.nextInt();
		        }

		        // Ordenando o array em ordem crescente
		        Arrays.sort(numeros);

		        // Exibindo os números ordenados
		        System.out.println("\nNúmeros em ordem crescente:");
		        for (int i = 0; i < numeros.length; i++) {
		            System.out.println("Index " + i + ": " + numeros[i]);
		        }

		        scanner.close();


	}

}
