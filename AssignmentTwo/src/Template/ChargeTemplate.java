package Template;

abstract class ChargeTemplate {
	public abstract void validation();
	public abstract void setPrice();
	public abstract void checkBalance();
	public void completePaymemt() {
		validation();
		setPrice();
		checkBalance();
	}
}
