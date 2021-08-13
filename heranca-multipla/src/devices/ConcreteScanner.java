package devices;

public class ConcreteScanner extends Device implements Scanner {
	
	public ConcreteScanner(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void proccessDoc(String doc) {
		System.out.println("Scanner processing: " + doc);		
	}
	
	@Override
	public String scan() {
		return "Scanned content";
	}
}
