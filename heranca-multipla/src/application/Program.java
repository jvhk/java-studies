package application;

import devices.ComboDevice;
import devices.ConcretePrinter;
import devices.ConcreteScanner;

public class Program {
	public static void main(String[] args) {
		ConcretePrinter p = new ConcretePrinter("1080");
		p.proccessDoc("My letter");
		p.print("My letter");
		
		System.out.println();
		ConcreteScanner s = new ConcreteScanner("2003");
		s.proccessDoc("My email");
		System.out.println("Scan result: " + s.scan());
		
		System.out.println();
		ComboDevice c = new ComboDevice("2081");
		c.proccessDoc("My dissertation");
		c.print("My dissertation");
		System.out.println("Result: "+ c.scan());
		
	}
}
