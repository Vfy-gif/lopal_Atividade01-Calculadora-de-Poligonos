package br.senai.sp.jandira.calculo_poligonos.dao;

import java.util.Scanner;

import br.senai.sp.jandira.calculo_poligonos.model.Circunferencia;
import br.senai.sp.jandira.calculo_poligonos.ui.Menu;

public class CircunferenciaDao {

	public static void criar() {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o raio da circunferência: ");
		
		Circunferencia circunferencia = new Circunferencia();
		
		circunferencia.setRaio(leitor.nextDouble());
		circunferencia.exibirDados();
		
		Menu.retornar();
		
	}
}
