package partes;

public abstract class SuperficieTapa {

	protected int ancho;
	protected int largo;

	public SuperficieTapa(int ancho, int largo) {
		this.ancho = ancho;
		this.largo = largo;
	}

	public abstract String caracteristicasMostrar();

}
