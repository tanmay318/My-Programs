package HierachicalInheritance.EX1;

public class Test {
public static void main(String[] args) {
	Employee obj = new Employee ();
	obj.name = "Tanmay";
	obj.age = 26;
	obj.ph = 387791589;
	obj.Specialization = "Java";
	Manager m1 = new Manager();
	m1.name = "Micky";
	m1.age = 21;
	m1.ph = 310448348;
	m1.department = "HR";
	System.out.println(obj.name);
	System.out.println(obj.age);
	System.out.println(obj.ph);
	System.out.println(obj.Specialization);
	System.out.println(m1.name);
	System.out.println(m1.age);
	System.out.println(m1.ph);
	System.out.println(m1.department);
	
	
}
}
