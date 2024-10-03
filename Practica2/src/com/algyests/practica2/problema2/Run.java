package com.algyests.practica2.problema2;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

// José Miguel Comprés Arias - 10153259
// Adrian Cruz Santana - 10154816

public class Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Estudiante> ests = new ArrayList<Estudiante>();
		int n;
		System.out.print("Digite la cantidad de estudiantes que desea generar: ");
		n = sc.nextInt();
		
		for (int i = 0; i<n; i++) ests.add(new Estudiante((int)(Math.random()*5000)+2000,"Estudiante #"+(i+1),(double)((Math.random()*4))));
		System.out.println();
		System.out.println("Estudiantes generados: ");
		for (int i = 0; i<n; i++) System.out.println(ests.get(i).toString());
		System.out.println();
		System.out.print("Desea que el orden sea (1)ascendente o (2)descendente? ");
		int option = 0;
		while(option != 1 && option!=2) option = sc.nextInt();
		System.out.println();
		
		if (option == 1) ests = Solve.ordenarQS(ests, true);
		else ests = Solve.ordenarQS(ests, false);
		
		System.out.println("Estudiantes ordenados");
		for (int i = 0; i<n; i++) System.out.println(ests.get(i).toString());

	}

}
