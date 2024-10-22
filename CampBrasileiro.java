package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class CampBrasileiro {
   
		   //a classe time armazena os valores "nome" e "pontos"
		    static class Time {
		        String nome;
		        int pontos;
		        int vitorias;

		        // quando a classe time cria um nome objeto, sao inicializados os atributos "nome" e "pontos"
		        Time(String nome, int pontos, int vitorias) {
		            this.nome = nome;
		            this.pontos = pontos;
		            this.vitorias = vitorias;
		        }
		    }

		    public static void main(String[] args) {
		        //array time mostrando os nomes, pontos e vitorias
		        Time[] classificacao = {
		            new Time("Botafogo", 61, 18),
		            new Time("Palmeiras", 60, 18),
		            new Time("Fortaleza", 56, 16),
		            new Time("Flamengo", 51, 15),
		            new Time("São Paulo", 50, 15),
		            new Time("Internacional", 49, 13),
		            new Time("Bahia", 46, 13),
		            new Time("Cruzeiro", 44, 12),
		            new Time("Atlético-MG", 41, 10),
		            new Time("Vasco", 37, 10),
		            new Time("Criciúma", 36, 9),
		            new Time("Grêmio", 35, 10),
		            new Time("Bragantino", 34, 8),
		            new Time("Juventude", 34, 8),
		            new Time("FLuminese", 33, 9),
		            new Time("Vitória", 32, 9),
		            new Time("Corinthians", 32, 7),
		            new Time("Athletico-PR", 31, 8),
		            new Time("Cuiabá", 27, 6),
		            new Time("Atlético-GO", 22, 5),
		        };
		        
		        // ordena por pontos
		        Arrays.sort(classificacao, new Comparator<Time>() {
		            @Override
		            public int compare(Time t1, Time t2) {
		                if (t1.pontos != t2.pontos) {
		                    //faz a comparação por pontos
		                    return Integer.compare(t2.pontos, t1.pontos);
		                } else {
		                   //faz a comparação por numero de vitorias
		                    return Integer.compare(t2.vitorias, t1.vitorias);
		                }
		            }
		        });
		        // exibe a tabela de classificação no terminal em ordem de pontos e, se necessario, vitorias
		        System.out.println("Campeonato Brasileiro 2024)");
		        for (int i = 0; i < classificacao.length; i++) {
		            System.out.println((i + 1) + ". " + classificacao[i].nome + " - " + classificacao[i].pontos + " pontos");
		        }
		    }
		


	}
