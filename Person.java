// this is a base class named 'Person' and extends by a class named 'Student'

public class Person
{
    private String name;
	public Person(){
	name = "no name yet";
	}
	
	public Person(String initialname){
	name = initialname;
	}
	
	public void setName(String newName){
	name= newName;
	}
	
	public String getName(){
	return name;
	}
	
	public void writeOutput(){
	System.out.println("Name:" + name);
	}
	public boolean sameName(Person otherPerson){
	return (this.name.equalsIgnoreCase(otherPerson.name));
	}
}
