import org.junit.Test;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class FilenameFilterTest {

    @Test
    public void testFileListWithoutFilter() {
        File dir = new File("src");
        String [] fileNames = dir.list();
        System.out.println("List of Files "+ Arrays.asList(fileNames));

    }

    @Test
    public void testFileListWithAnonymousClassFilter() {
        File dir = new File("src");
        String [] fileNames = dir.list(new FilenameFilter() {
            @Override
            public boolean accept(File file, String s) {
                return s.endsWith("java");
            }
        });
        System.out.println("List of Files "+ Arrays.asList(fileNames));

    }

    @Test
    public void testFileListWithLambdaExpressionFilter() {
        File dir = new File("src");
        String [] fileNames = dir.list((File directory, String name)-> name.endsWith("java"));
        System.out.println("List of Files "+ Arrays.asList(fileNames));

    }

    @Test
    public void testFileListWithLambdaBlockFilter() {
        File dir = new File("src");
        String [] fileNames = dir.list((File directory, String name)-> {
            return name.endsWith("java");
        });
        System.out.println("List of Files "+ Arrays.asList(fileNames));

    }

    @Test
    public void testFileListWithFilterAssignment() {
        File dir = new File("src");
        FilenameFilter filter = (directory, name) -> name.endsWith("java");
        String [] fileNames = dir.list(filter);

        System.out.println("List of Files "+ Arrays.asList(fileNames));

    }


}
