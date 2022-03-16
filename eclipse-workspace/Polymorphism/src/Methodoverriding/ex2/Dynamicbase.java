package Methodoverriding.ex2;

public class Dynamicbase {
 protected String val;
 void display(String str) {
	 val="Base class Function".concat(str);
	 System.out.println(val);
 }
}
