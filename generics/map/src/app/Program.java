package app;

import java.util.Map;
import java.util.TreeMap;

public class Program {
	public static void main(String[] args) {
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Maria");	//key / value
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "997111222");
		
		cookies.remove("email");
		
		cookies.put("phone", "997111333");
		
		System.out.println("Contains key 'phone' ? " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		
		System.out.println("Size: " + cookies.size());
		
		System.out.println("ALL COOKIES");
		
		for(String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
	}
}
