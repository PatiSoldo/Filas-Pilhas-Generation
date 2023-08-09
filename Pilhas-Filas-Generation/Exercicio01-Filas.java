package filaQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio01 {

	private static Scanner scanner;

	public static void main(String[] args) { 
		/*Programa para orzanizar a ordem de chagada dos cliente de um banco. Contém um menu com 4 opções
		 * OBS: Caso a fila esteja vazia,o programa deverá informar que a fila está vazia ao tentar retirar um cliente da fila.*/
		
		Queue<String> fila = new LinkedList<>();
		Scanner leia = new Scanner(System.in);
		int opcao;
		
		do {
		System.out.println("\n\t\t Menu de opções: ");
		System.out.println("\n---------------------------------------------");
		System.out.println("\n1- Adicionar um novo cliente na fila");
		System.out.println("\n2- Lista de todos os clientes na fila");
		System.out.println("\n3- Retirar um cliente da fila");
		System.out.println("\n0- Finalizar e sair");
		System.out.println("\n---------------------------------------------");
		System.out.println("\nEscolha uma opção: ");
		opcao = leia.nextInt();
		
		
		switch (opcao) {
		case 1:
			System.out.println("\nDigite o nome do cliente por favor: ");
			fila.add(leia.next());
			System.out.println("\nCliente adicionado à fila.");
			break;
			
		case 2 :
			if(fila.isEmpty()) {
				System.out.println("A fila está vazia.");
			}else {
				System.out.println("\nTodos os clientes na fila."+fila);
			}
			 break;
		case 3 :
			if(fila.isEmpty()){
				System.out.println("A fila está vazia. ");
				
			}else {
				System.out.println("Cliente "+ fila.poll()+ "foi retirado da fila.");
			}
			break;
			
		case 0:
			System.out.println("\nObrigado e volte sempre que precisar!");
			break;
			
			default:
				System.out.println("Opção inválida!Escolha uma das opções do menu, para que possamos te ajudar.");
				break;
			}
		}   while(opcao !=0);
		
		scanner.close();	
		}
		
}
