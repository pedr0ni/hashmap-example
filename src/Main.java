import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	private static HashMap<String, Integer> pessoaIdade = new HashMap<>(); //Cria a HashMap
	
	public static void main(String[] args) {
		
		pessoaIdade.put("Matheus", 17); //Adiciona o a chave e o valor na HashMap
		pessoaIdade.put("João", 18);
		pessoaIdade.put("Fulano", 32);
		
	}
	
	private static void pedirNomes() {
		Scanner s = new Scanner(System.in);
		while (true) {
					
			System.out.println("Escolha um nome para ver a idade: ");
			String nome = s.nextLine(); //Recebe o valor do Scanner
					
			if (pessoaIdade.containsKey(nome)) { //Verifica se contem a chave na HashMap
						
				int idade = pessoaIdade.get(nome); //Recebe o valor da HashMap
						
				System.out.println(nome + " tem " + idade + " anos."); //Imprime o valor
						
			} else { //Caso não localizar a chave.
						
				System.out.println("Chave não localizada na HashMap.");
			}
					
		}
	}
	
	private static void imprimirNomes() {
		for (String nomes : pessoaIdade.keySet()) { //Passa por todas chaves
			System.out.println(nomes);
		}
	}
	
	private static void imprimirValores() {
		for (int idades : pessoaIdade.values()) { //Passa por todos os valores
			System.out.println(idades);
		}
	}
	
	private static void remover(String chave) {
		pessoaIdade.remove(chave); //Remove valor da HashMap
	}

}
