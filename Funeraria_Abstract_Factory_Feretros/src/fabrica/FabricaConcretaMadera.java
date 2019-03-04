package fabrica;

import madera.*;
import partes.*;

public class FabricaConcretaMadera implements FabricaAbstracta {

	@Override
	public Anclajes fabricarAnclaje(int resistencia) {
		return new Anclaje_Madera(resistencia);
	}

	@Override
	public SuperficieTapa fabricarSuperficieTapa(int ancho, int largo) {
		return new SuperficieTapa_Madera(ancho, largo);
	}

	@Override
	public EstructuraBase fabricarEstructuraBase(int ancho, int largo, int alto) {
		return new EstructuraBase_Madera(ancho, largo, alto);
	}


}
