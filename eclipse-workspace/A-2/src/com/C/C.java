package com.C;
import com.B.*;
public class C {
public void m3 () {
	System.out.println("class");
}
public static void main(String[] args) {
	B obj2 = new B();
	obj2.m2();
	C obj3 = new C();
	obj3.m3();
}
}
