package Template;

public class Main {
	public static void main(String args[]) {
		ChargeTemplate ct = null;
		String str = "Debit";
		if(str.equalsIgnoreCase("DEBIT")) {
			ct = new Debit();
		}else {
			ct = new Credit();
		}
		ct.completePaymemt();
	}
}
