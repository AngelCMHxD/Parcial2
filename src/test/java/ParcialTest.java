import me.angel.logica.Parcial;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class ParcialTest {
    @Test
    @DisplayName("reales")
    public void testCalcularRaices() {
        double a = 1;
        double b = -3;
        double c = 2;
        assertEquals("x = 2.0, x = 1.0", Parcial.calcularRaices(a, b, c));
    }

    @Test
    @DisplayName("raices complejas")
    public void testCalcularRaicesComplejas() {
        double a = 1;
        double b = 1;
        double c = 1;

        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> Parcial.calcularRaices(a, b, c));
        assertEquals("las raices son complejas", e.getMessage());
    }

    @Test
    @DisplayName("a = 0")
    public void testCalcularRaicesAEsCero() {
        double a = 0;
        double b = 1;
        double c = 1;

        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> Parcial.calcularRaices(a, b, c));
        assertEquals("a no puede ser cero", e.getMessage());
    }
}
