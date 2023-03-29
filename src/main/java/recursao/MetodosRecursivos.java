package recursao;

public class MetodosRecursivos {

	public MetodosRecursivos() {

	}

	public int calcularSomaArray(int[] array){
		return calculaSomaArray(array, 0);
	}

	private int calculaSomaArray(int[] array, int index) {
		int result = 0;
		if (index < array.length) {
			result = array[index] + calculaSomaArray(array, index + 1);
		}
		return result;
	}

	public int calcularFatorial(int n) {
		int result = 1;
		if (n == 1) {
			return 1;
		} else {
			result = n * calcularFatorial(n - 1);
		}
		return result;
	}

	public int calcularFibonacci(int n) {
		int result = 1;
		if (n == 1 || n == 2) {

		} else {
			result = calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
		}
		return result;
	}

	public int countNotNull(Object[] array) {
		return counterNotNull(array, 0);
	}

	private int counterNotNull (Object[] array, int index) {
		int result = 0;
		if (array[index] != null) {
			result++;
		}
		if (index != array.length - 1) {
			result = result + counterNotNull(array, index + 1);
		}
		return result;
	}

	public int potenciaDe2(int expoente) {
		int result = 1;
		if (expoente == 0) {
		} else {
			result = 2 * potenciaDe2(expoente - 1);
		}
		return result;
	}

	public double progressaoAritmetica(double termoInicial, double razao, int n) {
		double result = 0;
		if (n == 1) {
			result = termoInicial;
		} else {
			result = progressaoAritmetica(termoInicial, razao, n - 1) + razao;
		}
		return result;
	}

	public double progressaoGeometrica(double termoInicial, double razao, int n) {
		double result = 1;
		if (n == 1) {
			result = termoInicial;
		} else {
			result = progressaoGeometrica(termoInicial, razao, n - 1) * razao;
		}
		return result;
	}
	
	
}
