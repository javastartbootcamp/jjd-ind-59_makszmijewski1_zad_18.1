package pl.javastart.euler2;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Euler2Test {

    private Euler2 euler2 = new Euler2();
    @Test
    public void should10result10() {
        //when
        double result = euler2.calculateEvenFibonacciNumbers(10);
        //then
        Assertions.assertThat(result).isEqualTo(10);
    }

    @Test
    public void should35result44() {
        //when
        double result = euler2.calculateEvenFibonacciNumbers(35);
        //then
        Assertions.assertThat(result).isEqualTo(44);
    }

    @Test
    public void should34result10() {
        //when
        double result = euler2.calculateEvenFibonacciNumbers(34);
        //then
        Assertions.assertThat(result).isEqualTo(10);
    }

    @Test
    public void should1result0() {
        //when
        double result = euler2.calculateEvenFibonacciNumbers(1);
        //then
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void should2result0() {
        //when
        double result = euler2.calculateEvenFibonacciNumbers(2);
        //then
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void should3result2() {
        //when
        double result = euler2.calculateEvenFibonacciNumbers(3);
        //then
        Assertions.assertThat(result).isEqualTo(2);
    }
}