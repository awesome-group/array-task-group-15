package main;

public class Car implements CarInterFace {
	String cN;
	long cS;
	@Override
	public void carSpeed(String cN, long cS) {
		System.out.println("Masinin adi "+cN+" sureti "+cS+"km/saat-dir.");
	}


}
