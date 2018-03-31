package modelo;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float inputLado=Integer.parseInt(JOptionPane.showInputDialog("ingrese lado"));
		int opcionMenu;
		int reset;
		do {
			opcionMenu=menu();
			switch (opcionMenu) {
			case 1:
				//AREA CUADRADO
				Cuadrado cuadrado= new Cuadrado(inputLado);
				cuadrado.setLado(inputLado);
				cuadrado.cuadradoArea(inputLado);
				JOptionPane.showMessageDialog(null, "Area del cuadrado es:"+cuadrado.getArea());
				reset=JOptionPane.showConfirmDialog(null,"¿Desea hacer otro calculo?",null,JOptionPane.YES_NO_OPTION);
				if (reset==JOptionPane.NO_OPTION) {
					Principal.main(args);
				}else {
					JOptionPane.showMessageDialog(null, "El valor que trae es"+inputLado);
					continue;
				}
				break;
			case 2:
				//PERIMETRO CUADRADO
				Cuadrado cuadradoP= new Cuadrado(inputLado);
				cuadradoP.setLado(inputLado);
				cuadradoP.perimetroCuadrado(inputLado);
				JOptionPane.showMessageDialog(null, "Perimetro del cuadrado es:"+cuadradoP.getPerimetro());
				reset=JOptionPane.showConfirmDialog(null,"¿Desea hacer otro calculo?",null,JOptionPane.YES_NO_OPTION);
				if (reset==JOptionPane.NO_OPTION) {
					Principal.main(args);
				}else {
					JOptionPane.showMessageDialog(null, "El valor que trae es"+inputLado);
					continue;
				}
				break;
			case 3:
				//VOLUMEN CUBO
				Cubo cubo=new Cubo(inputLado);
				cubo.setLado(inputLado);
				cubo.volumenCubo(inputLado);
				JOptionPane.showMessageDialog(null, "Volumen del cubo es:"+cubo.getVolumen());
				reset=JOptionPane.showConfirmDialog(null,"¿Desea hacer otro calculo?",null,JOptionPane.YES_NO_OPTION);
				if (reset==JOptionPane.NO_OPTION) {
					Principal.main(args);
				}else {
					JOptionPane.showMessageDialog(null, "El valor que trae es"+inputLado);
					continue;
				}
				break;
			case 4:
				//PERIMETRO CUBO
				Cubo cuboP=new Cubo(inputLado);
				cuboP.setLado(inputLado);
				cuboP.perimetroCubo(inputLado);
				JOptionPane.showMessageDialog(null, "Perimetro del cubo es:"+cuboP.getPerimetroC());
				reset=JOptionPane.showConfirmDialog(null,"¿Desea hacer otro calculo?",null,JOptionPane.YES_NO_OPTION);
				if (reset==JOptionPane.NO_OPTION) {
					Principal.main(args);
				}else {
					JOptionPane.showMessageDialog(null, "El valor que trae es"+inputLado);
					continue;
				}
				break;
			case 5:
				Principal.main(args);
				break;
			case 6:
				JOptionPane.showMessageDialog(null, "Saliendo de la aplicacion..");
				System.exit(0);
				break;
			}
		} while (opcionMenu!=6);
	}
	//MENU PRINCIPAL//
	private static int menu(){
		String menu="";
		int opcion;
		menu+="1.-Calcular Area Cuadrado\n";
		menu+="2.-Calcular Perimetro Cuadrado\n";
		menu+="3.-Calcular Volumen Cubo\n";
		menu+="4.-Calcular Perimetro Cubo\n";
		menu+="5.-Cancelar\n";
		menu+="6.-Salir\n";
		menu+="Seleccione una opción\n";
		do{ 
		 opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
		}while(opcion<1||opcion>6);
		return opcion;
	}
}
