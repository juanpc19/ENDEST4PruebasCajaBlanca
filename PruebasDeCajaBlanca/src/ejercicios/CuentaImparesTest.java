package ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CuentaImparesTest {

	@ParameterizedTest
	@MethodSource("cuentaImpares")

	void testCuentaImpares(int num, int esperado) {
		
		CuentaImpares suma = new CuentaImpares();
		
		int resultadoEsperado=suma.cuentaImpares(num);
		
		assertEquals(esperado,resultadoEsperado);
	}

	private static Stream<Arguments> cuentaImpares() {
		return Stream.of(Arguments.of(0, 0), Arguments.of(1, 0), Arguments.of(2, 2), Arguments.of(3, 2));
	}

}
