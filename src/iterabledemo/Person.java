package iterabledemo;

public class Person {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	/*public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}*/
	public String toString(){
		return name+"..."+age;
	}
	public Person(){}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
