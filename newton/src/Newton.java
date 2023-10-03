public class Newton {

    public static void main(String[] args) {
        double a = 2.0;
        double epsilon = 0.0001;

        double raiz = raizQuadrada(a, epsilon);

        System.out.println("A raiz quadrada de " + a + " é " + raiz);
    }

    public static double raizQuadrada(double a, double epsilon) {
        double x = a / 2.0;

        while (Math.abs(x * x - a) > epsilon) {
            x = x - (x * x - a) / (2 * x);
        }

        return x;
    }
}
