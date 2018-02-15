import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamFilterDemo1 {

    public static void main(String[] args) {
        Path folderPath = Paths.get("..");

        try{
            Stream<Path> list = Files.walk(folderPath);
            list.filter((Path p) ->p.toString().endsWith(".java"))
                    .forEach(System.out::println);
        }
        catch(Exception e) {
            e.printStackTrace();
        }



    }
}
