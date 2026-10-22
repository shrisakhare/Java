public class Parameter {
    public static void main(String[] args) {
        int number = addition(4, 7);
        System.out.println("Addition of two numbers: " + number);
    }

    public static int addition(int a, int b) {
        int sum = a + b;
        return sum;
    }
}