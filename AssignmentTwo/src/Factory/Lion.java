package Factory;

public class Lion extends Animal{
	public String a;
	public Lion() {
		a = "Lion";
	}
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public void makeSound() {
		System.out.println("Roar");
	}
}
