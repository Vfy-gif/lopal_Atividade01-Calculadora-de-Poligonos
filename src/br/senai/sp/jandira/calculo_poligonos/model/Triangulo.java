package br.senai.sp.jandira.calculo_poligonos.model;

public class Triangulo {

	private double largura;
	private double altura;
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	public double calcularArea() {
		double area = largura * altura /2;
		return area;
	}
	
	public void exibirDados() {
		System.out.println("-----------------------");
		System.out.println("Dados do Triangulo");
		System.out.println("-----------------------");
		System.out.println("Tamanho da Largura: " + largura);
		System.out.println("Tamanho da Altura: " + altura);
		System.out.println("Área total: " + calcularArea());
		System.out.println("-----------------------");
	}
	
}
