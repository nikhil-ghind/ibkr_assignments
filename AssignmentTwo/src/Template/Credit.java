package Template;

public class Credit extends ChargeTemplate {

	@Override
	public void validation() {
		System.out.println("Making Validation for credit card");
		
	}

	@Override
	public void setPrice() {
		System.out.println("Setting price for Credit card payment");
		
	}

	@Override
	public void checkBalance() {
		System.out.println("Checking balance");
		
	}

}
