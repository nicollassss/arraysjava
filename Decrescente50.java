package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Decrescente50 {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        
		        // Criando um array para armazenar 50 números
		        Integer[] numeros = new Integer[50]; // Usamos Integer para permitir Collections.reverseOrder()

		        // Solicitando que o usuário insira os números
		        System.out.println("Digite 50 números:");
		        for (int i = 0; i < 50; i++) {
		            System.out.print("Número " + (i + 1) + ": ");
		            numeros[i] = scanner.nextInt();
		        }

		        // Ordenando o array em ordem decrescente
		        Arrays.sort(numeros, Collections.reverseOrder());

		        // Exibindo os números ordenados
		        System.out.println("\nNúmeros em ordem decrescente:");
		        for (int i = 0; i < numeros.length; i++) {
		            System.out.println("Index " + i + ": " + numeros[i]);
		        }

		        scanner.close();
		    }
		}
