import java.io.*;
public class TodoBajoControl{


	public static void main (String [] args){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(isr);
		String dato;
		PrintStream fsalida = System.out;
		int op = 0;
		int dato1 = 0;

		fsalida.println("\tBienvido a la APP TodoBajoControl 'TBC' \n");
		
			fsalida.println("¿Qué opcion desea elegir\n");
		fsalida.println("1.-Ingresar Datos\n.-2Revisar Datos\n3.-¿Como me protejo?");
		
		try{	
			dato = bf.readLine();
			op = Integer.parseInt(dato);
		}catch(IOException ex) {}



		switch(op){
			case 1:
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


			break;
		}

	}
	
}