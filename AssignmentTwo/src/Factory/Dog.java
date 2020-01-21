package Factory;

public class Dog extends Animal{
	public String a;
	public Dog() {
		a = "Dog";
	}
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public void makeSound() {
		System.out.println("Bow");
	}
}
