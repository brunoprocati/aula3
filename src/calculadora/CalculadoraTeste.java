package calculadora;

import org.junit.Assert;
import org.junit.Test;



public class CalculadoraTeste {
	
	@Test
	public void testSomar() {
		int numero1=2;
		int numero2=3;
		Calculadora calc = new Calculadora();
		int resultado = calc.somar(numero1, numero2);
		Assert.assertEquals(5, resultado);
	}

}