package madera;

import partes.SuperficieTapa;

public class SuperficieTapa_Madera extends SuperficieTapa{

	public SuperficieTapa_Madera(int ancho, int largo) {
		super(ancho, largo);
	}

	@Override
	public String caracteristicasMostrar() {
		return "Madera; Ancho: "+ancho+" Largo: "+largo;
	}

}
