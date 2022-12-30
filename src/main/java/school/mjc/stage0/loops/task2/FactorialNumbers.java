package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public static void main(String[] args) {
        FactorialNumbers factorialNumbers = new FactorialNumbers();
        factorialNumbers.printFactorialRow(5);
    }
    public void printFactorialRow(int printToInclusive) {
        int multiplication = 1;
        int counter = 1;
        System.out.println("1");
        while (counter <= printToInclusive) {
            multiplication = multiplication * counter;
            System.out.println(multiplication);
            counter++;
        }

    }
}
