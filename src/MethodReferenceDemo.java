import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {
    @FunctionalInterface
    public interface StringListFormatter {
        String format(String delimiter, List<String> list);
    }

    public static void formatPrint(StringListFormatter formatter, String delimiter, List<String> list) {
        String formattedString = formatter.format(delimiter, list);
        System.out.println(formattedString);
    }

    public static void main(String[] args) {
       List<String> arrListName = Arrays.asList("Lily", "Mack","Picky");

       formatPrint(String::join,", ", arrListName);
    }


}
