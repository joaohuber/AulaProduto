package aulaProduto;

import java.util.Scanner;

public class Product {
	Scanner input = new Scanner(System.in);

	public String nome;
	public int quantidade;
	public double price;
	
	public double totalValueInStock() {
		return quantidade * price;
	}
	
	public void addProduct(int quantidade) {
		this.quantidade += quantidade;
		
	}
	public void removeProduct (int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return "Product Data: " 
					+ nome 
					+ ", " 
					+ quantidade 
					+ " uni, $" 
					+ String.format("%.2f", price) 
					+ ", Total: $" 
					+ String.format("%.2f",totalValueInStock());
	}
	
}
