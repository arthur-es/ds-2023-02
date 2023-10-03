import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NewtonTest {

    @Test
    public void testRaizQuadrada() {
        Assertions.assertEquals(1.4142135623730951, Newton.raizQuadrada(2.0, 1e-10));
        Assertions.assertEquals(3.1622776601683795, Newton.raizQuadrada(9.0, 1e-10));
        Assertions.assertEquals(10.0, Newton.raizQuadrada(100.0, 1e-10));
    }
}
