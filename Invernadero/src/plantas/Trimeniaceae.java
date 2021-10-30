package plantas;

public class Trimeniaceae extends Angiospermas{
	
	private boolean tropical;
	
	public Trimeniaceae(String nombre, String nCientifico, double size, int canAgua, boolean exterior, String nombreGrupo, String fruto, boolean tropical) {
		super(nombre, nCientifico, size, canAgua, exterior, nombreGrupo, fruto);
		this.tropical= tropical;
		// TODO Auto-generated constructor stub
}
	public boolean getTropical() {
		return tropical;
	}
	public void setTropical(boolean tropical) {
		this.tropical = tropical;
	}
	@Override
	public String toString() {
		return super.toString() + "\n Tropical:" + this.getTropical();
	};
}
