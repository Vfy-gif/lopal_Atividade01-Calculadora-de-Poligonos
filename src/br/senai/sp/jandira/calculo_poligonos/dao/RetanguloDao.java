package br.senai.sp.jandira.calculo_poligonos.dao;

import java.util.Scanner;

import br.senai.sp.jandira.calculo_poligonos.model.Retangulo;
import br.senai.sp.jandira.calculo_poligonos.ui.Menu;

public class RetanguloDao {

	public static void criar() {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Criando Retangulo...");
		
		Retangulo retangulo = new Retangulo();
		
		System.out.print("Digite a medida da altura do Retangulo: ");
		
		retangulo.setAltura(leitor.nextDouble());
		
		System.out.print("Digite a medida da largura do Retangulo: ");
		
		retangulo.setLargura(leitor.nextDouble());
		
		retangulo.exibirDados();
			
		Menu.retornar();

	}
}
