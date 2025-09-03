class Person6 implements Cloneable{
	public String name;
	public Integer age;
	
	public Person6(String name,Integer age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return this.name+" "+this.age;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
public class MarkerInterface {
	public static void main(String[] args) throws CloneNotSupportedException {
		Person6 p1 = new Person6("rohan", 33);
		System.out.println(p1.toString());
		Person6 p2 = (Person6)p1.clone();
		p2.age = 22;
		System.out.println(p2.toString());
	}
}
