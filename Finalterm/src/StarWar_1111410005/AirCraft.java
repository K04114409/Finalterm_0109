package StarWar_1111410005;

public class AirCraft {
	private String manufacturer;
	private String Model;
	private double Length;
	private double AirSpeed;
	private String SpaceSpeed;
	private String StdandardEngine;
	private String HyperSpaceEngine;
    private int Passenger;
    
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public double getLength() {
		return Length;
	}
	public void setLrngth(double length) {
		Length = length;
	}
	public double getAirSpeed() {
		return AirSpeed;
	}
	public void setAirSpeed(double airSpeed) {
		AirSpeed = airSpeed;
	}
	public String getSpaceSpeed() {
		return SpaceSpeed;
	}
	public void setSpaceSpeed(String spaceSpeed) {
		SpaceSpeed = spaceSpeed;
	}
	public String getStdandardEngine() {
		return StdandardEngine;
	}
	public void setStdandardEngine(String stdandardEngine) {
		StdandardEngine = stdandardEngine;
	}
	public String getHyperSpaceEngine() {
		return HyperSpaceEngine;
	}
	public void setHyperSpaceEngine(String hyperSpaceEngine) {
		HyperSpaceEngine = hyperSpaceEngine;
	}
	public int getPassenger() {
		return Passenger;
	}
	public void setPassenger(int passenger) {
		Passenger = passenger;
	}
	
	public AirCraft() {
		
	}
	public AirCraft(String manufacturer,String Model,double Length,
			double AirSpeed,String SpaceSpeed,String StdandardEngine,
			String HyperSpaceEngine,int Passenger) {
		
		this.setManufacturer(manufacturer);
		this.setModel(Model);
		this.setLrngth(Length);
		this.setAirSpeed(AirSpeed);
		this.setSpaceSpeed(SpaceSpeed);
		this.setStdandardEngine(StdandardEngine);
		this.setHyperSpaceEngine(HyperSpaceEngine);
		this.setPassenger(Passenger);
	}
	
    
    
	

}
