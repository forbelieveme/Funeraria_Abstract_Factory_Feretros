package fabrica;

import partes.*;
import material_organico.*;

public class FabricaConcretaMaterialOrganico implements FabricaAbstracta {

	@Override
	public Anclajes fabricarAnclaje(int resistencia) {
		return new Anclaje_Material_Organico(resistencia);
	}

	@Override
	public SuperficieTapa fabricarSuperficieTapa(int ancho, int largo) {
		return new SuperficieTapa_Material_Organico(ancho, largo);
	}

	@Override
	public EstructuraBase fabricarEstructuraBase(int ancho, int largo, int alto) {
		return new EstructuraBase_Material_Organico(ancho, largo, alto);
	}


}
