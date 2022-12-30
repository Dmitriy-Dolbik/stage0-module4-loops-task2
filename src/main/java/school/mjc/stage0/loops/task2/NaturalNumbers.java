package school.mjc.stage0.loops.task2;

public class NaturalNumbers {
    public static void main(String[] args) {
        NaturalNumbers naturalNumbers = new NaturalNumbers();
        naturalNumbers.naturalNumbersPrinter(20);
    }
    public void naturalNumbersPrinter(int lastPrinted) {
        int counter =0;
        while (counter <= lastPrinted){
            System.out.println(counter);
            counter++;
        }

    }
}
