package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public static void main(String[] args) {
        EvenNumbersPrinter evenNumbersPrinter = new EvenNumbersPrinter();
        evenNumbersPrinter.printEvenNumbers(20);
    }
    public void printEvenNumbers(int printTillInclusive) {
        int counter = 0;
        while (counter <= printTillInclusive){
            if (counter%2 ==0){
                System.out.println(counter);
            }
            counter++;
        }

    }
}
