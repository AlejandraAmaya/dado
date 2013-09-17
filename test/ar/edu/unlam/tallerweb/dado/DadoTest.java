package ar.edu.unlam.tallerweb.dado;

import org.junit.Assert;
import org.junit.Test;

public class DadoTest {
	
	@Test
	public void testQueMiCaraDaUnValorEntreUnoYSeis() {
		
		//1. Preparaci�n
		Dado miDado = new Dado(6);
		Integer min = 1;
		Integer max = 6;
				
		//2. Ejecuci�n
		Integer miCaraDado = miDado.tirar();

		//3. Contrastaci�n
		Assert.assertTrue("El valor est� entre 1 y 6", miCaraDado>=min && miCaraDado <=max);
				
		//4. Limpieza
		miDado = null;
	}

}
