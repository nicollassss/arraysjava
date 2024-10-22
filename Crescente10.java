package arrays;

import java.util.Arrays;
import javax.swing.JOptionPane;
// - Arrays permite que coloquemos as arrays no codigo
// - A classe JOptionPane permite que coloquemos uma caixa de dialogo (pertence a biblioteca swing)

public class Crescente10 {

	public static void main(String[] args) {
		
		String [] nomes = new String[10];
		//array para armazenar os 10 nomes
		
		for (int i = 0; i < 10; i++) {
			nomes [i] = JOptionPane.showInputDialog(null, "Digite o nome " + (i + 1) + ":");
		}
		//solicita os nomes
		
		Arrays.sort(nomes);
		//coloca os nomes em ordem alfabetica
		
		StringBuilder resultado = new StringBuilder("Nomes em ordem crescente:\n");
		for (String nome : nomes) {
			resultado.append(nome).append("\n");
		}
		//monta a string
	
		JOptionPane.showMessageDialog(null, resultado.toString(), " Nomes em ordem crescente", JOptionPane.INFORMATION_MESSAGE);
		//exibindo os nomes em ordem alfabetica
	}

}
