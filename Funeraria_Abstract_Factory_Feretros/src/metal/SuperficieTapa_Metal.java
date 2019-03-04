package metal;

import partes.SuperficieTapa;

public class SuperficieTapa_Metal extends SuperficieTapa{

	public SuperficieTapa_Metal(int ancho, int largo) {
		super(ancho, largo);
	}

	@Override
	public String caracteristicasMostrar() {
		return "Metal; Ancho: "+ancho+" Largo: "+largo;
	}

}
