package pack1;

public class Data {
	private String Name;
	private int Phnumber;
	private int Age;
	 
	Data(){
		Name="Tanmay";
		Phnumber = 736287;
		Age = 26;
	}
	Data(String str,int a,int b){
		Name=str;
		Phnumber=a;
		Age=b;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
		//System.out.println();
	}
	public int getPhnumber() {
		return Phnumber;
		
	}
	public void setPhnumber(int phnumber) {
		Phnumber = phnumber;
		//System.out.println();
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
		//System.out.println();
	}
	

}
