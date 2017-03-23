import java.io.*;
public class TodoBajoControl{
public static InputStreamReader isr = new InputStreamReader(System.in);
public static BufferedReader bf = new BufferedReader(isr);
public static PrintStream fsalida = System.out;
public static String dato;
public static int op, dato1;




public static void datosPersonales(){
	fsalida.println("Ingresar Datos");
			try{
				fsalida.println("Nombre");
				dato = bf.readLine();
				fsalida.println("Apellido");
				dato = bf.readLine();
				fsalida.println("Edad");
				dato = bf.readLine();
				dato1 = Integer.parseInt(dato);

			}catch(IOException ex){}
		}



	public static void main (String [] args){

		do{
		fsalida.println("\tBienvido a la APP TodoBajoControl 'TBC' \n");
		
			fsalida.println("Que opcion desea elegir\n");
		fsalida.println("1.-Ingresar Datos\n.-2Revisar Datos\n3.-Como me protejo\n4.-Salir");
		
		try{	
			dato = bf.readLine();
			op = Integer.parseInt(dato);
		}catch(IOException ex) {}



		switch(op){
			case 1:
			datosPersonales();
			break;
			case 2:

			break;
			case 3:

			break;
			case 4:
			fsalida.println("CUIDATE USA PROTECCION");
			break;
		}

		}while(op != 4);

	}
	
}
