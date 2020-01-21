package def;

public class PersonWithHashCode {
	public String name;
	public String email;
	public String phoneNumber;
	public int id;
	
	PersonWithHashCode(String name,String email,String phoneNumber){
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		AssignmentOne.count++;
		this.id = AssignmentOne.count;
	}
	PersonWithHashCode(){
		this.name = "Nikhil";
		this.email = "ghind20@gmail.com";
		this.phoneNumber = "7021197094";
	}
	
	@Override
	public int hashCode() {
		return id;
	}
	
	@Override
	public String toString() {
		return this.name + this.email + this.phoneNumber;
	}
}
