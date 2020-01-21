package Factory;

public class AnimalFactory {
	public static Animal makeAnimal(String str) {
		if(str.equalsIgnoreCase("CAT")) {
			return new Cat();
		}
		if(str.equalsIgnoreCase("DOG")) {
			return new Dog();
		}
		if(str.equalsIgnoreCase("LION")) {
			return new Lion();
		}
		return new Animal() {
			public void makeSound() {
				System.out.println("Generic Object");
			}
		};
		
	}
}