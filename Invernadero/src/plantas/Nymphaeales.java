package plantas;

public class Nymphaeales extends Angiospermas{
	
private String familia;
	
	public Nymphaeales(String nombre, String nCientifico, double size, int canAgua, boolean exterior, String nombreGrupo, String fruto, String familia) {
		super(nombre, nCientifico, size, canAgua, exterior, nombreGrupo, fruto);
		this.familia= familia;
		// TODO Auto-generated constructor stub
}
	public String getFamilia() {
		return familia;
	}
	public void setFamilia(String familia) {
		this.familia = familia;
	}
	@Override
	public String toString() {
		return super.toString() + "\n Familia:" + this.getFamilia();
	};
}
