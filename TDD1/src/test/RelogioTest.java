package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.Relogio;

public class RelogioTest {
	
	@Test
	public void testeConfigurarRelogio() {
		Relogio relogioteste = new Relogio();
		
		relogioteste.configurarRelogio(14, 30, 45);
		
		assertEquals(14, relogioteste.getHoras());
		assertEquals(30, relogioteste.getMinutos());
		assertEquals(45, relogioteste.getSegundos());
	}

}
