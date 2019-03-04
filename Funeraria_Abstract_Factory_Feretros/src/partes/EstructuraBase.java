package partes;

public abstract class EstructuraBase {

	protected int ancho;
	protected int largo;
	protected int alto;

	public EstructuraBase(int ancho, int largo, int alto) {
		this.ancho = ancho;
		this.largo = largo;
		this.alto = alto;
	}
	
	public abstract String caracteristicasMostrar();

}
