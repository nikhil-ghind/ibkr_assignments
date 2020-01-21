package Factory;

public class Cat extends Animal{
	public String a;
	public Cat() {
		a = "Cat";
	}
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public void makeSound() {
		System.out.println("Meow");
	}
}
