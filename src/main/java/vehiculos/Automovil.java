package vehiculos;

public class Automovil extends Vehiculo{
	int puestos;
	private static int nAutomoviles;
	
	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
		nAutomoviles++;
	}

	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}

	public static int getnAutomoviles() {
		return nAutomoviles;
	}

	public static void setnAutomoviles(int nAutomoviles) {
		Automovil.nAutomoviles = nAutomoviles;
	}

}
