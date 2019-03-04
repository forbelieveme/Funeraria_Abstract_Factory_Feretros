package main;

import fabrica.FabricaAbstracta;
import fabrica.FabricaConcretaMetal;
import fabrica.FabricaConcretaMadera;
import fabrica.FabricaConcretaMaterialOrganico;
import partes.EstructuraBase;
import partes.Anclajes;
import partes.SuperficieTapa;
import singleton.Impresora;

public class Prueba_Feretro_Abstract_Factory {

	public static void main(String[] args) {

		FabricaAbstracta objFabricaMadera = new FabricaConcretaMadera();
		FabricaAbstracta objFabricaMetal = new FabricaConcretaMetal();
		FabricaAbstracta objFabricaMaterialOrganico = new FabricaConcretaMaterialOrganico();

		Anclajes anclaje;
		Anclajes anclaje1;
		Anclajes anclaje2;
		EstructuraBase estructuraBase;
		EstructuraBase estructuraBase1;
		EstructuraBase estructuraBase2;
		SuperficieTapa superficieTapa;
		SuperficieTapa superficieTapa1;
		SuperficieTapa superficieTapa2;

		anclaje = objFabricaMadera.fabricarAnclaje(200);
		estructuraBase = objFabricaMadera.fabricarEstructuraBase(2, 3, 1);
		superficieTapa = objFabricaMadera.fabricarSuperficieTapa(2, 3);

		anclaje1 = objFabricaMetal.fabricarAnclaje(300);
		estructuraBase1 = objFabricaMetal.fabricarEstructuraBase(3, 4, 1);
		superficieTapa1 = objFabricaMetal.fabricarSuperficieTapa(3, 4);

		anclaje2 = objFabricaMaterialOrganico.fabricarAnclaje(150);
		estructuraBase2 = objFabricaMaterialOrganico.fabricarEstructuraBase(3, 6, 1);
		superficieTapa2 = objFabricaMaterialOrganico.fabricarSuperficieTapa(3, 6);

		Impresora.getInstance().imprimir(anclaje.caracteristicasMostrar());
		Impresora.getInstance().imprimir(estructuraBase.caracteristicasMostrar());
		Impresora.getInstance().imprimir(superficieTapa.caracteristicasMostrar());

		Impresora.getInstance().imprimir(anclaje1.caracteristicasMostrar());
		Impresora.getInstance().imprimir(estructuraBase1.caracteristicasMostrar());
		Impresora.getInstance().imprimir(superficieTapa1.caracteristicasMostrar());

		Impresora.getInstance().imprimir(anclaje2.caracteristicasMostrar());
		Impresora.getInstance().imprimir(estructuraBase2.caracteristicasMostrar());
		Impresora.getInstance().imprimir(superficieTapa2.caracteristicasMostrar());

	}

}
