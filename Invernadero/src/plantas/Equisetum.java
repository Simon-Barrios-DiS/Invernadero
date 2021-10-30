package plantas;

public class Equisetum extends Pteridofitas{
	
	private boolean venenosa;
	
	public Equisetum(String nombre, String nCientifico, double size, int canAgua, boolean exterior, String nombreGrupo, boolean acuatico, boolean venenosa) {
		super(nombre, nCientifico, size, canAgua, exterior, nombreGrupo, acuatico);
		this.venenosa= venenosa;
		// TODO Auto-generated constructor stub
}
	public boolean getVenenosa() {
		return venenosa;
	}
	public void setVenenosa(boolean venenosa) {
		this.venenosa = venenosa;
	}
	@Override
	public String toString() {
		return super.toString() + "\n Venenosa:" + this.getVenenosa();
	};
}
