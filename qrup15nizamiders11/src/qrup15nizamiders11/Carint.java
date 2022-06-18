package qrup15nizamiders11;

public class Carint implements Car  {
  String name;
  int speed;

	@Override
	public String carSpeed() {
		return "Name:"+ this.name +" " + "speed:"+this.speed;

	}
}
