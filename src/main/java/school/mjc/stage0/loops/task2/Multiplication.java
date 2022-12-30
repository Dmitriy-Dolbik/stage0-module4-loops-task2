package school.mjc.stage0.loops.task2;

public class Multiplication {
    public static void main(String[] args) {
        Multiplication multiplication = new Multiplication();
        multiplication.printMultiplied(3);
    }

    public void printMultiplied(int multiplyByAndToInclusive) {
        int multiplication = 1;
        int counter = 1;
        while (counter <= Math.abs(multiplyByAndToInclusive)) {
            multiplication = multiplication * counter;
            counter++;
        }
        if (multiplyByAndToInclusive < 0 && !(multiplyByAndToInclusive % 2 == 0)) {
            multiplication = multiplication * -1;
        }
        System.out.println(multiplication);
    }
}
