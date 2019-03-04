package madera;

import partes.EstructuraBase;

public class EstructuraBase_Madera extends EstructuraBase{

	public EstructuraBase_Madera(int ancho, int largo, int alto) {
		super(ancho, largo, alto);
	}

	@Override
	public String caracteristicasMostrar() {
		return "Madera; Ancho: "+ancho+" Largo: "+largo+ " Alto: "+alto;
	}

}
