package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;
import service.CalculationService;

public class Program {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		String path = "c:\\tmp\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			Product x = CalculationService.max(list);
			System.out.println("Most expensive price: ");
			System.out.println(x.getPrice());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
