package school.mjc.stage0.loops.task2;

public class Multiplication {
    public static void main(String[] args) {
        Multiplication multiplication = new Multiplication();
        multiplication.printMultiplied(0);
    }

    public void printMultiplied(int multiplyByAndToInclusive) {
        int sum = 0;
        int counter = 1;
        while (counter <= Math.abs(multiplyByAndToInclusive)) {
            sum = sum + multiplyByAndToInclusive;
            System.out.println(sum);
            counter++;
        }
    }
}
