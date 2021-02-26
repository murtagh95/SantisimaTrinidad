/**
 * 
 */

/**
 * @author ASUS
 *
 */
public class Calculo {

	public static void main(String[] args) {
		
		// Declaro variables
		int baseInt = 18;
		int alturaInt = 12;
		float baseFloat = 18.1F;
		float alturaFloat = 12.1F;
		double baseDouble = 18.5;
		double alturaDouble = 12.5;
		
		// Llamo a los métodos de area rectangulo y visualizo el resultado por consola
		int areaInt = calculoAreaRectangulo(baseInt, alturaInt);
		System.out.println("El area del rectángulo es: " + areaInt);

		float areaFloat = calculoAreaRectangulo(baseFloat, alturaFloat);
		System.out.println("El area del rectángulo es: " + areaFloat);
		
		double areaDouble = calculoAreaRectangulo(baseDouble, alturaDouble);
		System.out.println("El area del rectángulo es: " + areaDouble);
		
		
		// Llamo a los métodos de area teangulo y visualizo el resultado por consola
		areaInt = calculoAreaTrianguloRectangulo(baseInt, alturaInt);
		System.out.println("El area del Triangulo rectángulo es: " + areaInt);
		
		areaFloat = calculoAreaTrianguloRectangulo(baseFloat, alturaFloat);
		System.out.println("El area del Triangulo rectángulo es: " + areaFloat);

		areaDouble = calculoAreaTrianguloRectangulo(baseDouble, alturaDouble);
		System.out.println("El area del Triangulo rectángulo es: " + areaDouble);
			
		// -------- USO POO --------
		// Instancio la clase
		Rectangulo recta = new Rectangulo(baseDouble, alturaDouble);
		// Llamo al método de la instancia y visualizo el resultado
		System.out.println("El area del objeto rectángulo es: " + recta.calculoArea());
		// LLamo al método estatico de la clase Rectangulo y muestro el resultado
		System.out.println("El area del objeto rectángulo es: " + Rectangulo.calculoArea(baseDouble, alturaDouble));
		
		// Instancio la clase
		TrianguloRectangulo Triangulorecta = new TrianguloRectangulo(baseDouble, alturaDouble);
		// Llamo al método de la instancia y visualizo el resultado
		System.out.println("El area del objeto Triangulo rectángulo es: " + Triangulorecta.calculoArea());
		// LLamo al método estatico de la clase TrianguloRectangulo y muestro el resultado
		System.out.println("El area del objeto Triangulo rectángulo es: " + TrianguloRectangulo.calculoArea(baseDouble, alturaDouble));
				
		
		
	}

	//Método para calcular el area de un rectangulo
	// Métodos con ingreso de datos enteros
	public static int calculoAreaRectangulo(int base, int altura) {
		return base * altura;
	}
	
	// Sobrecarga de métodos para recibir parametros float	
	public static float calculoAreaRectangulo(float base, float altura) {
		float resultado = base * altura;
		
		if(resultado > 124.5) {
			System.out.println("La superficie ha superado el valor permitido.");
			return 0;
		}
		else {
			return resultado;
		}
		
	}
	
	// Sobregarga de métodos para recibir parametros double
	public static double calculoAreaRectangulo(double base, double altura) {
		double resultado = base * altura;
		
		if(resultado > 367.5) {
			System.out.println("La superficie ha superado el valor permitido.");
			return 0;
		}
		else {
			return resultado;
		}
		
	}

	// Método para calcular el area de un triangulo Rectangulo
	// Métodos con ingreso de datos enteros
	public static int calculoAreaTrianguloRectangulo(int base, int altura) {
		return (int) (base * altura) / 2;
	}
		
	// Sobrecarga de métodos para recibir parametros float	
	public static float calculoAreaTrianguloRectangulo(float base, float altura) {
		float resultado = (base * altura) / 2;
		
		if(resultado > 124.5) {
			System.out.println("La superficie ha superado el valor permitido.");
			return 0;
		}
		else {
			return resultado;
		}
			
	}
		
	// Sobregarga de métodos para recibir parametros double
	public static double calculoAreaTrianguloRectangulo(double base, double altura) {
		double resultado = (base * altura) / 2;
			
		if(resultado > 367.5) {
			System.out.println("La superficie ha superado el valor permitido.");
			return 0;
		}
		else {
			return resultado;
		}
			
	}
	

}

class Rectangulo{
	private double base, altura;
	
	// Método constructor
	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	// Métodod que calcula el area de rectangulo
	public double calculoArea() {
		double resultado = base * altura;
		
		if(resultado > 789.5) {
			System.out.println("La superficie ha superado el valor permitido.");
			return 0;
		}
		else {
			return resultado;
		}
	}
	
	// Método que no necesita instanciar un objeto que calcula el area
	static public double calculoArea(double base, double altura) {
		double resultado = base * altura;
		
		if(resultado > 789.5) {
			System.out.println("La superficie ha superado el valor permitido.");
			return 0;
		}
		else {
			return resultado;
		}
	}
	
}

class TrianguloRectangulo{
	private double base, altura;
	
	// Método constructor
	public TrianguloRectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	// Métodod que calcula el area de rectangulo
	public double calculoArea() {
		double resultado = (base * altura) / 2;
		
		if(resultado > 789.5) {
			System.out.println("La superficie ha superado el valor permitido.");
			return 0;
		}
		else {
			return resultado;
		}
	}
	
	// Método que no necesita instanciar un objeto que calcula el area
	static public double calculoArea(double base, double altura) {
		double resultado = (base * altura) / 2;
		
		if(resultado > 789.5) {
			System.out.println("La superficie ha superado el valor permitido.");
			return 0;
		}
		else {
			return resultado;
		}
	}
	
}
