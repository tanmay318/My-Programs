package test;

public class Program8 {
int a = 10;
int b = 20;
float c;
void display (float ans) {
	System.out.println(ans);
}
void add() {
	c=a+b;
	display(c);
}
void sub () {
	c= a-b;
	display (c);
}
void mul() {
	c= a*b;
	display (c);
}
void div() {
	c = a/b;
	display(c);
}
public static void main(String[] args) {
	Program8 obj = new Program8 ();
    obj.add();
	obj.sub();
	obj.mul();
	obj.div();
}
}
