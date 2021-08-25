package app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

public class Program {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD", 80.90));

		//map function
		List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
		
		names.forEach(System.out::println);
		
		
		
	}
}
