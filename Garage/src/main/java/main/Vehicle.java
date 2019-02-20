package main;

public abstract class Vehicle {

	private int numtyres;
	private float topspeed;
	
	private String brand;	
	private String model;
	private String yearserviced;
	
	
	public Vehicle(int numtyres, float topspeed) {
		this.numtyres = numtyres;
		this.topspeed = topspeed;
	}

	public Vehicle(int numtyres) {
		this.numtyres = numtyres;
	}
	
	public Vehicle(String brand, String model, String yearserviced) {
		this.brand = brand;
		this.model = model;
		this.yearserviced = yearserviced;
	}

	public abstract void drive();
	
	public abstract void accelerate();

	public int getNumtyres() {
		return numtyres;
	}

	public void setNumtyres(int numtyres) {
		this.numtyres = numtyres;
	}

	public float getTopspeed() {
		return topspeed;
	}

	public void setTopspeed(float topspeed) {
		this.topspeed = topspeed;
	}

	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", model=" + model + ", yearserviced=" + yearserviced + "]";
	}
	
	
	
	
	
	
	
	
}
