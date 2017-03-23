import.java.io.* 
public class Datos{
public static InputStreamReader isr = new InputStreamReader(System.in);
public static BufferedReader bf = new BufferedReader(isr);
public static PrintStream fsalida = System.out;
public static String dato;
public static int op, dato1;

public void datosPersonales(){
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

public void datosAnticonceptivos(){
    fsalida.println("Utilizas algun metodo");
    fsalida.println("1.Si 2.No")


}





}