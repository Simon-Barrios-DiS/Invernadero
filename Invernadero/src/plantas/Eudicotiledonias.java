package plantas;

public class Eudicotiledonias extends Angiospermas{
	
	private boolean basal;
	
	public Eudicotiledonias(String nombre, String nCientifico, double size, int canAgua, boolean exterior, String nombreGrupo, String fruto, boolean basal) {
		super(nombre, nCientifico, size, canAgua, exterior, nombreGrupo, fruto);
		this.basal= basal;
		// TODO Auto-generated constructor stub
}
	public boolean getBasal() {
		return basal;
	}
	public void setBasal(boolean basal) {
		this.basal = basal;
	}
	@Override
	public String toString() {
		return super.toString() + "\n Basal:" + this.getBasal();
	};
}
