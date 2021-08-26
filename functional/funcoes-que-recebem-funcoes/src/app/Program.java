package app;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import services.ProductService;

public class Program {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD", 80.90));
		
		ProductService ps = new ProductService();
		
		//transferindo a condição de dentro da função filteredSum para o argumento dela Predicate<Type>
		double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
		double sumPrice = ps.filteredSum(list, p -> p.getPrice() < 1000);
		
		System.out.println("Sum: " + String.format("%.2f", sum));
		System.out.println("Sum Prices: " + String.format("%.2f", sumPrice));
	}
}
