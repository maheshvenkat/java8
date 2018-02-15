import java.util.Arrays;
import java.util.List;

public class NoMethodRef {

    @FunctionalInterface
    public interface StringListFormatter {
        String format(String delimiter, List<String> list);
    }
    public static void formatPrint(StringListFormatter formatter, String delimiter, List<String> list) {
        String formattedString = formatter.format(delimiter, list);
        System.out.println(formattedString);
    }

    public static void main(String[] args) {
        List<String> arrList = Arrays.asList("John","Paul","Amy");

        StringListFormatter formatter = (delimiter, list) -> {
            StringBuilder sb = new StringBuilder(20);
            int size = list.size();

            for (int i = 0; i < size; i++) {
                sb.append(list.get(i));
                if(i < size -1) {
                    sb.append(delimiter);
                }
            }

            return sb.toString();
        };

        formatPrint(formatter, ", ", arrList);
    }




}
