package br.senai.sp.jandira.calculo_poligonos.dao;

import java.util.Scanner;

import br.senai.sp.jandira.calculo_poligonos.model.Triangulo;

public class TrianguloDao {

	public static void criar() {
	
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Criando Triangulo...");
		
		Triangulo triangulo = new Triangulo();
		
		System.out.print("Digite a medida da largura do Triangulo");
		
		triangulo.setLargura(leitor.nextDouble());
		
		System.out.print("Digite a medida da altura do Triangulo");
		
		triangulo.setAltura(leitor.nextDouble());
		triangulo.exibirDados();
		
	}
}
