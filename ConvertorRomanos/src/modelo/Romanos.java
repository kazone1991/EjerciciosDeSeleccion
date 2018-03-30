package modelo;
import javax.swing.JOptionPane; 
	
public class Romanos {
	public static void main (String[] args) {
		int opcion;
		do{
		int num=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero entre 1 y 1000: ")); 
			if(num<1 || num>1000){
				JOptionPane.showMessageDialog(null, "ingrese un numero entre 1 y 1000 por favor");
			}else{ 
				String Romano=""; 
				Romano = Romano + "Numero " + num + " = " + Romanos(num)+"\n"; 
				JOptionPane.showMessageDialog(null, Romano);
			}
			opcion=JOptionPane.showConfirmDialog(null,"¿Desea hacer otra conversion?",null,JOptionPane.YES_NO_OPTION);
			if(opcion==JOptionPane.NO_OPTION)
				break;
		}while(opcion==JOptionPane.YES_OPTION);	
	} 
	//METODO//
	public static String Romanos(int num){ 
		int x; 
		int m,c,d,u; 
		m=(num/1000); 
		x=num%1000; 
		c=x/100; 
		x=num%100; 
		d=x/10; 
		u=num%10; 
		
		String SalidaRomano=""; 
		switch(m){ 
			case 1: 
				SalidaRomano = SalidaRomano +"M"; 
				break; 
			case 2: 
				SalidaRomano = SalidaRomano +"MM"; 
				break; 
			case 3: 
				SalidaRomano = SalidaRomano +"MMM"; 
				break; 
		} 
		switch(c){ 
			case 1: 
				SalidaRomano = SalidaRomano +"C"; 
				break; 
			case 2: 
				SalidaRomano = SalidaRomano +"CC"; 
				break; 
			case 3: 
				SalidaRomano = SalidaRomano +"CCC"; 
				break; 
			case 4: 
				SalidaRomano = SalidaRomano +"CD"; 
				break; 
			case 5: 
				SalidaRomano = SalidaRomano +"D"; 
				break; 
			case 6: 
				SalidaRomano = SalidaRomano +"DC"; 
				break; 
			case 7: 
				SalidaRomano = SalidaRomano +"DCC"; 
				break; 
			case 8: 
				SalidaRomano = SalidaRomano +"DCCC"; 
				break; 
			case 9: 
				SalidaRomano = SalidaRomano +"CM"; 
				break; 
		} 
		switch(d){ 
			case 1: 
				SalidaRomano = SalidaRomano +"X"; 
				break; 
			case 2: 
				SalidaRomano = SalidaRomano +"XX"; 
				break; 
			case 3: 
				SalidaRomano = SalidaRomano +"XXX"; 
				break; 
			case 4: 
				SalidaRomano = SalidaRomano +"XL"; 
				break; 
			case 5: 
				SalidaRomano = SalidaRomano +"L"; 
				break; 
			case 6: 
				SalidaRomano = SalidaRomano +"LX"; 
				break; 
			case 7: 
				SalidaRomano = SalidaRomano +"LXX"; 
				break; 
			case 8: 
				SalidaRomano = SalidaRomano +"LXXX";
				break;
			case 9: 
				SalidaRomano = SalidaRomano +"XC"; 
				break; 
		} 
		switch(u){ 
			case 1: 
				SalidaRomano = SalidaRomano +"I"; 
				break; 
			case 2: 
				SalidaRomano = SalidaRomano +"II"; 
				break; 
			case 3: 
				SalidaRomano = SalidaRomano +"III"; 
				break; 
			case 4: 
				SalidaRomano = SalidaRomano +"IV"; 
				break; 
			case 5: 
				SalidaRomano = SalidaRomano +"V"; 
				break; 
			case 6: 
				SalidaRomano = SalidaRomano +"VI"; 
				break; 
			case 7: 
				SalidaRomano = SalidaRomano +"VII"; 
				break; 
			case 8: 
				SalidaRomano = SalidaRomano +"VIII"; 
				break; 
			case 9: 
				SalidaRomano = SalidaRomano +"IX"; 
				break; 
	
		} 
		return SalidaRomano; 
	} 
}