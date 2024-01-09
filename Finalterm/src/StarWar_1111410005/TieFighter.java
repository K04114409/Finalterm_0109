package StarWar_1111410005;

public class TieFighter {
	private String Manufacturer;
	private String Model;
	private double Length;
	private double AirSpeed;
	private String SpaceSpeed;
	private String StdandardEngine;
    private int Passenger;
    private String Shield;
    private String ShieldPower;
	static final double[] Weapon_power = {1000,1000,1000,1000,5,5};
	static final String[] Weapon = {"SFC L-sl型雷射加農砲","SFS L-sl型雷射加農砲"};
	
	public String getManufacturer() {
		return Manufacturer;
	}
	public void setManufacturer(String manufacturcr) {
		Manufacturer = manufacturcr;
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
	public void setLength(double length) {
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
	public int getPassenger() {
		return Passenger;
	}
	public void setPassenger(int passenger) {
		Passenger = passenger;
	}
	public String getShield() {
		return Shield;
	}
	public void setShield(String shield) {
		Shield = shield;
	}
	public String getShieldPower() {
		return ShieldPower;
	}
	public void setShieldPower(String shieldPower) {
		ShieldPower = shieldPower;
	}
	
    public TieFighter() {
		
	}
	public TieFighter(String manufacturer,String Model,double Length,
			double AirSpeed,String SpaceSpeed,String StdandardEngine,
			String HyperSpaceEngine,int Passenger) {
		
		this.setManufacturer(manufacturer);
		this.setModel(Model);
		this.setLength(Length);
		this.setAirSpeed(AirSpeed);
		this.setSpaceSpeed(SpaceSpeed);
		this.setStdandardEngine(StdandardEngine);
		this.setPassenger(Passenger);
	}
    
	
	@Override
	public String toString() {
		return "TieFighter [製造商=" + Manufacturer + ", 型號=" + Model + ", 長度=" + Length + ", 大氣中飛行速度="
				+ AirSpeed + ", 宇宙空間加速度=" + SpaceSpeed + ", 標準引擎資料=" + StdandardEngine + ", 乘坐人員="
				+ Passenger + ", 防護罩=" + Shield + ", 防護罩能量值=" + ShieldPower  + "]";
	}
	
}
