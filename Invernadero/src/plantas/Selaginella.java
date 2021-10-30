package plantas;

public class Selaginella extends Pteridofitas{
	
	private String clima;
	
	public Selaginella(String nombre, String nCientifico, double size, int canAgua, boolean exterior, String nombreGrupo, boolean acuatico, String clima) {
		super(nombre, nCientifico, size, canAgua, exterior, nombreGrupo, acuatico);
		this.clima= clima;
		// TODO Auto-generated constructor stub
}
	public String getClima() {
		return clima;
	}
	public void setClima(String clima) {
		this.clima = clima;
	}
	@Override
	public String toString() {
		return super.toString() + "\n Clima:" + this.getClima();
	};
}
