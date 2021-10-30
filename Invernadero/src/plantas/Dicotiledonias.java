package plantas;

public class Dicotiledonias extends Angiospermas{
	
	private int partesDeFlor;
	
	public Dicotiledonias(String nombre, String nCientifico, double size, int canAgua, boolean exterior, String nombreGrupo, String fruto, int partesDeFlor) {
		super(nombre, nCientifico, size, canAgua, exterior, nombreGrupo, fruto);
		this.partesDeFlor= partesDeFlor;
		// TODO Auto-generated constructor stub
}
	public int getPartesDeFlor() {
		return partesDeFlor;
	}
	public void setPartesDeFlor(int partesDeFlor) {
		this.partesDeFlor = partesDeFlor;
	}
	@Override
	public String toString() {
		return super.toString() + "\n Partes de la Flor:" + this.getPartesDeFlor();
	};
}
