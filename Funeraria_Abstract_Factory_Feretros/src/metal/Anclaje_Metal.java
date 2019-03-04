package metal;

import partes.Anclajes;

public class Anclaje_Metal extends Anclajes{

	public Anclaje_Metal(int resistencia) {
		super(resistencia);
	}

	@Override
	public String caracteristicasMostrar() {
		return "Metal; Resistencia en Newtons: "+resistencia;
	}

}
