package madera;

import partes.Anclajes;

public class Anclaje_Madera extends Anclajes{

	public Anclaje_Madera(int resistencia) {
		super(resistencia);
	}

	@Override
	public String caracteristicasMostrar() {
		return "Madera; Resistencia en Newtons: "+resistencia;
	}

}
