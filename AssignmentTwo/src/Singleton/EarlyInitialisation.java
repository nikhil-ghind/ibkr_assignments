package Singleton;

public class EarlyInitialisation {
	private static EarlyInitialisation obj = null;
	private EarlyInitialisation() {
		
	}
	public static EarlyInitialisation factoryEarlyInitialisation() {
		if(obj == null) {
			obj = new EarlyInitialisation();
		}
		return obj;
	}
	{
		obj = new EarlyInitialisation();
	}
}
