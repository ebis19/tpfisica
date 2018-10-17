package blanco;

public class Blanco {

	
	private double anguloI;
	private final double ANGULOMAX=Math.toRadians(20);
	final double RADIO=0.5;
	final double RADIOCHIQUITO=0.25;
	final double CENTRO =0.01;
	
	public double getDistanciaALAFlecha(Flecha flecha){
		double t= flecha.obtenerTiempoImpacto();
		Posicion pos=new Posicion(0.0,this.getPosicionY(t),this.getPosicionZ(t));
		return flecha.obtenerPosicion().distancia(pos);
	}
	
	double getPosicionZ(double t){
		return 3*ANGULOMAX*Math.sin((Math.sqrt(9.8/3)*t)+anguloI);
	}
	double getPosicionY(double t){
		return 3-Math.sqrt(9-Math.pow(this.getPosicionZ(t), 2)) ;
	}
	public Blanco(double anguloI) {
		this.anguloI = anguloI;	
	}

	@Override
	public String toString() {
		return "Angulo Inicial" + anguloI + "\nAngulo Maximo" + ANGULOMAX + "Radio" + RADIO + "Radio Chiquito"
				+ RADIOCHIQUITO + "\nCentro:" + CENTRO;
	}
	
	
}
