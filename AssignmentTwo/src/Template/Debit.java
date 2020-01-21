package Template;

public class Debit extends ChargeTemplate{

	@Override
	public void validation() {
		System.out.println("MAking validation for Debit cards");
		
	}

	@Override
	public void setPrice() {
		System.out.println("Lets set price");
		
	}

	@Override
	public void checkBalance() {
		System.out.println("check balance");
		
	}

}
