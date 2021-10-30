package plantas;

public class Pteridofitas extends Plantae{
	
	protected String nombreGrupo;
	protected boolean acuatico;
	
	public Pteridofitas(String nombre, String nCientifico, double size, int canAgua, boolean exterior, String nombreGrupo, boolean acuatico) {
		super(nombre, nCientifico, size, canAgua, exterior);
		this.nombreGrupo= nombreGrupo;
		this.acuatico= acuatico;
		// TODO Auto-generated constructor stub
	}
	public String getNombreGrupo() {
		return nombreGrupo;
	}

	public void setNombreGrupo(String nombreGrupo) {
		this.nombreGrupo = nombreGrupo;
	}
	public boolean getAcuatico() {
		return acuatico;
	}

	public void setAcuatico(boolean acuatico) {
		this.acuatico = acuatico;
	}
	@Override
	public String toString() {
		return "Nombre:" + this.getNombre() + "\n Nombre Cientifico:" + this.getNCientifico() + "\n Size:" + this.getSize() + "\n Cantidad de Agua:" + this.getCanAgua() + "\n Exterior:" + this.getExterior() + "\n Nombre De Grupo:" + this.getNombreGrupo() + "\n Acuatico:" + this.getAcuatico();
	};
}