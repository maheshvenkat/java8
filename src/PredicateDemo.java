import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
        Predicate<String> checkString = (input) -> {
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if("012345656".indexOf(c) == -1) {
                   return false;
                }
            }
            return true;
        };
        System.out.println("String valid : "+ checkString.test("12345"));
        System.out.println("String valid : "+checkString.test("abcdrd"));
    }
}
