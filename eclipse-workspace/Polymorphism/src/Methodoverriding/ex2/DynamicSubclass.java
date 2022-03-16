package Methodoverriding.ex2;

public class DynamicSubclass extends Dynamicbase {
		void display(String str) {
			if (val ==null) {
				val ="Derived Class Function".concat(str);
				System.out.println(str);
			}
		}
	
}
