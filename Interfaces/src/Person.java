
public class Person implements Info {
String  name;

public Person(String name) {
	this.name = name;
}

@Override
public void showInfo() {
	// TODO Auto-generated method stub
	System.out.println("My name is" + name);
}
}
