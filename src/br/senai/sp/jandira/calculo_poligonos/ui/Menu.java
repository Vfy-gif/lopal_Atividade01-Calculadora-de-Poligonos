package br.senai.sp.jandira.calculo_poligonos.ui;

import java.util.Scanner;

import br.senai.sp.jandira.calculo_poligonos.dao.CircunferenciaDao;
import br.senai.sp.jandira.calculo_poligonos.dao.QuadradoDao;
import br.senai.sp.jandira.calculo_poligonos.dao.RetanguloDao;
import br.senai.sp.jandira.calculo_poligonos.dao.TrapezioDao;
import br.senai.sp.jandira.calculo_poligonos.dao.TrianguloDao;

public class Menu {
	
	public static void criarMenu() {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("-------------------------");
		System.out.println("Calculadora de Polígonos");
		System.out.println("-------------------------");
		System.out.println("1 - Quadrado");
		System.out.println("2 - Retângulo");
		System.out.println("3 - Triângulo");
		System.out.println("4 - Trapézio");
		System.out.println("5 - Circunferência");
		System.out.println("-------------------------");
		System.out.print("Escolha uma opção (1-5): ");
		
		int opcao = leitor.nextInt();
		
		if (opcao == 1) {
			QuadradoDao.criar();
		} else if (opcao == 2) {
			RetanguloDao.criar();
		} else if (opcao == 3) {
			TrianguloDao.criar();
		} else if (opcao == 4) {
			TrapezioDao.criar();
		} else if (opcao == 5) {
			CircunferenciaDao.criar();
		} else {
			System.out.println("Opção inválida! Você deve escolher um número entre 1 e 5!");
		}
		
	}
	
}
