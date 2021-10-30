package plantas;

public class Briofitas extends Plantae{
	
	protected String nombreGrupo;
	protected boolean fotosintesis;
	
	public Briofitas(String nombre, String nCientifico, double size, int canAgua, boolean exterior, String nombreGrupo, boolean fotosintesis) {
		super(nombre, nCientifico, size, canAgua, exterior);
		this.nombreGrupo= nombreGrupo;
		this.fotosintesis= fotosintesis;
		// TODO Auto-generated constructor stub
	}
	public String getNombreGrupo() {
		return nombreGrupo;
	}

	public void setNombreGrupo(String nombreGrupo) {
		this.nombreGrupo = nombreGrupo;
	}
	public boolean getFotosintesis() {
		return fotosintesis;
	}

	public void setFotosintesis(boolean fotosintesis) {
		this.fotosintesis = fotosintesis;
	}
	@Override
	public String toString() {
		return "Nombre:" + this.getNombre() + "\n Nombre Cientifico:" + this.getNCientifico() + "\n Size:" + this.getSize() + "\n Cantidad de Agua:" + this.getCanAgua() + "\n Exterior:" + this.getExterior() + "\n Nombre De Grupo:" + this.getNombreGrupo() + "\n Fotosintesis:" + this.getFotosintesis();
	};
}
