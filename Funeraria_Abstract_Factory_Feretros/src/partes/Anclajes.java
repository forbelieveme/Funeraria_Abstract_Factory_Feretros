package partes;

public abstract class Anclajes {

	protected int resistencia;

	public Anclajes(int resistencia) {
		this.resistencia = resistencia;
	}
	
	public abstract String caracteristicasMostrar();

}
