package material_organico;

import partes.Anclajes;

public class Anclaje_Material_Organico extends Anclajes{

	public Anclaje_Material_Organico(int resistencia) {
		super(resistencia);
	}

	@Override
	public String caracteristicasMostrar() {
		return "Material Organico; Resistencia en Newtons: "+resistencia;
	}

}
