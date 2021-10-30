package plantas;

public class Antoceropsidas extends Briofitas{
	
	private String especie;

	public Antoceropsidas(String nombre, String nCientifico, double size, int canAgua, boolean exterior,String nombreGrupo, boolean fotosintesis, String especie) {
		super(nombre, nCientifico, size, canAgua, exterior, nombreGrupo, fotosintesis);
		this.especie= especie;
		// TODO Auto-generated constructor stub
	}
	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
	@Override
	public String toString() {
		return super.toString() + "\n Especie" + this.getEspecie();
	};
}
