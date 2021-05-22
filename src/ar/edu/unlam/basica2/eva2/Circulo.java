package ar.edu.unlam.basica2.eva2;

import java.lang.Math;

public class Circulo extends Figura {
	
	private double radio;

	
	public Circulo(double radio,String color){
		super(color);
		this.radio = radio;
	}

	@Override
	public Double calcularElArea() {
		Double areaCirculo;
		
		areaCirculo = Math.PI * Math.pow(radio, 2);
		
		return areaCirculo;
	}

	@Override
	public Double calcularElPerimetro() {
		Double perimetroCirculo;
		
		perimetroCirculo =  2 * Math.PI * radio;
		
		return perimetroCirculo;
	}

	@Override
	public String dibujarFigura() {
		return this.getClass().getName();
	}

	
}
