import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamFilterDemo {

    public static void main(String[] args) {
        Predicate<String> notEmptyLineOrComment = (line) -> line.trim().length() > 0
                && !line.trim().startsWith("#");


        try (FileReader fr = new FileReader("sample.txt");
             BufferedReader br = new BufferedReader(fr)) {
            Stream<String> lines = br.lines();
            lines.filter(notEmptyLineOrComment).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}


