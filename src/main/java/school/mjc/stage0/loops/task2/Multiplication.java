package school.mjc.stage0.loops.task2;

public class Multiplication {
    public static void main(String[] args) {
        Multiplication multiplication = new Multiplication();
        multiplication.printMultiplied(5);
    }

    public void printMultiplied(int multiplyByAndToInclusive) {
        if (multiplyByAndToInclusive == 0){
            return;
        }
        int sum = 0;
        int counter = 0;
        while (counter <= Math.abs(multiplyByAndToInclusive)) {
            sum = counter*multiplyByAndToInclusive;
            System.out.println(sum);
            counter++;
        }
    }
}
