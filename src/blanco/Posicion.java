package blanco;

public class Posicion {
	private double x;
	private double y;
	private double z;
	double distancia(Posicion otra){
		return Math.sqrt(Math.pow(this.x-otra.x, 2)+Math.pow(this.y-otra.y, 2)+Math.pow(this.z-otra.z, 2));
	}
	public Posicion(double x, double y,double  z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	@Override
	public String toString() {
		return "("+x+","+y+","+z+")";
	}
	

}
