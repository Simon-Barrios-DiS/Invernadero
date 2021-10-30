package plantas;

public class Isoetes extends Pteridofitas{
	
	private boolean extincion;
	
	public Isoetes(String nombre, String nCientifico, double size, int canAgua, boolean exterior, String nombreGrupo, boolean acuatico, boolean extincion) {
		super(nombre, nCientifico, size, canAgua, exterior, nombreGrupo, acuatico);
		this.extincion= extincion;
		// TODO Auto-generated constructor stub
}
	public boolean getExtincion() {
		return extincion;
	}
	public void setExtincion(boolean extincion) {
		this.extincion = extincion;
	}
	@Override
	public String toString() {
		return super.toString() + "\n Extincion:" + this.getExtincion();
	};
}
