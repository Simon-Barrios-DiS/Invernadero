package plantas;

public abstract class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Todas las plantas son plantas inventandas para fines de muestra
		Musgos Mus1= new Musgos("Musgero", "Musgerus", 10.9, 10, false, "Briofritas Musgos", false, "Musgo de agua");
		System.out.println(Mus1);
		
		Magnoliidae Mag1= new Magnoliidae("Magnolia", "Magnolius", 12.0, 8, false, "Angiospermas Magnoliidae", "Flores", "Decoracion");
		System.out.println(Mag1);

		Gnetidae Gne1= new Gnetidae("Gneto", "Gnetus", 27.2, 19, false, "Gumnospermas Gnetidae", "Conos", "Asia");
		System.out.println(Gne1);

		Isoetes Iso1= new Isoetes("Isobel", "Isobelus", 3.1, 15, true, "Pteridofitas Isoetes", false, false);
		System.out.println(Iso1);
	}

}
