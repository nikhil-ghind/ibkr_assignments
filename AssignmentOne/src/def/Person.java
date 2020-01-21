package def;


public class Person {
	public String name;
	public String email;
	public String phoneNumber;
	public int person_id;
	Person(String name,String email,String phoneNumber,int person_id){
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.person_id = person_id;
	}
	Person(){
		this.name = "Nikhil";
		this.email = "ghind20@gmail.com";
		this.phoneNumber = "7021197094";
	}
	
	@Override
	public boolean equals(Object obj) {
		Person p = (Person)obj;
		if(this == obj) {
			return true;
		}
		if(p == null) {
			return false;
		}
		if(this.hashCode() == p.hashCode()) {
			return true;
		}
		if(this.name.equals(p.name) && this.email.equals(p.email) && this.phoneNumber.equals(p.phoneNumber)) {
			return true;
		}
		return false;
	}
	@Override
	public int hashCode(){
		return person_id;
	}
	@Override
	public String toString() {
		return this.name + this.email + this.phoneNumber;
	}
	
}

