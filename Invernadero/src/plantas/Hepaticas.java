package plantas;

public class Hepaticas extends Briofitas{

	private Boolean foliosa;
	
	public Hepaticas(String nombre, String nCientifico, double size, int canAgua, boolean exterior, String nombreGrupo, boolean fotosintesis, boolean foliosa) {
		super(nombre, nCientifico, size, canAgua, exterior, nombreGrupo, fotosintesis);
		this.foliosa= foliosa;
		// TODO Auto-generated constructor stub
	}
	public boolean getFoliosa() {
		return foliosa;
	}

	public void setFoliosa(boolean foliosa) {
		this.foliosa = foliosa;
	}
	@Override
	public String toString() {
		return super.toString() + "\n Foliosa:" + this.getFoliosa();
	};
}