package main;

public class Car extends Vehicle {
	
	private String brand;	
	private String model;
	private String yearserviced;
	
	@Override
	public void drive() {
		System.out.println("Put your hands on the wheel and your right foot on the accelerator pedal");
	}
	
	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("The more the accelerator pedal goes down the more acceleration you get from you car");
	}
	
	public Car(String brand, String model, String yearserviced) {
		super(brand,model,yearserviced);
	}
	
	public Car() {
		super(4);
	}
	

	
	
	
	
	
	
	

}
