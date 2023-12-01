package project3;

public abstract class Person {
	private String name;
	private String gender;
	
	public Person(String name, String gender) {
		this.name=name;
		this.gender=gender;
	}
	public abstract void dowork(String work);
	
	public String getname() {
		return name;
	}
	public String getgender() {
		return gender;
	}

}
