import java.util.function.Function;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {
        Function<Integer, String> spacer = (count) -> {
            StringBuilder sb = new StringBuilder(count);
            for (int i = 0; i < count ; i++) {
                sb.append(" ");

            }
            return sb.toString();
        };

        int lineLength = 60;
        Consumer<String> printCentered = (input) -> {
            int length = input.length();
            String spaces = spacer.apply(lineLength - length/2);
            System.out.println(spaces + input);
        };

        printCentered.accept("This is Master Stroke Project");
        printCentered.accept("Lambda Expression");
        printCentered.accept("Next project on AI");


    }
}
