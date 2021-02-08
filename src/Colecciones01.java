
public class Colecciones01 {

	public static void main(String[] args) {
		//Vamos a crear las variables
		int largoArray = 3;
		//int edad[] = new int[largoArray];
		
		largoArray = 5;
		
		int edad[] = new int[largoArray];
		
		//Vamos a asignar valores
		edad[0] = 18;
		edad[1] = 20;
		edad[2] = 15;
		
		//Vamos a visualizar
		for (int i = 0; i < largoArray; i++) {
			System.out.println("El valor del arreglo edad en la posición " + i + " es " + edad[i]);
		}

	}

}
