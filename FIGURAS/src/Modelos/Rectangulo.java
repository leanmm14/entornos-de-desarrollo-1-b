package Modelos;

/**
 * Clase que representa un rectangulo. Contiene metodos para calcular su area y perimetro
 * @version 1.0
 * 
 * @author Leandro
 */
public class Rectangulo  extends Figuras{
	private double base;
	private double altura;
	
	/**
	 * Constructor por defecto. Crea un rectangulo con base y altura 1, en metros
	 */
	public Rectangulo() {
		this.base=1;
		this.altura=1;
	}
	/**
	 * Constructor que recibe como parametros la base y la altura del rectangulo, en metros
	 * @param base la base del rectangulo, en metros
	 * @param altura la altura del rectangulo en metros
	 */
	
	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	/**
	 * @see Modelos.Figuras#area()
	 */
	
	@Override
	public double area() {
		
		return base * altura;
	}

	/**
	 * @see Modelos.Figuras#perimetro()
	 */
	@Override
	public double perimetro() {
		
		return 2*base + 2*altura;
	}

}
