package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public static void main(String[] args) {
        WordsBuilder wordsBuilder = new WordsBuilder();
        wordsBuilder.buildPhrase('s','d','a','g',' ');
    }
    public void buildPhrase(char... chars) {
        int counter = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (counter < chars.length){
            for (int i = 0; i < chars.length; i++) {
                stringBuilder.append(chars[i]);
                counter++;
            }
            if (chars[chars.length - 1] ==' '){
                stringBuilder.setLength(stringBuilder.length() - 1);
            }

        }
        System.out.print(stringBuilder);
    }
}
