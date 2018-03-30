package modelo;

import javax.swing.JOptionPane;

public class Traductor {

	public static void main(String[] args) {
		String [] morse={".-","-...","-.-.","-..",".","..-.","--.","....","..",
				".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...",
				"-","..-","...-",".--","-..-","-.--","--..","|",".----","..---",
				"...--","....-",".....","-....","--...","---..","----.","-----"};
		String abecedario="ABCDEFGHIJKLMNOPQRSTUVWXYZ 1234567890";
		String TipoMensaje= new String();
		
		TipoMensaje=JOptionPane.showInputDialog("¿tu frase es con letras o codigo morse?,escribe 'morse' o 'letras' para continuar.");
		if (TipoMensaje.equalsIgnoreCase("letras")) {
			letraMorse(abecedario,morse);
		} else if(TipoMensaje.equalsIgnoreCase("morse")){
			morseLetras(abecedario, morse);
		}else{
			JOptionPane.showMessageDialog(null,"ingrese 'morse' o 'letras' por favor.");
		}
	}
	
	//METODO LETRAS-MORSE//
	public static void letraMorse(String abecedario, String morse[]) {
		int opcion;
		do {
			String salida=" ";
		    String mensajeLetras=JOptionPane.showInputDialog("ingresa el mensaje escrito en letras:");
		    mensajeLetras=mensajeLetras.toUpperCase();
		
		    for (int i = 0; i < mensajeLetras.length(); i++) {
		    	if(mensajeLetras.charAt(i) == ' '){
		    		salida=salida+"   ";
		    		continue;
		    	}
		    	for (int j = 0; j < abecedario.length(); j++) {
		    		if(abecedario.charAt(j) == mensajeLetras.charAt(i)){
		    			salida=salida+morse[j]+" ";
		    			//break;
		    		}
		    	}
		    }
		    JOptionPane.showMessageDialog(null,"cambiando texto a morse...");
    		JOptionPane.showMessageDialog(null, "su mensaje en codigo morse es: "+ salida);
		    opcion=JOptionPane.showConfirmDialog(null,"¿Desea hacer otra traduccion a morse?",null,JOptionPane.YES_NO_OPTION);
		    if(opcion==JOptionPane.NO_OPTION)
		    	break;
        }while(opcion==JOptionPane.YES_OPTION);
	}
	
	//METODO MORSE-LETRAS//
	public static void morseLetras(String abecedario, String morse[]){
	
		int opcion;
		do{
			String salida=" ";
			String mensajeMorse=JOptionPane.showInputDialog("ingrese el mensaje en codigo morse:");
			String delimitador= " ";
			String [] arrayMorse=mensajeMorse.split(delimitador);
			int i=0;
			while(i<arrayMorse.length){
				for (int j = 0; j < morse.length; j++) {
					if(morse[j].equalsIgnoreCase(arrayMorse[i])){
						salida=salida+abecedario.charAt(j);
					}
				}
				i++;
			}
			JOptionPane.showMessageDialog(null,"cambiando morse a texto...");
    		JOptionPane.showMessageDialog(null, "su mensaje es : "+ salida);
			opcion=JOptionPane.showConfirmDialog(null,"¿Desea hacer otra traduccion a español?",null,JOptionPane.YES_NO_OPTION);
			 if(opcion==JOptionPane.NO_OPTION)
			    	break;
		}while(opcion==JOptionPane.YES_OPTION);
	}	
}

