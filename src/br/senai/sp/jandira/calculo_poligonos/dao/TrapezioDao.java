package br.senai.sp.jandira.calculo_poligonos.dao;

import java.util.Scanner;

import br.senai.sp.jandira.calculo_poligonos.model.Trapezio;
import br.senai.sp.jandira.calculo_poligonos.ui.Menu;

public class TrapezioDao {

	public static void criar() {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Criando Trapezio...");
		
		Trapezio trapezio = new Trapezio();
		
		System.out.print("Digite a medida altura do Trapezio");
		
		trapezio.setAltura(leitor.nextDouble());
		
		System.out.print("Digite a medida da base maior do Trapezio: ");
		
		trapezio.setBaseMaior(leitor.nextDouble());
		
		System.out.print("Digite a medida da base menor do Trapezio: ");
		
		trapezio.setBaseMenor(leitor.nextDouble());
		trapezio.exibirDados();
		
		Menu.retornar();
		
	}
}
