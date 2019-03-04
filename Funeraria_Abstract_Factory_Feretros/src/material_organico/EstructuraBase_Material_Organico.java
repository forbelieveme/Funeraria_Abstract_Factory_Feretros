package material_organico;

import partes.EstructuraBase;

public class EstructuraBase_Material_Organico extends EstructuraBase{

	public EstructuraBase_Material_Organico(int ancho, int largo, int alto) {
		super(ancho, largo, alto);
	}

	@Override
	public String caracteristicasMostrar() {
		return "Material Organico; Ancho: "+ancho+" Largo: "+largo+ " Alto: "+alto;
	}

}
