package plantas;

public class Angiospermas extends Plantae{
	
	protected String nombreGrupo;
	protected String fruto;
	
	public Angiospermas(String nombre, String nCientifico, double size, int canAgua, boolean exterior, String nombreGrupo, String fruto) {
		super(nombre, nCientifico, size, canAgua, exterior);
		this.nombreGrupo= nombreGrupo;
		this.fruto= fruto;
		// TODO Auto-generated constructor stub
	}
	public String getNombreGrupo() {
		return nombreGrupo;
	}

	public void setNombreGrupo(String nombreGrupo) {
		this.nombreGrupo = nombreGrupo;
	}
	public String getFruto() {
		return fruto;
	}

	public void setFruto(String fruto) {
		this.fruto = fruto;
	}
	@Override
	public String toString() {
		return "Nombre:" + this.getNombre() + "\n Nombre Cientifico:" + this.getNCientifico() + "\n Size:" + this.getSize() + "\n Cantidad de Agua:" + this.getCanAgua() + "\n Exterior:" + this.getExterior() + "\n Nombre De Grupo:" + this.getNombreGrupo() + "\n Fruto:" + this.getFruto();
	};
}