package material_organico;

import partes.SuperficieTapa;

public class SuperficieTapa_Material_Organico extends SuperficieTapa{

	public SuperficieTapa_Material_Organico(int ancho, int largo) {
		super(ancho, largo);
	}

	@Override
	public String caracteristicasMostrar() {
		return "Material Organico; Ancho: "+ancho+" Largo: "+largo;
	}

}
