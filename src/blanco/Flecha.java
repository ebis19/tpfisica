package blanco;

public class Flecha {
	double v0,angulo;

	public Flecha(double v0, double angulo) {
		
		this.v0 = v0;
		this.angulo =angulo;
	}
	public double obtenerTiempoImpacto() {
		int distIni=20;
		return distIni/(this.v0*Math.cos((Math.toRadians(angulo))));
	}
	public double obtenerAlturaImpacto() {
		int altIni=0;
		double t=this.obtenerTiempoImpacto(),
				g=9.8;
		return altIni+(this.v0*Math.sin((Math.toRadians(angulo)))*t-(0.5*g*Math.pow(t, 2)));

	}	
	

}