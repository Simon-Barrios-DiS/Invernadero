package plantas;

public class Amborellaceae extends Angiospermas{

	private int cantidad;
	
	public Amborellaceae(String nombre, String nCientifico, double size, int canAgua, boolean exterior, String nombreGrupo, String fruto, int cantidad) {
		super(nombre, nCientifico, size, canAgua, exterior, nombreGrupo, fruto);
		this.cantidad= cantidad;
		// TODO Auto-generated constructor stub
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return super.toString() + "\n Cantidad:" + this.getCantidad();
	};
}
