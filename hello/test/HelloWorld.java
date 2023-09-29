import org.junit.jupiter.api.Test;

public class HelloWorldTest {

    @Test
    public void testHelloWorld() {
        // Arrange
        String expectedOutput = "Olá mundo!";

        // Act
        String actualOutput = HelloWorld.main(null);

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }
}
