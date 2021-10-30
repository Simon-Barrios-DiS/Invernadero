package plantas;

public class Magnoliidae extends Angiospermas{
	
	private String uso;
	
	public Magnoliidae(String nombre, String nCientifico, double size, int canAgua, boolean exterior, String nombreGrupo, String fruto, String uso) {
		super(nombre, nCientifico, size, canAgua, exterior, nombreGrupo, fruto);
		this.uso= uso;
		// TODO Auto-generated constructor stub
}
	public String getUso() {
		return uso;
	}
	public void setUso(String uso) {
		this.uso = uso;
	}
	@Override
	public String toString() {
		return super.toString() + "\n Uso:" + this.getUso();
	};
}
