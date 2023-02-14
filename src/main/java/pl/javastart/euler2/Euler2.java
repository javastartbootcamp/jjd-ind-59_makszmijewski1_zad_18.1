package pl.javastart.euler2;

public class Euler2 {

    public double calculateEvenFibonacciNumbers(double userInput) {
        double num1 = 0;
        double num2 = 1;
        double sum = 0;
        while (num1 < userInput) {
            if (num1 % 2 == 0) {
                sum = sum + num1;
            }
            double num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
        return sum;
    }

    public static void main(String[] args) {
        Euler2 euler2 = new Euler2();
        System.out.println(euler2.calculateEvenFibonacciNumbers(4000000));
    }
}
