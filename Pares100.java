package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pares100 {

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

		        // Lista para armazenar os números pares
		        List<Integer> numerosPares = new ArrayList<>();

		        // Filtrando números pares
		        for (int numero : numeros) {
		            if (numero % 2 == 0) {
		                numerosPares.add(numero);
		            }
		        }

		        // Exibindo os números pares e seus índices
		        System.out.println("\nNúmeros pares:");
		        for (int i = 0; i < numerosPares.size(); i++) {
		            System.out.println("Index " + i + ": " + numerosPares.get(i));
		        }

		        scanner.close();
		    }
		}

