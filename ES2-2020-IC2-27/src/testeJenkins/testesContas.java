package testeJenkins;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testesContas {

	teste t = new teste(3,5);
	
	@Test
	void somaTest() {
		assertEquals(8, t.soma());
	}
	
	@Test
	void multiplicarTest() {
		assertEquals(15, t.multiplicar());
	}
	
	@Test
	void subtracaoTest() {
		assertEquals(-2, t.subtracao());
	}

}
