package Singleton;

public class LateInitialisation {
	private static LateInitialisation obj = null;
	private LateInitialisation() {
		
	}
	public static LateInitialisation factory() {
		if(obj == null) {
			obj = new LateInitialisation();
		}
		return obj;
	}
}
