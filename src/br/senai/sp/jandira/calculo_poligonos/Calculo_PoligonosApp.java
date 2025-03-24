package br.senai.sp.jandira.calculo_poligonos;

import java.util.Scanner;

import br.senai.sp.jandira.calculo_poligonos.model.Circunferencia;
import br.senai.sp.jandira.calculo_poligonos.model.Quadrado;
import br.senai.sp.jandira.calculo_poligonos.model.Retangulo;
import br.senai.sp.jandira.calculo_poligonos.model.Trapezio;
import br.senai.sp.jandira.calculo_poligonos.model.Triangulo;
import br.senai.sp.jandira.calculo_poligonos.ui.Menu;

public class Calculo_PoligonosApp {

	public static void main(String[] arg) {

		// Looping / Laços de repetição

		int contador = 1;
		while (contador <= 15) {
			System.out.println("Senai jandira - " + contador);
			contador = contador + 1;
		}

		String resposta = "s";
		while (resposta.equals("s")) {
			System.out.println("Estamos dando voltas");
			System.out.println("Gostaria de dar uma volta (s/n)");
			Scanner leitor = new Scanner(System.in);
			resposta = leitor.next();
		}

//		System.out.println("------Tabuada do 9------");
//		int resultado = 1;
//		int multiplicador = 0;
//		while (multiplicador <= 10) {
//			resultado = multiplicador * 9;
//			System.out.println(multiplicador + " x 9 = " + resultado);
//			multiplicador = multiplicador + 1;
//
//		}

		System.out.println("------Tabuada do 9------");
		contador = 0;
		while (contador <= 10) {
			int resultado = 9 * contador;
			System.out.println("9 x " + contador + " = " + resultado);
			contador++;
		}
		// Menu.criarMenu();

	}

}
