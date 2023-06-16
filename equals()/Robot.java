public class Robot {

	private String name;
	private int age;
	private double batteryRuntime;

	Robot(String name, int age, double batteryRuntime) {
		this.name = name;
		this.age = age;
		this.batteryRuntime = batteryRuntime;
	}
	
	@Override
	public boolean equals(Object vergleichsObjekt){
	    return (vergleichsObjekt != null) && 
	    this.name.equals(((Robot) vergleichsObjekt).name) && 
	    ((Robot) vergleichsObjekt).age == this.age
	    && ((Robot) vergleichsObjekt).batteryRuntime == this.batteryRuntime;
	}
}
