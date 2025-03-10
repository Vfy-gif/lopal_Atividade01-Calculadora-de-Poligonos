package br.senai.sp.jandira.calculo_poligonos.model;

public class Trapezio {

	private double baseMenor;
	private double baseMaior;
	private double altura;
	
	public void setAltura (double altura) {
		this.altura = altura;
	}
	
	public void setBaseMaior (double baseMaior) {
		this.baseMaior = baseMaior;
	}
	
	public void setBaseMenor (double baseMenor) {
		this.baseMenor = baseMenor;
	}
	
	public double calcularArea() {
		double area = baseMenor + baseMaior * altura/2;
		return area;
	}

	public void exibirDados() {
		System.out.println("-----------------------");
		System.out.println("Dados do Trapézio");
		System.out.println("Tamanho da base menor: " + baseMenor);
		System.out.println("Tamanho da base maior: " + baseMaior);
		System.out.println("Tamanho da altura: " + altura);
		System.out.println("Área total: " + calcularArea());
		System.out.println("-----------------------");
	}
}
