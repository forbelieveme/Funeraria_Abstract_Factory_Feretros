package metal;

import partes.EstructuraBase;

public class EstructuraBase_Metal extends EstructuraBase{

	public EstructuraBase_Metal(int ancho, int largo, int alto) {
		super(ancho, largo, alto);
	}

	@Override
	public String caracteristicasMostrar() {
		return "Metal; Ancho: "+ancho+" Largo: "+largo+ " Alto: "+alto;
	}

}
