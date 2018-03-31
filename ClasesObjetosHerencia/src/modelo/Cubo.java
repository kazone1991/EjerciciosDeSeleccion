package modelo;

public class Cubo extends Cuadrado{
    float volumen;
    float perimetroC;
    
	//CONS
	public Cubo(float lado) {
		super(lado);
		this.volumen=volumen;
		this.perimetroC=perimetroC;
		// TODO Auto-generated constructor stub
	}
	
	//GYS
	public float getVolumen() {
		return volumen;
	}

	public void setVolumen(float volumen) {
		this.volumen = volumen;
	}

	public float getPerimetroC() {
		return perimetroC;
	}

	public void setPerimetroC(float perimetroC) {
		this.perimetroC = perimetroC;
	}
	
	//COMPORTAMIENTO
	public float volumenCubo(float lado){
		volumen=lado*lado*lado;
		return volumen;
	}
	
	public float perimetroCubo(float lado){
		perimetroC=lado*12;
		return perimetroC;
	}
}
