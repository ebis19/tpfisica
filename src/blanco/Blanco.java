package blanco;

public class Blanco {

	
	double anguloI;
	final double ANGULOMAX=Math.toRadians(20);
	final double RADIO=0.5;
	final double RADIOCHIQUITO=0.25;
	
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
}
