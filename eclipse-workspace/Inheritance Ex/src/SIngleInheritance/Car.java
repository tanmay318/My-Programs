package SingleInheritance;
public class Car extends Vehicle {
	String modeltype;
	public void Showdetails() {
		VehicleType = "Car";
		modeltype = "Sports";
		System.out.println(modeltype+ " " +VehicleType);
	}
public static void main(String[] args) {
	Car obj =new Car();
	
}
}
