package br.senai.sp.jandira.calculo_poligonos;

import br.senai.sp.jandira.calculo_poligonos.model.Circunferencia;
import br.senai.sp.jandira.calculo_poligonos.model.Quadrado;
import br.senai.sp.jandira.calculo_poligonos.model.Retangulo;
import br.senai.sp.jandira.calculo_poligonos.model.Trapezio;
import br.senai.sp.jandira.calculo_poligonos.model.Triangulo;

public class Calculo_PoligonosApp {
		
		public static void main(String[] arg) {
			
			Quadrado quadrado1 = new Quadrado();
			quadrado1.setLado(2);
			quadrado1.exibirDados();
			
			Retangulo retangulo1 = new Retangulo();
			retangulo1.setAltura(2);
			retangulo1.setLargura(5);
			retangulo1.exibirDados();
			
			Triangulo triangulo1 = new Triangulo();
			triangulo1.setAltura(5);
			triangulo1.setLargura(3);
			triangulo1.exibirDados();
			
			Trapezio trapezio1 = new Trapezio();
			trapezio1.setAltura(15);
			trapezio1.setBaseMaior(12);
			trapezio1.setBaseMenor(6);
			trapezio1.exibirDados();
			
			Circunferencia circunferencia1 = new Circunferencia();
			circunferencia1.setRaio(5);
			circunferencia1.exibirDados();
			
		}
		
}
