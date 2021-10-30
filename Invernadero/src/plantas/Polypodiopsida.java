package plantas;

public class Polypodiopsida extends Pteridofitas{
	
	private String uso;
	
	public Polypodiopsida(String nombre, String nCientifico, double size, int canAgua, boolean exterior, String nombreGrupo, boolean acuatico, String uso) {
		super(nombre, nCientifico, size, canAgua, exterior, nombreGrupo, acuatico);
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
