package blanco;

public class TiroAlblanco {
	
	public Flecha fuerzaBruta(){
		Flecha f1;
		double angulo;
		double v0=0;
		double distancia;
		Blanco b1=new Blanco(10);
		while(v0++<3000) {
			angulo=0;
			while(++angulo<90){
				f1=new Flecha(v0,angulo);
				distancia=b1.getDistanciaALAFlecha(f1);
				if(distancia<b1.RADIOCHIQUITO)
						return f1;
			}
		}
		return null;
		
	}
	public Flecha fuerzaBrutaMejorada(){
	 return null;
	}
}


