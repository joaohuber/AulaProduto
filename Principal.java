package aulaProduto;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter Product Data: ");
		
		System.out.print("Name: ");
		product.nome = input.nextLine();
		System.out.print("Quantity: ");
		product.quantidade = input.nextInt();
		System.out.print("Price: ");
		product.price = input.nextDouble();
		
		System.out.println(product);
		int escolha;
		
		do {
		System.out.println("Opções:");
		System.out.println("1. Para adicionar mais quantidade ao produto");
		System.out.println("2. Para adicionar mais quantidade ao produto");
		escolha= input.nextInt();
		
		
		switch(escolha) {
		case 1:
			System.out.print("Numero de produtos adicionados no estoque: ");
			int x = input.nextInt();
			product.addProduct(x);
			System.out.println(product);
			break;
			
		case 2:
			System.out.print("Numero de produtos retirados do estoque: ");
			x = input.nextInt();
			product.removeProduct(x);
			System.out.println(product);
			break;
			
		default:
			System.out.println("numero invalido...");
		}
		} while(escolha <= 3);
		
		input.close();
	}

}
