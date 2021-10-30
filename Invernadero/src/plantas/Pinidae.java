package plantas;

public class Pinidae extends Angiospermas{
	
	private double escamaSize;
	
	public Pinidae(String nombre, String nCientifico, double size, int canAgua, boolean exterior, String nombreGrupo, String fruto, double escamaSize) {
		super(nombre, nCientifico, size, canAgua, exterior, nombreGrupo, fruto);
		this.escamaSize= escamaSize;
		// TODO Auto-generated constructor stub
}
	public double getEscamaSize() {
		return escamaSize;
	}
	public void setEscamaSize(double escamaSize) {
		this.escamaSize = escamaSize;
	}
	@Override
	public String toString() {
		return super.toString() + "\n Escama Size:" + this.getEscamaSize();
	};
}
