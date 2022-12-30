package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public static void main(String[] args) {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.printPrimeNumbers(20);
    }

    public void printPrimeNumbers(int printToInclusive) {
        int counter = 1;
        while (counter <= printToInclusive) {
            int counterPrime = 0;
            for (int i = 1; i <= counter; i++) {
                if (counter % i == 0) {
                    counterPrime++;
                }
            }
            if (counterPrime == 2) {
                System.out.println(counter);
            }
            counter++;
        }
    }
}
