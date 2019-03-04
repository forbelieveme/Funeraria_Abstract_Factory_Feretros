package fabrica;

import partes.*;
import metal.*;

public class FabricaConcretaMetal implements FabricaAbstracta {

	@Override
	public Anclajes fabricarAnclaje(int resistencia) {
		return new Anclaje_Metal(resistencia);
	}

	@Override
	public SuperficieTapa fabricarSuperficieTapa(int ancho, int largo) {
		return new SuperficieTapa_Metal(ancho, largo);
	}

	@Override
	public EstructuraBase fabricarEstructuraBase(int ancho, int largo, int alto) {
		return new EstructuraBase_Metal(ancho, largo, alto);
	}


}
