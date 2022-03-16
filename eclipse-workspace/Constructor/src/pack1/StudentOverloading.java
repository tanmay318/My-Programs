package pack1;

public class StudentOverloading {
	public static void main(String args[]) {
		// This object creation would call the default constructor
	StudentData myobj = new StudentData();
	System.out.println("Student Name is: " + myobj.getStuName());
	System.out.println("Student Age is: " + myobj.getStuAge()); 
	System.out.println("Student ID is: " + myobj.getStuID());
		/*
		* This object creation would call the parameterized constructor
		* StudentData(int, String, int)
		*/
StudentData myobj2 = new StudentData(555, "javabykiran", 25);
System.out.println("Student Name is: " + myobj2.getStuName()); 
System.out.println("Student Age is: " + myobj2.getStuAge());
System.out.println("Student ID is: " + myobj2.getStuID());
		}
		}

