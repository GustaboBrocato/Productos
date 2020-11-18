import java.util.Scanner;

public class productos{

	public static void main(String[] args)
	{
		Scanner r = new Scanner(System.in);
		int cantidadProductos;

		System.out.println("Bienvenido, porfavor ingrese cuantos productos llevara: ");
		cantidadProductos = r.nextInt();

		if(cantidadProductos > 5)
		{
			System.out.println("Por comprar mas de cinco productos ha recibido un descuento del 15%!");	
		}else
		{
			System.out.println("Usted no ha recibido el descuento del 15% que se otorga al comprar mas de cinco productos!");
		}	
	}
}