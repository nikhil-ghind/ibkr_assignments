package def;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AssignmentOne {
	static int count = 0;
	public static void main(String[] args) {
		//Person p1 = new Person("mohit","mohit@gmail.com","7021197094",1);
		//This will generate false
		//Person p2 = new Person("chirag","chirag@gmail.com","7744824253",2);
		//This will generate true
		//Person p2 = new Person("mohit","mohit@gmail.com","7021197094",1);
		//System.out.println(p1.equals(p2));
		Set<Person> hs = new HashSet<Person>();
		hs.add(new Person("nikhil","ghind20@gmail.com","7021197094",1));
		
		hs.add(new Person("chirag","chirag@gmail.com","7744824253",2));
		//Added a new object with same hashCode as above object
		hs.add(new Person("mohit","20@gmail.com","7021197094",1));
		
		
		Iterator<Person> it = hs.iterator();
		//Even though we added 3 elements it still shows 2 as the count as hashCode throws same for 2 objects
		System.out.println(hs.size());
		
		//Printing only 2 objects
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		//These objects have hashCodes
		PersonWithEquals p1 = new PersonWithEquals("mohit","mohit@gmail.com","7021197094");
		PersonWithEquals p2 = p1;
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		Set<PersonWithEquals> st = new HashSet<>();
		st.add(p1);
		st.add(p2);
		
		//Prints count to be 1;
		System.out.println(st.size());
		
		PersonWithHashCode p3 = new PersonWithHashCode("mohit","mohit@gmail.com","7021197094");
		PersonWithHashCode p4 = p3;
		
		//throwing same hashCode hence equal
		System.out.println(p3.equals(p4));
		
		PersonWithHashCode p5 = new PersonWithHashCode("nikhil","nikhl@gmail.com","7021197094");
		
		Set<PersonWithHashCode> hpc = new HashSet<>();
		
		//only 2 will be added
		hpc.add(p3);
		hpc.add(p4);
		hpc.add(p5);
		
		System.out.println(hpc.size());
		
		//Only two objects printed
		Iterator<PersonWithHashCode> its = hpc.iterator();
		while(its.hasNext()) {
			System.out.println(its.next());
		}
	}

}

