import cuenta.corriente.CuentaCorriente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCuenta {
    private CuentaCorriente cuenta;

    @BeforeEach
    void setUp() {
        CuentaCorriente cuenta = new CuentaCorriente(500, "Juan Pérez", "12345678A", "12345678Z");
    }

    @Test
    @DisplayName("Probar sacar dinero con saldo suficiente")
    void testSacarDineroConSaldoSuficiente() {
        boolean resultado = cuenta.sacarDinero(200);
        assertTrue(resultado, "El dinero debería haberse sacado correctamente");
        assertEquals(300, cuenta.getSaldo(), "El saldo debería ser 300 después de sacar 200");
    }
}

