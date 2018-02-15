import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo1 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("John", "Mike", "Pat");

        names.forEach((name)->System.out.println(name));
        names.forEach(System.out::println);

       String [] strList = {"Software", "Hardware", "Networking"};
       Arrays.sort(strList, String::compareToIgnoreCase);
       for (String list : strList) {
           System.out.println(list);
       }
    }

}
