package plantas;

public abstract class Plantae {
public String nombre;
public String nCientifico;
public double size;
public int canAgua; //Cantidad de agua que normalmente requiere al ser regada, en mililitros
public boolean exterior; //Si son de exterior o no


public Plantae(String nombre, String nCientifico, double size, int canAgua, boolean exterior) {
	this.nombre = nombre;
	this.nCientifico = nCientifico;
	this.size= size;
	this.canAgua= canAgua;
	this.exterior= exterior;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getNCientifico() {
	return nCientifico;
}

public void setNCientifico(String nCientifico) {
	this.nCientifico = nCientifico;
}

public double getSize() {
	return size;
}

public void setSize(double size) {
	this.size = size;
}

public float getCanAgua() {
	return canAgua;
}

public void setCanAgua(int canAgua) {
	this.canAgua = canAgua;
}

public boolean getExterior() {
	return exterior;
}

public void setExterior(boolean exterior) {
	this.exterior = exterior;
}}