package recursao;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class TestarMetodosRecursivos {
	
	private MetodosRecursivos metodos;

	@Before
	public void setUp()  {
		metodos = new MetodosRecursivos();
	}

	@Test
	public void testarSomaArray() {
		int[] array = {1, 2, 3, 4, 5};
		int result = metodos.calcularSomaArray(array);
		assertEquals(15, result);
	}

	@Test
	public void testarFatorial() {
		int result = metodos.calcularFatorial(5);
		assertEquals(120, result);
	}

	@Test
	public void testarFibonacci() {
		int result = metodos.calcularFibonacci(12);
		assertEquals(144, result);
	}

	@Test
	public void testarCountNotNull() {
		Object[] array = {1, 2, null, 4, 5};
		int result = metodos.countNotNull(array);
		assertEquals(4, result);
	}

	@Test
	public void testarPotenciaDe2() {
		int result = metodos.potenciaDe2(5);
		assertEquals(32, result);
	}

	@Test
	public void testarPotenciaDe2_2() {
		int result = metodos.potenciaDe2(0);
		assertEquals(1, result);
	}
}
