package blanco;

public class Flecha {
	final double distancia=20;
	double v0,angulo;
	
	public Flecha(double v0, double angulo) {
		this.v0 = v0;
		this.angulo =angulo;
	}
	public double obtenerTiempoImpacto() {
		return distancia/(this.v0*Math.cos((Math.toRadians(angulo))));
	}
	public Posicion obtenerPosicion() {
		int altIni=0;
		double t=this.obtenerTiempoImpacto(),g=9.8;
		double  y=altIni+(this.v0*Math.sin((Math.toRadians(angulo)))*t-(0.5*g*Math.pow(t, 2)));
		return new Posicion(0.0,y,0.0);
	}
	@Override
	public String toString() {
		return "Velocidad Inicial:" + v0 + "\nAngulo:" + angulo + "\n Tiempo"
				+ obtenerTiempoImpacto() + "\nPosición Final:" + obtenerPosicion() + "]";
	}	
	

}