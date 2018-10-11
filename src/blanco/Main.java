package blanco;

public class Main {

	public static void main(String[] args) {
		Flecha f1;
		f1=fuerzaBruta();
		System.out.println("V0:"+f1.v0);
		System.out.println("Angulo:"+f1.angulo);
		System.out.println("Tiempo Impacto:"+f1.obtenerTiempoImpacto());
		System.out.println("Altura Impacto:"+f1.obtenerAlturaImpacto());
	}
	public static Flecha fuerzaBruta(){
		Flecha f1;
		double angulo;
		double v0=0;
		Blanco b1=new Blanco(10);
		while(v0++<10000) {
			angulo=0;
			while(angulo++<90){
				f1=new Flecha(v0,angulo);
				if(b1.golpea(f1))
						return f1;
						
			}
		}
		return new Flecha(-1,-1);
		
	}
	public static void mostrandoblanco(){
		int i=0;
		Blanco b1=new Blanco(15);
		while (++i<100) {
			System.out.println(b1.getPosicionZ(i)+" "+b1.getPosicionY(i));
		}
	}
}

