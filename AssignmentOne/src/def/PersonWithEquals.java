package def;

public class PersonWithEquals {
	public String name;
	public String email;
	public String phoneNumber;
	
	PersonWithEquals(String name,String email,String phoneNumber){
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	PersonWithEquals(){
		this.name = "Nikhil";
		this.email = "ghind20@gmail.com";
		this.phoneNumber = "7021197094";
	}
	
	@Override
	public boolean equals(Object obj){
		PersonWithEquals p = (PersonWithEquals)obj;
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
	
}

