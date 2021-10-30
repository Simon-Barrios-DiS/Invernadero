package plantas;

public class Musgos extends Briofitas{
	
	private String clase;

	public Musgos(String nombre, String nCientifico, double size, int canAgua, boolean exterior,String nombreGrupo, boolean fotosintesis, String clase) {
		super(nombre, nCientifico, size, canAgua, exterior, nombreGrupo, fotosintesis);
		this.clase= clase;
		// TODO Auto-generated constructor stub
	}
	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}
	@Override
	public String toString() {
		return super.toString() + "\n Clase:" + this.getClase();
	};
}
