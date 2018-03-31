package modelo;

public class Cuadrado {
	float lado;
	float area;
	float perimetro;
	
	//CONS
	public Cuadrado(float lado) {
		//super();
		this.lado = lado;
	}
	
    //GYS
	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}
	
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	public float getPerimetro() {
		return perimetro;
	}
	public void setPerimetro(float perimetro) {
		this.perimetro = perimetro;
	}
	//COMPORTAMIENTO
	public float cuadradoArea(float lado){
		area= lado*lado;
		return area;
	}
	
	public float perimetroCuadrado(float lado){
	    perimetro=lado*4;
		return perimetro;
	}
}
