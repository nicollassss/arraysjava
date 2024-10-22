package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Impares100 {

	public static void main(String[] args) {
	
		        Scanner scanner = new Scanner(System.in);
		        
		        // Criando um array para armazenar 100 números
		        int[] numeros = new int[100];
		        
		        // Solicitando que o usuário insira os números
		        System.out.println("Digite 100 números:");
		        for (int i = 0; i < 100; i++) {
		            System.out.print("Número " + (i + 1) + ": ");
		            numeros[i] = scanner.nextInt();
		        }

		        // Lista para armazenar os números ímpares
		        List<Integer> numerosImpares = new ArrayList<>();

		        // Filtrando números ímpares
		        for (int numero : numeros) {
		            if (numero % 2 != 0) { // Verifica se o número é ímpar
		                numerosImpares.add(numero);
		            }
		        }

		        // Exibindo os números ímpares e seus índices
		        System.out.println("\nNúmeros ímpares:");
		        for (int i = 0; i < numerosImpares.size(); i++) {
		            System.out.println("Index " + i + ": " + numerosImpares.get(i));
		        }

		        scanner.close();
		    

	}

}
