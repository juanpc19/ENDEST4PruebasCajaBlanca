package ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SumaNumerosTest {

	@ParameterizedTest
	@MethodSource("sumaNumeros")

	void testSumaNumeros(int num, int esperado) {
		
		SumaNumeros suma = new SumaNumeros();
		
		int resultadoEsperado=suma.sumaNumeros(num);
		
		assertEquals(esperado,resultadoEsperado);
	}

	private static Stream<Arguments> sumaNumeros() {
		//modificar ultimo argumento  de a 4 para provocar fallo
		return Stream.of(Arguments.of(0, 0), Arguments.of(1, 0), Arguments.of(2, 2), Arguments.of(3, 2));
	}
}
