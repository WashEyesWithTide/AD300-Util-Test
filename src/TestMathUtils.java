public class TestMathUtils {
    public static void main(String[] args) {
        System.out.println(MathUtils.add(2, 3));
        System.out.println(MathUtils.add(-1, 1));

        System.out.println(MathUtils.subtract(5, 3));
        System.out.println(MathUtils.subtract(0, 0));

        System.out.println(MathUtils.multiply(4, 2));
        System.out.println(MathUtils.multiply(-1, 3));

        System.out.println(MathUtils.divide(6, 2));
        try {
            System.out.println(MathUtils.divide(5, 0));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
