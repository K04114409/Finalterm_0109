package StarWar_1111410005;

public class XWing {
	private String Model;
	private double Length;
	private double AirSpeed;
	private String SpaceSpeed;
	private String StdandardEngine;
	private String HyperSpaceEngine;
    private int Passenger;
    static final String[] Shield = {"Chempat防禦者型偏轉幕發射器",
    		           "Chempat 偏轉防護盾投射器",
    		           "鈦合金加勁外殼"};
    static final double[]Weapon_power={1000,1000};
	static final String [] Weapon={
			"Taim & Bak KX9 雷射加農炮”,” Taim & Bak KX9 雷射加農炮",
			"Taim & Bak KX9 雷射加農炮”,” Taim & Bak KX9 雷射加農炮",
			"Krupx MG7 質子魚雷發射器", "Krupx MG7 質子魚雷發射器"
			};
	
	static final double[] ShieldPower = {2000,3000,1000};
	
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
    public XWing() {
		
	}
	public XWing(String Model,double Length,
			double AirSpeed,String SpaceSpeed,String StdandardEngine,
			String HyperSpaceEngine,int Passenger) {
		
		this.setModel(Model);
		this.setLength(Length);
		this.setAirSpeed(AirSpeed);
		this.setSpaceSpeed(SpaceSpeed);
		this.setStdandardEngine(StdandardEngine);
		this.setHyperSpaceEngine(HyperSpaceEngine);
		this.setPassenger(Passenger);
	}
	
	@Override
	public String toString() {
		return "XWing [型號=" + Model + ", 長度=" + Length + ", 大氣中飛行速度=" + AirSpeed + ", 宇宙空間加速=" + SpaceSpeed
				+ ", 標準引擎資料=" + StdandardEngine + ", 超空間引擎=" + HyperSpaceEngine + ", 乘坐人員="
				+ Passenger + ", toString()="
				+"]";
	}

}
