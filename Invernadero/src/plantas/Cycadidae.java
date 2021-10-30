package plantas;

public class Cycadidae extends Angiospermas{
	
	private int longevidad;
	
	public Cycadidae(String nombre, String nCientifico, double size, int canAgua, boolean exterior, String nombreGrupo, String fruto, int longevidad) {
		super(nombre, nCientifico, size, canAgua, exterior, nombreGrupo, fruto);
		this.longevidad= longevidad;
		// TODO Auto-generated constructor stub
}
	public int getLongevidad() {
		return longevidad;
	}
	public void setLongevidad(int longevidad) {
		this.longevidad = longevidad;
	}
	@Override
	public String toString() {
		return super.toString() + "\n Cantidad:" + this.getLongevidad();
	};
}
