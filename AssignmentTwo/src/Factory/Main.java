package Factory;

public class Main {
	public static void main(String args[]) {
		Animal an = AnimalFactory.makeAnimal("cat");
		System.out.println(an.getA());
	}
}
