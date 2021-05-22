package ar.edu.unlam.basica2.eva2;

public class Rectangulo extends Figura {
	
	private Double ladoA, ladoB;
	
	public Rectangulo(Double ladoA, Double ladoB,String Color){
		super(Color);
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}

	@Override
	public Double calcularElArea() {
		Double areaRectangulo;
		
		areaRectangulo = ladoA * ladoB;
		
		return areaRectangulo;
	}

	@Override
	public Double calcularElPerimetro() {
		Double perimetroRectangulo;
		
		perimetroRectangulo = (2 * ladoA) + (2 * ladoB);
		
		return perimetroRectangulo;
	}

	@Override
	public String dibujarFigura() {
		return this.getClass().getName();
	}

	
	


}
