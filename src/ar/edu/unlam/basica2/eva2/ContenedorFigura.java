package ar.edu.unlam.basica2.eva2;

import java.util.ArrayList;
import java.util.LinkedList;

public class ContenedorFigura {

	private ArrayList <Figura> contenedorDeFiguras;
	
	public ContenedorFigura () {
		contenedorDeFiguras = new ArrayList <Figura>();
	}
	
	public Boolean agregar (Figura figura) {
		return this.contenedorDeFiguras.add(figura);
	}
	
	public ArrayList <Rectangulo> obtenerRectangulos (){
		ArrayList <Rectangulo> Rectangulos = new ArrayList <Rectangulo>();
		
		for (Figura f : contenedorDeFiguras) {
			if(f instanceof Rectangulo) {
				Rectangulos.add((Rectangulo) f);
			}
		}
		return Rectangulos;
	}
	
	public LinkedList <Circulo> obtenerCirculos() {
		LinkedList <Circulo> Circulos = new LinkedList <Circulo>();
		
		for (Figura f : contenedorDeFiguras) {
			if(f instanceof Circulo) {
				Circulos.add((Circulo) f);
			}
		}
		return Circulos;
		
	}
	
	public Double calcularPromedioDeAreaDeTodasLasFiguras() {
		Double promedio;
		Double area;
		Double totalDeArea = 0.0;
		for(Figura f : contenedorDeFiguras) {
			area = f.calcularElArea();
			totalDeArea += area;
		}
		promedio = totalDeArea/contenedorDeFiguras.size();
		return promedio;
	}
	
	
}
