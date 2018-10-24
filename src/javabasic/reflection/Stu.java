package javabasic.reflection;

/**
 * 用于测试的学生类
 */
final class Stu {
	private int id;
	private String name;
	private int age;
	
	public Stu() {
		this.id = -1;
		this.name = "";
		this.age = -1;
	}
	
	public Stu(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	//Getters and Getters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	
}