package plantas;

public class Gnetidae extends Angiospermas{
	
	private String region;
	
	public Gnetidae(String nombre, String nCientifico, double size, int canAgua, boolean exterior, String nombreGrupo, String fruto, String region) {
		super(nombre, nCientifico, size, canAgua, exterior, nombreGrupo, fruto);
		this.region= region;
		// TODO Auto-generated constructor stub
}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	@Override
	public String toString() {
		return super.toString() + "\n Cantidad:" + this.getRegion();
	};
}
