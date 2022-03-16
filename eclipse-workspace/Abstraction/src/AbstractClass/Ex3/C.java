package AbstractClass.Ex3;

public class C extends B{
	String Name,Gender,City,Country;
@Override
void getCity(String city) {
	// TODO Auto-generated method stub
	this.City =city;
}

@Override
void getCountry(String country) {
	// TODO Auto-generated method stub
	this.Country = country;
}

@Override
void getName(String name) {
	// TODO Auto-generated method stub
	this.Name=name;
}

@Override
void getGender(String gender) {
	// TODO Auto-generated method stub
	this.Gender=gender;
}
void display() {
	System.out.println("Name:"+Name);
	System.out.println("Gender:"+Gender);
	System.out.println("City:"+City);
	System.out.println("Country"+Country);
	
}
}
