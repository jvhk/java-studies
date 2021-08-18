package app;

public class Program {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Maria", "maria@gmail.com");
		Cliente c2 = new Cliente("Alex", "alex@gmail.com");
		
		System.out.println("hascode: " +  c1.hashCode());
		System.out.println("hascode: " +  c2.hashCode());
		
		System.out.println("equals: " +  c1.equals(c2));
	}
}
