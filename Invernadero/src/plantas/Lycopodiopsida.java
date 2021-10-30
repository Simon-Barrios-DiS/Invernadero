package plantas;

public class Lycopodiopsida extends Pteridofitas{
	
	private String asociacionMicrobio;
	
	public Lycopodiopsida(String nombre, String nCientifico, double size, int canAgua, boolean exterior, String nombreGrupo, boolean acuatico, String asociacionMicrobio) {
		super(nombre, nCientifico, size, canAgua, exterior, nombreGrupo, acuatico);
		this.asociacionMicrobio= asociacionMicrobio;
		// TODO Auto-generated constructor stub
}
	public String getAsociacionMicrobio() {
		return asociacionMicrobio;
	}
	public void setAsociacionMicrobio(String asociacionMicrobio) {
		this.asociacionMicrobio = asociacionMicrobio;
	}
	@Override
	public String toString() {
		return super.toString() + "\n Asociacion de Microbios:" + this.getAsociacionMicrobio();
	};
}
