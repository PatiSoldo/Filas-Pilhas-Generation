package pilhaStack;

import java.util.Scanner;
import java.util.Stack;

public class Atividade01 {

	private static Object livro;

	public static void main(String[] args) {
		/*Programa para organizar a retirada de livros em uma pilha.Com menu contendo 4 opções
		 * OBS:Caso a pilha esteja vazia e o atendente tente retirar um livro da pilha, deverá informar que a pilha está vazia*/
		
		Stack<String> pilhaLivros = new Stack<>();
		Scanner leia = new Scanner (System.in);
		
		int opcao;
		do {
		System.out.println("\n\t\t Menu de opções: ");
		System.out.println("\n---------------------------------------------");
		System.out.println("\n1- Adicionar um novo livro.");
		System.out.println("\n2- Lista de todos os livros da pilha:");
		System.out.println("\n3- Retirar um livro da pilha");
		System.out.println("\n0- Finalizar e sair");
		System.out.println("\n---------------------------------------------");
		System.out.println("\nEscolha uma opção: ");
		opcao = leia.nextInt();
		leia.nextLine();
		
		switch(opcao) {
		case 1: 
			System.out.println("\nDigite o nome do livro por favor:");
			String nomedolivro =leia.nextLine();
			pilhaLivros.push(nomedolivro);
			System.out.println("\nLivro adicionado à pilha: ");
			break;
		case 2:
			if(pilhaLivros.isEmpty()) {
				System.out.println("A pilha está vazia.");
			}else {
				System.out.println("\nLivros na pilha: ");
				for(String livro : pilhaLivros) {
					System.out.println(livro);
				}
			}
		   break;
		case 3: 
			if(pilhaLivros.isEmpty()) {
			  System.out.println("A pilha está vazia.");
		    }else{
		    	String livroRetirado = pilhaLivros.pop();
		    	System.out.println("Livro retirado: "+livroRetirado);
		    		
		    	}
		    	break;
		    	
		case 0:
			System.out.println("\nObrigado e volte sempre!");
			break;
		    
		default:
			System.out.println("Opção inválida!Escolha novamente.");
		}
		  
	}while (opcao!=0);
	
	leia.close();
	}
}
	

