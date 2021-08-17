package app;

import java.util.Arrays;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		List<Integer> myIntList = Arrays.asList(5, 2, 10);
		printList(myIntList);
		
		System.out.println();
		
		List<String> strList = Arrays.asList("A", "B", "C");
		printList(strList);
	}
	
	public static void printList(List<?> list) {
		//list.add(3) not works
		for(Object  obj : list) {
			System.out.println(obj);
		}
	}
}
