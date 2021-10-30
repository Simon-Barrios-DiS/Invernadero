package plantas;

public class Monocotiledonias extends Angiospermas{
	
	private String tipoDeFlor;
	
	public Monocotiledonias(String nombre, String nCientifico, double size, int canAgua, boolean exterior, String nombreGrupo, String fruto, String tipoDeFlor) {
		super(nombre, nCientifico, size, canAgua, exterior, nombreGrupo, fruto);
		this.tipoDeFlor= tipoDeFlor;
		// TODO Auto-generated constructor stub
}
	
	public String getTipoDeFlor() {
		return tipoDeFlor;
	}

	public void setTipoDeFlor(String tipoDeFlor) {
		this.tipoDeFlor = tipoDeFlor;
	}

	@Override
	public String toString() {
		return super.toString() + "\n Tip de Flor:" + this.getTipoDeFlor();
	};
}
