package fabrica;

import partes.*;


public interface FabricaAbstracta {
    
    Anclajes fabricarAnclaje(int resistencia);
    
    SuperficieTapa fabricarSuperficieTapa(int ancho, int largo);

    EstructuraBase fabricarEstructuraBase(int ancho, int largo, int alto);

}

