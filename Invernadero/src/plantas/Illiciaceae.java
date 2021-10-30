package plantas;

public class Illiciaceae extends Angiospermas{
	
	private boolean olor;
	
	public Illiciaceae(String nombre, String nCientifico, double size, int canAgua, boolean exterior, String nombreGrupo, String fruto, boolean olor) {
		super(nombre, nCientifico, size, canAgua, exterior, nombreGrupo, fruto);
		this.olor= olor;
		// TODO Auto-generated constructor stub
}
	public boolean getOlor() {
		return olor;
	}
	public void setOlor(boolean olor) {
		this.olor = olor;
	}
	@Override
	public String toString() {
		return super.toString() + "\n Olor:" + this.getOlor();
	};
}
