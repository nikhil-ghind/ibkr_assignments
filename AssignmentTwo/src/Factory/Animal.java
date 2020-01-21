package Factory;

public abstract class Animal {
	public String a;
	abstract void makeSound();
	public void eat() {
		System.out.println("We all eat vegetarian food");
	}
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
}
