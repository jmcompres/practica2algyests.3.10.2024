package com.algyests.practica2.problema2;

import java.util.ArrayList;
import java.util.List;

public class Solve {

	
	public static List<Estudiante> ordenarQS(List<Estudiante> listaSinOrdenar, boolean ascendente)
	{
		List<Estudiante> ordenada = new ArrayList<Estudiante>();
		List<Estudiante> menores = new ArrayList<Estudiante>();
		List<Estudiante> mayores = new ArrayList<Estudiante>();
		
		if (listaSinOrdenar.size()<2) return listaSinOrdenar;
		
		Estudiante pivot = listaSinOrdenar.get(0);
		double pivotInd = pivot.indiceAcademico;
		
		for (int i = 1; i<listaSinOrdenar.size(); i++)
	    {
	       if (listaSinOrdenar.get(i).indiceAcademico<=pivotInd)
	    	   menores.add(listaSinOrdenar.get(i));
	       else mayores.add(listaSinOrdenar.get(i));
	    }
		
		menores = ordenarQS(menores,ascendente);
		mayores = ordenarQS(mayores,ascendente);
		
		if (ascendente) for(int i = 0; i<menores.size(); i++) ordenada.add(menores.get(i));
		else for (int i = 0; i<mayores.size(); i++) ordenada.add(mayores.get(i));
		ordenada.add(pivot);
		if (ascendente) for(int i = 0; i<mayores.size(); i++) ordenada.add(mayores.get(i));
		else for (int i = 0; i<menores.size(); i++) ordenada.add(menores.get(i));
		
		return ordenada;
	}

}
